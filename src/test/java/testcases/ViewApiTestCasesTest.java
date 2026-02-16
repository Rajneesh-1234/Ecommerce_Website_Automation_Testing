package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import base.BaseTest;
import base.DriverFactory;
import carts.DeleteCartItem;

public class ViewApiTestCasesTest extends BaseTest{
	private ViewApiTestCases viewApiTestCases;
	@BeforeClass
	public void initPages() {
		viewApiTestCases = new ViewApiTestCases(DriverFactory.getDriver());
	}
	
	@Test(description = "view api test cases test section here")
	public void testViewApiTestCases() {
		    log.info("View Api Test Cases Test Started");
			viewApiTestCases.apiTestCases();
			log.info("view api test cases uccessful!");
	}
}
