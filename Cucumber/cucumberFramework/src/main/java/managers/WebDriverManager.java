package managers;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import dataProvider.ConfigFileReader;

public class WebDriverManager {

	 private WebDriver driver;
	 private static final String CHROME_DRIVER_PROPERTY = "webdriver.chrome.driver";
	 private static final String FIREFOX_DRIVER_PROPERTY = "webdriver.gecko.driver";
	 ConfigFileReader configFileReader;
	 private static String driverType;
	 
	 public WebDriverManager() {
		 configFileReader = FileReaderManager.getInstance();
		 driverType = configFileReader.getproperty("browser");
		 
	}
	 
	 public WebDriver getDriver() {
		 return (driver == null) ? driver = createDriver() : driver;
		 }
	 
	 private WebDriver createDriver() {
		 if (driverType.equalsIgnoreCase("firefox")) {
			 System.setProperty(FIREFOX_DRIVER_PROPERTY, configFileReader.getproperty("gekoPath"));	
				driver = new FirefoxDriver();
		 } else if (driverType.equalsIgnoreCase("chrome")) {
			 System.setProperty(CHROME_DRIVER_PROPERTY, configFileReader.getproperty("chromePath"));	
				driver = new ChromeDriver(); 
		 } 
			 
		    driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().implicitlyWait(configFileReader.getImplicitlyWait(), TimeUnit.SECONDS);
			driver.get(configFileReader.getproperty("url"));
			return driver;
			
	 }
}
