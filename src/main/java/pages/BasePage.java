package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class BasePage {
                static WebDriver driver ;
               
                
                @SuppressWarnings("static-access")
                public BasePage (WebDriver driver) {
                                this.driver = driver ;
                                PageFactory.initElements(driver, this);

                }

                protected static void clickButton (WebElement element) {

                                element.click();

                }

                protected static void setTextElementText(WebElement textElement , String value) 
                {
                                textElement.sendKeys(value);
                }


                public void selectFromMenu(WebElement element,String text) {
                                
                                Select objSelect =new Select(element);
                                objSelect.selectByValue(text);

                }
                
}
