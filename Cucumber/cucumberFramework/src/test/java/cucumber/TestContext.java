package cucumber;

import dataProvider.ConfigFileReader;
import managers.FileReaderManager;
import managers.PageObjectManager;
import managers.WebDriverManager;

public class TestContext {
	
	private WebDriverManager webDriverManager;
	private PageObjectManager pageObjectManager;
	private ConfigFileReader configFileReader = FileReaderManager.getInstance();
	
	public TestContext() {
		webDriverManager = new WebDriverManager();
		pageObjectManager = new PageObjectManager(webDriverManager.getDriver());
		configFileReader = FileReaderManager.getInstance();
	}
	
	public WebDriverManager getWebDriverManger() {
		return webDriverManager;
	}
	
	public PageObjectManager getPageObjectManager() {
		return pageObjectManager;
	}
	
	public ConfigFileReader getConfigFileReader() {
		return configFileReader;
	}
	

}
