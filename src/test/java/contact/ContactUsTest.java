package contact;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import base.BaseTest;
import base.DriverFactory;

public class ContactUsTest extends BaseTest{
	private ContactUs contactUs;
	@BeforeClass
	public void initPages() {
		contactUs = new ContactUs(DriverFactory.getDriver());
	}
	
	@Test(description = "contact us test section here")
	public void testContactUs() {
		    log.info("Contact us Test Started");
		    contactUs.contactUs();
			log.info("contact us button clicked successful!");
	}
}
