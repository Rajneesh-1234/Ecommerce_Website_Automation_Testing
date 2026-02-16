package carts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import base.BasePage;

public class DeleteCartItem extends BasePage {

	public DeleteCartItem(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = "//a[@class='cart_quantity_delete']")
	private WebElement delete_cart_item;

	public void deleteCartItem() {
		delete_cart_item.click();
	}
}
