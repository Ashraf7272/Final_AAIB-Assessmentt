package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignupAndLoginPage extends HomePage{

	public SignupAndLoginPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(css = "input[data-qa='login-email']")
	WebElement EmailAddress;
	
	
	@FindBy(css = "input[placeholder='Password']")
	WebElement Password;
	
	@FindBy(css = "button[data-qa='login-button']")
	WebElement LogInButton;
	
	@FindBy (xpath = "//li[10]//a[1]")
	public WebElement loggedinMessage;
	
	
	
	public void loginFunctionality(String email ,String password) {
		
		setTextElementText(EmailAddress, email);
		setTextElementText(Password, password);
		clickButton(LogInButton);
		
	}
	
}
