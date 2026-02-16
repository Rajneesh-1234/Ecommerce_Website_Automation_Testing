package delete;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import base.BaseTest;
import base.DriverFactory;
import carts.DeleteCartItem;

public class DeleteAccountTest extends BaseTest{
	private DeleteAccount deleteAccount;
	@BeforeClass
	public void initPages() {
		deleteAccount = new DeleteAccount(DriverFactory.getDriver());
	}
	
	@Test(description = "delete account test section here")
	public void testDeleteCartItem() {
		    log.info("Delete Account Test Started");
			deleteAccount.deleteAccount();
			log.info("delete account successful!");
	}
}
