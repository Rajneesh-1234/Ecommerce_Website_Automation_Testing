package logout;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import base.BasePage;

public class Logout extends BasePage{

	public Logout(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath = "//a[normalize-space()='Logout']")private WebElement logout;
	public void logout() {
		logout.click();
	}

}
