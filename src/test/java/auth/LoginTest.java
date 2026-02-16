package auth;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import base.BaseTest;
import base.DriverFactory;
import config.ConfigReader;

public class LoginTest extends BaseTest{
	private LoginPage loginPage;
	@BeforeClass
	public void initPages() {
		loginPage = new LoginPage(DriverFactory.getDriver());
	}
	
	@Test(description = "login test section here")
	public void testLogo() {
		    log.info("Login Test Started");
		    String email=ConfigReader.get("email");
		    String password=ConfigReader.get("password");
			loginPage.login(email, password);
			log.info("Login Successful!");
	}
}
