package logout;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import base.BaseTest;
import base.DriverFactory;
import carts.DeleteCartItem;

public class LogoutTest extends BaseTest{
	private Logout logout;
	@BeforeClass
	public void initPages() {
		logout = new Logout(DriverFactory.getDriver());
	}
	
	@Test(description = "logout test section here")
	public void testLogout() {
		    log.info("Logout Test Started");
			logout.logout();
			log.info("logout uccessful!");
	}
}
