package videos;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import base.BaseTest;
import base.DriverFactory;
import utils.WaitUtils;
public class ViewVideoTutorialTest extends BaseTest{
	private ViewVideoTutorial videoTutorial;
	@BeforeClass
	public void initPages() {
		videoTutorial = new ViewVideoTutorial(DriverFactory.getDriver());
	}
	@Test(description = "view video tutorials test section here")
	public void testViewVideoTutorials() {
		    log.info("View Video Tutorial Test Started");
			videoTutorial.viewVideoTutorials();
			log.info("view video tutorials successful!");
			WaitUtils.getWait(DriverFactory.getDriver());
			if(DriverFactory.getDriver().getCurrentUrl().contains("https://www.youtube.com/c/AutomationExercise")) {
				 DriverFactory.getDriver().navigate().back();
			}
	}
}
