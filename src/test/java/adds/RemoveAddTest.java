package adds;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import base.BaseTest;
import base.DriverFactory;
import utils.WaitUtils;

public class RemoveAddTest extends BaseTest{
	private RemoveAdd removeAdd;
	@BeforeClass
	public void initPages() {
		removeAdd = new RemoveAdd(DriverFactory.getDriver());
	}
	
	@Test(description = "dismiss button test section here")
	public void testDismissButton() {
		    log.info("Dismiss Button Test Started");
		    WaitUtils.getWait(DriverFactory.getDriver());
			removeAdd.dismissButton();
			log.info("dismiss button close successful!");
	}
}
