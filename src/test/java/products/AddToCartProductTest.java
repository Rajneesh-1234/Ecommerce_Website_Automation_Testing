package products;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import base.BaseTest;
import base.DriverFactory;
import utils.WaitUtils;

public class AddToCartProductTest extends BaseTest{
	private AddToCartProduct addToCartProduct;
	@BeforeClass
	public void initPages() {
		addToCartProduct = new AddToCartProduct(DriverFactory.getDriver());
	}
	
	@Test(description = "add to cart products test section here")
	public void testAddToCartProduct() {
		    log.info("Add To Cart Products Test Started");
		    WaitUtils.getWait(DriverFactory.getDriver());
		    addToCartProduct.addToCartProduct();
			log.info("add to cart product successful!");
	}
}
