package testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import base.BasePage;

public class ViewApiTestCases extends BasePage {
	public ViewApiTestCases(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = "//a[normalize-space()='API Testing']")
	private WebElement api_testcase;

	public void apiTestCases() {
		api_testcase.click();
	}
}
