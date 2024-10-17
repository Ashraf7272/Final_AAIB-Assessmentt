package testCases;

import static org.testng.Assert.assertEquals;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

import Utilities.DataProvider;
import pages.HomePage;
import pages.SignupAndLoginPage;

public class LogInTestCase extends TestBase{
	HomePage homePageObj;
	SignupAndLoginPage loginPage;
	
	@Test (priority = 1 ,dataProvider  = "LoginData",dataProviderClass = DataProvider.class)
	public void loginWithValidData (String email ,String password) throws IOException {
		
		homePageObj = new HomePage (driver);
		homePageObj.clickOnSignupAndLoginLink();
		
		loginPage = new SignupAndLoginPage (driver);
		loginPage.loginFunctionality(email, password);
		   properitesPath = projectPath + "\\src\\test\\java\\Config\\config.properites";
		   prop = new Properties();
	       fis = new FileInputStream (properitesPath);
	       prop.load(fis);
		String loginMessage = loginPage.loggedinMessage.getText();
		
		assertEquals(loginMessage, prop.getProperty("LoginMessage"));
		
		
	}

}
