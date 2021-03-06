package stepdefinitions;
import org.junit.Assert;
import cucumber.TestContext;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import dataProvider.ConfigFileReader;
import pageFactory.LoginPage;

public class Steps {
	
	LoginPage loginpage;
	ConfigFileReader configFileReader;
	TestContext testContext;
	
	public Steps(TestContext context) {
		testContext = context;
		loginpage = testContext.getPageObjectManager().getLoginPage();
		configFileReader = testContext.getConfigFileReader();
		
		
	}
	
@Given("^User hits the URL$")
public void user_hits_the_URL()  {
	loginpage.ClickLoginbutton();
}

@When("^User inputs username$")
public void user_inputs_username() throws InterruptedException  {
	
	loginpage.inputUserName(configFileReader.getproperty("username"));
  
}

@When("^User input Password$")
public void user_input_Password() {

	loginpage.inputPassword(configFileReader.getproperty("password"));
    
}

@When("^User click on login button$")
public void user_click_on_login_button()  {

	loginpage.clickSubmitButton();;
}

@Then("^User lands on Home page$")
public void user_lands_on_Home_page() {
	
     Assert.assertEquals(configFileReader.getproperty("myAccountTitle"), testContext.getWebDriverManger().getDriver().getTitle());
}


}
