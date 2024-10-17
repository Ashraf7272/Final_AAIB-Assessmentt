package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PaymentPage extends BasePage {


	public PaymentPage(WebDriver driver) {
		super(driver);
		
	}
	@FindBy(css = "input[name='name_on_card']")
	WebElement NameOnCard;
	
	@FindBy (css = "input[name='card_number']")
	WebElement CardNumber;
	
	@FindBy(css = "input[placeholder='ex. 311']")
	WebElement CVC;
	
	@FindBy(css = "input[placeholder='MM']")
	WebElement ExpirationMonth;
	
	@FindBy(css = "input[placeholder='YYYY']")
	WebElement ExpirationYear;
	
	@FindBy(css = "#submit")
	WebElement PayAndConfirmOrderButton;
	
	@FindBy(css = "h2[class='title text-center'] b")
	public WebElement OrderPlacedMessage;
	
	@FindBy (xpath = "//a[normalize-space()='Place Order']")
	WebElement placeOrderBtn;
	
	public void setPaymentData(String Name, String Number, String CVCNUM, String Month, String Year) {

		setTextElementText(NameOnCard, Name);
		setTextElementText(CardNumber, Number);
		setTextElementText(CVC, CVCNUM);
		setTextElementText(ExpirationMonth, Month);
		setTextElementText(ExpirationYear, Year);
	}
	public void clickPayAndConfirm() {
		clickButton(PayAndConfirmOrderButton);
	}
	
	public void clickOnPlaceOrderBtn () {
		clickButton(placeOrderBtn);
	}

}
