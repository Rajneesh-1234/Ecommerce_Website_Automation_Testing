package products;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import base.BaseTest;
import base.DriverFactory;
import utils.WaitUtils;

public class ViewProductTest extends BaseTest{
	private ViewProducts viewProducts;
	@BeforeClass
	public void initPages() {
		viewProducts = new ViewProducts(DriverFactory.getDriver());
	}
	
	@Test(description = "view product test section here")
	public void testViewProducts() {
		    log.info("View Products Test Started");
		    viewProducts.viewProducts();
			log.info("view products successful!");
	}
}
