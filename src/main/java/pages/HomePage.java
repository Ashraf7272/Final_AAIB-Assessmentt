package pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;



public class HomePage extends BasePage {
	
	public HomePage(WebDriver driver) {
		super(driver);
		
	}

	static WebDriver driver;
	

	
	@FindBy( css = "header[id='header'] li:nth-child(1) a:nth-child(1)")
	WebElement ProductsLink;
	
	@FindBy(css = "header[id='header'] li:nth-child(3) a:nth-child(1)")
	WebElement CartLink ;
	
	@FindBy( css = "a[href='/login']")
	WebElement SignupAndLoginLink ;
	
	
	public void clickOnSignupAndLoginLink () {
		
		clickButton(SignupAndLoginLink);
	}
	
	public void clickOnProductsLink() {
		
		clickButton(ProductsLink);;
	}
	
	public void clickOnCartLink() {
		
		clickButton(CartLink);
	}
	
}
