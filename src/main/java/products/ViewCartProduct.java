package products;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import base.BasePage;

public class ViewCartProduct extends BasePage{

	public ViewCartProduct(WebDriver driver) {
		super(driver);
	}
	@FindBy(xpath = "//u[normalize-space()='View Cart']")private WebElement view_cart;
	public void viewCartProduct() {
		view_cart.click();
	}

}
