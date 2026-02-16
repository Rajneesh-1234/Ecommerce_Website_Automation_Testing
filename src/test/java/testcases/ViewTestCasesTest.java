package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import base.BaseTest;
import base.DriverFactory;
import carts.DeleteCartItem;

public class ViewTestCasesTest extends BaseTest{
	private ViewTestCases viewTestCases;
	@BeforeClass
	public void initPages() {
		viewTestCases = new ViewTestCases(DriverFactory.getDriver());
	}
	
	@Test(description = "view test cases test section here")
	public void testViewTestCases() {
		    log.info("View Test Cases Test Started");
			viewTestCases.viewTestCase();
			log.info("view test cases successful!");
	}
}
