package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CartPage extends BasePage{

	public CartPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(css = ".btn.btn-default.check_out")
	WebElement ProceedToChecoutButton;
	
	@FindBy(xpath = "//tbody/tr/td[4]/p[1]")
	public WebElement totalAmount;
	
	
	public void clickOnCheckoutButton () {
		
		clickButton(ProceedToChecoutButton);
	}

}
