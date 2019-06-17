package script;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class ITestResultsDemo {
	
	@Test
	public void test1()
	{
		Reporter.log("test1", true);
		Assert.fail();
	}
	
	@Test
	public void test2()
	{
		Reporter.log("test2", true);
	}
	
	@AfterMethod
	public void a1(ITestResult testResults)
	{
		String name= testResults.getName();
		int status=testResults.getStatus();
		Reporter.log("Test "+name+" Status is: "+status, true);
	}
  
}
