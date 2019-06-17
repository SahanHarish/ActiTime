package generic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest implements IAutoConst{
	static {
		System.setProperty(CHROME_KEY, CHROME_VALUE);
	}
	
	public WebDriver driver;
	
	@BeforeMethod
	public void openApplication()
	{
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(ITO, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get(URL);
	}
	
	@AfterMethod
	public void closeApplication(ITestResult testResults)
	{
		String name = testResults.getName();
		int status = testResults.getStatus();
		
		if(status==1)
		{
			Reporter.log(name+"is PASSED", true);
		}
		else if(status==2)
		{
			Reporter.log(name+"is FAILED", true);
			String path=IMG_PATH+name+".png";
			FWUtil.getPhoto(driver, path);
		}
		driver.close();
	}

}
