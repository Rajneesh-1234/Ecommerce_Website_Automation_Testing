package auth;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import base.BaseTest;
import base.DriverFactory;
import config.ConfigReader;

public class RegisterTest extends BaseTest{
	private RegisterPage registerPage;
	@BeforeClass
	public void initPages() {
		registerPage = new RegisterPage(DriverFactory.getDriver());
	}
	
	@Test(description = "register test section here")
	public void testLogo() {
		    log.info("Register Test Started");
		    String name=ConfigReader.get("name");
		    String email=ConfigReader.get("email");
			registerPage.signup(name, email);
			log.info("Registration Successful!");
	}
}
