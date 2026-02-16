package adds;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import base.BasePage;

public class RemoveAdd extends BasePage{

	public RemoveAdd(WebDriver driver) {
		super(driver);
	}
	@FindBy(id="dismiss-button")private WebElement dismiss_button;
	public void dismissButton() {
		if(driver.getCurrentUrl().contains("https://automationexercise.com/contact_us#google_vignette")) {
			 driver.navigate().back();
		}
	}
}
