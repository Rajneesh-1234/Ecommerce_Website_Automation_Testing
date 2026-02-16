package products;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import base.BaseTest;
import base.DriverFactory;
import config.ConfigReader;

public class SearchProductTest extends BaseTest{
	private SearchProducts searchProducts;
	@BeforeClass
	public void initPages() {
		searchProducts = new SearchProducts(DriverFactory.getDriver());
	}
	
	@Test(description = "search products test section here")
	public void testSearchProducts() {
		    log.info("Search Products Test Started");
		    String pname=ConfigReader.get("pname");
		    searchProducts.searchProduct(pname);
			log.info("search product successful!");
	}
}
