package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductsPage extends BasePage {
	
	public ProductsPage(WebDriver driver) {
		super(driver);
	}
	

   @FindBy (css = "a[href='/product_details/11']")
   WebElement viewProductLink ;
   
   @FindBy (css= "button[type='button']")
   WebElement addToCartButton;
   
   @FindBy (xpath = "//a[@href='/view_cart']")
   WebElement viewCartLink;
   

   public void clickOnViewProductLInk () {
	   
	 clickButton(viewProductLink);
   }
   
   public void clickOnAddToCartBtn () {
	   
	   clickButton(addToCartButton);
   }
   
   public void clickOnViewCartBtn() {
	   
	 clickButton(viewCartLink);
	
}

}
