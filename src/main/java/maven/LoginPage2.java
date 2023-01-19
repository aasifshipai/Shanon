package maven;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage2 {
	@FindBy(xpath=("//input[@id='username']"))private WebElement un;
	@FindBy(xpath=("//input[@name='pwd']"))private WebElement pwd;
	@FindBy(xpath=("//div[text()='Login ']"))private WebElement loginbtn;
	public LoginPage2(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
		public void enterUn(String username) {
			un.sendKeys(username);
		}
		public void enterpwd(String password) {
			pwd.sendKeys(password);
		}
		public void clickLoginBtn() {
			loginbtn.click();
		}

}
