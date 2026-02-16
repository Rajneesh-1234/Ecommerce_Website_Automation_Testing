package products;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import base.BaseTest;
import base.DriverFactory;
import utils.WaitUtils;

public class ViewCartProductTest extends BaseTest{
	private ViewCartProduct viewCartProduct;
	@BeforeClass
	public void initPages() {
		viewCartProduct = new ViewCartProduct(DriverFactory.getDriver());
	}
	
	@Test(description = "view cart products test section here")
	public void testViewCartProduct() {
		    log.info("Search Products Test Started");
		    WaitUtils.getWait(DriverFactory.getDriver());
		    viewCartProduct.viewCartProduct();
			log.info("search product successful!");
	}
}
