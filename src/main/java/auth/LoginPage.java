package auth;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import base.BasePage;

public class LoginPage extends BasePage{

	public LoginPage(WebDriver driver) {
		super(driver);
	}
	@FindBy(xpath = "//a[normalize-space()='Signup / Login']")private WebElement login;
	@FindBy(name = "email")private WebElement email;
	@FindBy(name = "password")private WebElement password;
	@FindBy(xpath = "//button[normalize-space()='Login']")private WebElement loginBtn;
	public void login(String e,String p) {
		login.click();
		email.clear();
		password.clear();
		email.sendKeys(e);
		password.sendKeys(p);
		loginBtn.click();
	}
}
