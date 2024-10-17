package testCases;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;
import pages.HomePage;

public class TestBase {
	
	static WebDriver driver ;
    String projectPath = System.getProperty("user.dir");
    HomePage basePage;
    Properties prop ;
    FileInputStream fis ;
    String properitesPath;
    
  
    @BeforeTest
    public void openBrowser () throws IOException {
                    
                    System.setProperty("webdriver.chrome.driver",projectPath+"//Drivers//chromedriver.exe");
                    WebDriverManager.chromedriver().setup();
                    driver = new ChromeDriver();
                    driver.manage().window().maximize();
                    properitesPath = projectPath + "\\src\\test\\java\\Config\\config.properites";
                    
                    prop = new Properties();
                    fis = new FileInputStream (properitesPath);
                    prop.load(fis);
                    String url = prop.getProperty("URL");
                    driver.get(url);

    }
    
    
 @AfterTest
    
    public void closeBrowser () {
    	
    	driver.quit();
    	
    }

}
