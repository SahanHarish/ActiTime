package script;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import generic.BaseTest;
import generic.XL;


public class TestBaseTest extends BaseTest{
	@Test
	public void test()
	{
		try {
			int rc=XL.getRowCount(XL_PATH, "sheet1");
			Reporter.log("num of rows :"+rc, true);
			String v=XL.getData(XL_PATH, "sheet1", 0, 0);
			Reporter.log("test", true);
			//Assert.fail(); //added this to check if failed scenario screenshot is taken
		}
		catch (Exception e)
		{
			
		}
		
	}

}
