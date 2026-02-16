package carts;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import base.BaseTest;
import base.DriverFactory;

public class ProceedToCheckoutTest extends BaseTest{
	private ProceedToCheckout proceedToCheckout;
	@BeforeClass
	public void initPages() {
		proceedToCheckout = new ProceedToCheckout(DriverFactory.getDriver());
	}
	
	@Test(description = "proceed to checkout test section here")
	public void testProceedToCheckout() {
		    log.info("Proceed To Chechout Test Started");
			proceedToCheckout.proceedToCheckout();
			log.info("proceed to checkout uccessful!");
	}
}
