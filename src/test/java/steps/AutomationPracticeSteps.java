package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pageActions.AutomationPracticePageActions;
import Utilities.SeleniumDriver;

public class AutomationPracticeSteps {
	
	AutomationPracticePageActions actionsPage = new AutomationPracticePageActions();
	
	@Given("I am on the home page of {string} Automation Practice website")
	public void i_am_on_the_home_page_of_Automation_Practice_website(String websiteUrl) throws InterruptedException {
		SeleniumDriver.openPage(websiteUrl);

	}

	@When("I select the option as SignIn")
	public void i_select_the_option_as_SignIn() throws InterruptedException {
		actionsPage.signIn();
	
	}	
	
    @And("I enter emailId as {string}")
	public void i_enter_emailID_as(String email) throws InterruptedException{
    	actionsPage.enterEmailID(email);
}
    
    @And("I enter password as {string}")
    public void i_enter_passowrd_as(String password) throws InterruptedException{
    	actionsPage.enterPassWord(password);
    }
    
    @And("I click signin button")
    public void i_click_signin_button() throws InterruptedException{
    	actionsPage.submit();
    }
	
}
