package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;

public class EnterTimeTrackPage {
	
	
	public EnterTimeTrackPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}
	
	
	public void verifyHomePageIsDisplayed(WebDriver driver, long eto, String exp) {
		WebDriverWait wait=new WebDriverWait(driver, eto);
		
		try {
		wait.until(ExpectedConditions.titleContains(exp));
		Reporter.log("Homepage is displayed", true);
		}
		catch(Exception e)
		{
			Reporter.log("Homepage is not displayed", true);
			
		}
		
		
		
	}

}
