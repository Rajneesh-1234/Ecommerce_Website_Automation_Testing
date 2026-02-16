package contact;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import alerts.AlertUtil;
import base.BasePage;

public class ContactUsForm extends BasePage{

	public ContactUsForm(WebDriver driver) {
		super(driver);
	}
	@FindBy(name="name")private WebElement name;
	@FindBy(name="email")private WebElement email;
	@FindBy(name="subject")private WebElement subject;
	@FindBy(name="message")private WebElement message;
	@FindBy(name="upload_file")private WebElement upload_file;
	@FindBy(name="submit")private WebElement submit;
	public void contactUsForm(String n,String e,String s,String m,String path) {
		name.clear();
		email.click();
		subject.clear();
		message.clear();
		upload_file.clear();
		name.sendKeys(n);
		email.sendKeys(e);
		subject.sendKeys(s);
		message.sendKeys(m);
		upload_file.sendKeys(path);
		submit.submit();
		AlertUtil.acceptAlert();
	}
}
