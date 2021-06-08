package pageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(how = How.XPATH, using = "//a[@class='login']")
	public WebElement loginbutton;
	
	@FindBy(how = How.XPATH, using = "//input[@id='email']")
	public WebElement username;
	
	@FindBy(how = How.XPATH, using = "//input[@id='passwd']")
	public WebElement password;
	
	@FindBy(how = How.ID, using = "SubmitLogin")
	public WebElement submitButton;
	
	public void ClickLoginbutton() {
		loginbutton.click();;
	}
	
	public void inputUserName(String user) {
		username.sendKeys(user);
	}
	
	public void inputPassword(String Pass) {
		password.sendKeys(Pass);
	}
	
	public void clickSubmitButton() {
		submitButton.click();;
	}
	
	
	
	
	
	
}
