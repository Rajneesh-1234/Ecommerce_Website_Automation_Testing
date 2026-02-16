package contact;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import base.BasePage;

public class ContactUs extends BasePage{

	public ContactUs(WebDriver driver) {
		super(driver);
	}
	@FindBy(xpath = "//a[normalize-space()='Contact us']")private WebElement contact_us;
	public void contactUs() {
		contact_us.click();
	}
}
