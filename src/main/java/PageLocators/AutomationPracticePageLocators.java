package PageLocators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AutomationPracticePageLocators {

	@FindBy(xpath = "//a[@class=\"login\"]") //use single quotes inside the locator to avoid escape sequence
	public WebElement signIn;
	
	
	@FindBy(xpath = "//input[@id=\"email\"]")
	public WebElement emailID;
	
	@FindBy(xpath = "//input[@id=\"passwd\"]")
	public WebElement passWord;
	
	@FindBy(xpath = "//button[@id=\"SubmitLogin\"]")
	public WebElement submitLogin;
	
}
