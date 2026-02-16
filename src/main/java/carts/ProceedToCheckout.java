package carts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import base.BasePage;

public class ProceedToCheckout extends BasePage {

	public ProceedToCheckout(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = "//a[normalize-space()='Proceed To Checkout']")
	private WebElement proceed_to_checkout;

	public void proceedToCheckout() {
		proceed_to_checkout.click();
	}

}
