package maven;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage2 {
	@FindBy(xpath = "//td[text()='Enter Time-Track']")private WebElement text;
	public HomePage2(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	public String verifytext() {
		String expt=text.getText();
		return expt;
		
	}

}
