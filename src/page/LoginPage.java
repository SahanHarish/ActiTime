package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	@FindBy(id="username")
	private WebElement usernmTB;
	
	@FindBy(name="pwd")
	private WebElement pwdTB;
	
	@FindBy(xpath="//div[text()='Login ']")
	private WebElement loginbtn;
	
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void setUserName(String usrnm) {
		usernmTB.sendKeys(usrnm);
	}
	
	public void setPwd(String pw) {
		pwdTB.sendKeys(pw);
	}
	
	public void clicLogin() {
		loginbtn.click();
	}

}
