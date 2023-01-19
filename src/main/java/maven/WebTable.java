package maven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebTable {
	public static void main(String[] args) {
		
	
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.get("file:///C:/Users/Aasif/Desktop/table.html");
String c = driver.findElement(By.xpath("//th[text()='Company']")).getText();
System.out.println(c);
//print entire row
              String r = driver.findElement(By.xpath("/html/body/table/tbody/tr[2]")).getText();
              System.out.println(r);
}
}