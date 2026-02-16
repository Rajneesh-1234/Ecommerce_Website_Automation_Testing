package products;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import base.BasePage;

public class AddToCartProduct extends BasePage{

	public AddToCartProduct(WebDriver driver) {
		super(driver);
	}
	@FindBy(xpath = "//button[normalize-space()='Add to cart']")private WebElement add_to_cart;
	public void addToCartProduct() {
		add_to_cart.click();
	}
}
