package videos;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import base.BasePage;

public class ViewVideoTutorial extends BasePage {

	public ViewVideoTutorial(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = "//a[normalize-space()='Video Tutorials']")
	private WebElement view_video_tutorials;

	public void viewVideoTutorials() {
		view_video_tutorials.click();
	}

}
