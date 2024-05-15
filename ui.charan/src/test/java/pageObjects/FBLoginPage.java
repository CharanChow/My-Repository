package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FBLoginPage {
	public WebDriver driver;
	
	public FBLoginPage(WebDriver driver) {
		this.driver=driver;
		
	}
	By UserID = By.xpath("//input[@id='email']");
    By Password = By.xpath("//input[@id='pass']");
    String userid = "scharanchowdary@gmail.com";
    String password = "9959933223";
    
    public void Usercredentials() {
    	driver.findElement(UserID).sendKeys(userid);
    	
    }
    public void Password() {
    	driver.findElement(Password).sendKeys(password);
    }
}
