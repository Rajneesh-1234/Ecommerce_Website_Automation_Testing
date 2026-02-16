package contact;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import base.BaseTest;
import base.DriverFactory;
import config.ConfigReader;

public class ContactUsFormTest extends BaseTest{
	private ContactUsForm contactUsForm;
	@BeforeClass
	public void initPages() {
		contactUsForm = new ContactUsForm(DriverFactory.getDriver());
	}
	
	@Test(description = "contact us form test section here")
	public void testContactUsForm() {
		    log.info("Contact us form Test Started");
		    String cname=ConfigReader.get("cname");
		    String cemail=ConfigReader.get("cemail");
		    String subject=ConfigReader.get("subject");
		    String message=ConfigReader.get("message");
		    String path=ConfigReader.get("path");
			contactUsForm.contactUsForm(cname,cemail,subject,message,path);
			log.info("contact details submit successful!");
			if(DriverFactory.getDriver().getCurrentUrl().contains("https://automationexercise.com/contact_us#google_vignette")) {
				 DriverFactory.getDriver().navigate().back();
			}
	}
}
