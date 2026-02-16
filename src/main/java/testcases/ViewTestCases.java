package testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import base.BasePage;

public class ViewTestCases extends BasePage{

	public ViewTestCases(WebDriver driver) {
		super(driver);
	}
	@FindBy(xpath = "//a[normalize-space()='Test Cases']")private WebElement test_cases;
	public void viewTestCase() {
		test_cases.click();
	}
}
