package products;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import base.BasePage;

public class SearchProducts extends BasePage{

	public SearchProducts(WebDriver driver) {
		super(driver);
	}
	@FindBy(xpath = "//input[@id='search_product']")private WebElement search_product;
	@FindBy(xpath = "//button[@id='submit_search']")private WebElement submit_search;
	public void searchProduct(String pname) {
		search_product.clear();
		search_product.sendKeys(pname);
		submit_search.click();
	}
}
