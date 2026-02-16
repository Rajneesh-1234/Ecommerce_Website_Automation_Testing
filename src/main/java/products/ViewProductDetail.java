package products;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import base.BasePage;

public class ViewProductDetail extends BasePage{

	public ViewProductDetail(WebDriver driver) {
		super(driver);
	}
	@FindBy(xpath = "//div[@class='col-sm-9 padding-right']//div[2]//div[1]//div[2]//ul[1]//li[1]//a[1]")private WebElement view_product;
	public void viewProduct() {
		view_product.click();
	}
	

}
