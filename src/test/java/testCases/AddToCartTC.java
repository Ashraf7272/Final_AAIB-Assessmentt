package testCases;

import static org.testng.Assert.assertEquals;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

import pages.CartPage;
import pages.ProductsPage;

public class AddToCartTC extends TestBase {

   ProductsPage productsObj;
   CartPage cartObj;
  @Test 
   public void AdddProductToCart () throws IOException {
	   productsObj = new ProductsPage (driver) ;
	   productsObj.clickOnViewProductLInk();
	   
	   productsObj.clickOnAddToCartBtn();
	   productsObj.clickOnViewCartBtn();
	   
	   cartObj = new CartPage(driver);
	   cartObj.clickOnCheckoutButton();
	   properitesPath = projectPath + "\\src\\test\\java\\Config\\config.properites";
	   prop = new Properties();
       fis = new FileInputStream (properitesPath);
       prop.load(fis);
      
	   
	  String totalAount =  cartObj.totalAmount.getText();
	   assertEquals(totalAount, prop.getProperty("ProductAmount"));
	   
	   
	   
	   
	   
	   
   }
	
}
