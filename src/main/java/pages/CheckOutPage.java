package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckOutPage extends BasePage {

	public CheckOutPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(css = ".btn.btn-default.check_out")
	WebElement PlaceOrderButton;
	
	@FindBy(css = "tbody tr td:nth-child(4) p:nth-child(1)")
	public WebElement TotalAmount;
	
	
	public void clickOnPlaceOrderButton () {
		
		clickButton(PlaceOrderButton);
	}

}
