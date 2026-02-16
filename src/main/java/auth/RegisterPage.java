package auth;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import base.BasePage;

public class RegisterPage extends BasePage{

	public RegisterPage(WebDriver driver) {
		super(driver);
	}
	@FindBy(xpath = "//a[normalize-space()='Signup / Login']")private WebElement signup;
	@FindBy(name = "name")private WebElement name;
	@FindBy(name="email")private WebElement email;
	@FindBy(name="//button[normalize-space()='Signup']")private WebElement signupBtn;
	public void signup(String n,String e) {
		signup.click();
		name.clear();
		email.clear();
		name.sendKeys(n);
		email.sendKeys(e);
		signupBtn.click();
	}
}
