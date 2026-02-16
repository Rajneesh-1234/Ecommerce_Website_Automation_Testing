package carts;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import auth.LoginPage;
import base.BaseTest;
import base.DriverFactory;
import config.ConfigReader;

public class DeleteCartItemTest extends BaseTest{
	private DeleteCartItem deleteCartItem;
	@BeforeClass
	public void initPages() {
		deleteCartItem = new DeleteCartItem(DriverFactory.getDriver());
	}
	
	@Test(description = "delete cart item test section here")
	public void testDeleteCartItem() {
		    log.info("Delete Cart Item Test Started");
			deleteCartItem.deleteCartItem();
			log.info("delete cart item uccessful!");
	}
}
