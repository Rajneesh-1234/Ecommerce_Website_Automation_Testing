package homepage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import base.BasePage;

public class OpenHomePage extends BasePage{
	public OpenHomePage(WebDriver driver) {
		super(driver);
	}
	@FindBy(xpath = "//img[@alt='Website for automation practice']")private WebElement logo;
	public boolean verifyLogo() {
		return logo.isDisplayed();
	}
}
