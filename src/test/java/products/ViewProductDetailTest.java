package products;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import base.BaseTest;
import base.DriverFactory;
import utils.WaitUtils;

public class ViewProductDetailTest extends BaseTest{
	private ViewProductDetail viewProductDetail;
	@BeforeClass
	public void initPages() {
		viewProductDetail = new ViewProductDetail(DriverFactory.getDriver());
	}
	
	@Test(description = "view product  details test section here")
	public void testViewProductDetils() {
		    log.info("View Products Details Test Started");
		    WaitUtils.getWait(DriverFactory.getDriver());
		    viewProductDetail.viewProduct();
			log.info("view product details successful!");
	}
}
