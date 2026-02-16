package homepage;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import base.BaseTest;
import base.DriverFactory;

public class HomePageTest extends BaseTest{
	private OpenHomePage home;
	@BeforeClass
	public void initPages() {
		home = new OpenHomePage(DriverFactory.getDriver());
	}
	
	@Test(description = "login test section here")
	public void testLogo() {
		    log.info("Logo Test Started");
			Assert.assertTrue(home.verifyLogo());
			log.info("Logo displayed successful!");
	}
}
