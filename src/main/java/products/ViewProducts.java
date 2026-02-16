package products;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import base.BasePage;

public class ViewProducts extends BasePage{
	public ViewProducts(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath = "//a[@href='/products']")private WebElement products;
	public void viewProducts() {
		products.click();
	}
}
