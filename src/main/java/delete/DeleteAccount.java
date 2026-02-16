package delete;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import base.BasePage;

public class DeleteAccount extends BasePage{

	public DeleteAccount(WebDriver driver) {
		super(driver);
	}
	@FindBy(xpath = "//a[normalize-space()='Delete Account']")private WebElement delete_account;
	public void deleteAccount() {
		delete_account.click();
	}
}
