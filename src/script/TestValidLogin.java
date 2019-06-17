package script;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.Test;

import generic.BaseTest;
import generic.XL;
import page.EnterTimeTrackPage;
import page.LoginPage;

public class TestValidLogin extends BaseTest{
	@Test
	public void login() throws EncryptedDocumentException, FileNotFoundException, IOException {
		String usrnm = XL.getData(XL_PATH, "sheet1", 1, 0);
		String pwd = XL.getData(XL_PATH, "sheet1", 1, 1);
		String title_contains = XL.getData(XL_PATH, "sheet1", 1, 2);
		
		
		LoginPage lp=new LoginPage(driver);
		lp.setUserName(usrnm);
		lp.setPwd(pwd);
		lp.clicLogin();
		
		EnterTimeTrackPage et=new EnterTimeTrackPage(driver);
		et.verifyHomePageIsDisplayed(driver,ETO, title_contains);
		
	}
	

}
