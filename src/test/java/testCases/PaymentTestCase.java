package testCases;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.testng.Assert;
import org.testng.annotations.Test;

import Utilities.DataProvider;
import pages.PaymentPage;

public class PaymentTestCase extends TestBase {
	
	PaymentPage paymentPageObj;

	@Test (priority = 1 ,dataProvider  = "PaymentData",dataProviderClass = DataProvider.class)
	
	
	public void enterPaymentData(String NameOnCard, String CardNumber, String CVC, String ExpirationMonth, String ExpirationYear) throws IOException {
		
		paymentPageObj = new PaymentPage(driver);
		
		paymentPageObj.clickOnPlaceOrderBtn();
		paymentPageObj.setPaymentData(NameOnCard, CardNumber, CVC, ExpirationMonth, ExpirationYear);
		paymentPageObj.clickPayAndConfirm();
		   properitesPath = projectPath + "\\src\\test\\java\\Config\\config.properites";
		   prop = new Properties();
	       fis = new FileInputStream (properitesPath);
	       prop.load(fis);
		String paymentMsg = paymentPageObj.OrderPlacedMessage.getText();
		Assert.assertEquals(paymentMsg, prop.getProperty("OrderMsg"));
	}
}
