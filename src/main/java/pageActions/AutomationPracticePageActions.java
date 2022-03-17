package pageActions;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

import PageLocators.AutomationPracticePageLocators;
import Utilities.SeleniumDriver;

public class AutomationPracticePageActions {
	
	Actions actions;
	AutomationPracticePageLocators locatorsPage;
	
	public AutomationPracticePageActions() {
		
	locatorsPage =new AutomationPracticePageLocators()	;
	actions = new Actions(SeleniumDriver.getDriver());
	PageFactory.initElements(SeleniumDriver.getDriver(), locatorsPage);
		
	}

	public void signIn()
	{
		SeleniumDriver.openPage("http://automationpractice.com/");
		SeleniumDriver.waitForElement(locatorsPage.signIn);
		locatorsPage.signIn.click();
		}
	
	public void enterEmailID(String name)
	{
	SeleniumDriver.waitForElement(locatorsPage.emailID);
	locatorsPage.emailID.sendKeys(name);
	//locatorsPage.emailID.sendKeys(Keys.ENTER);
}
	public void enterPassWord(String name)
	{
	SeleniumDriver.waitForElement(locatorsPage.passWord);
	locatorsPage.passWord.sendKeys(name);
	//locatorsPage.passWord.sendKeys(Keys.ENTER);
}
	public void submit()
	{
		
		SeleniumDriver.waitForElement(locatorsPage.submitLogin);
		locatorsPage.submitLogin.click();
		//System.out.println("Clicked on submit button");
	}
	}
