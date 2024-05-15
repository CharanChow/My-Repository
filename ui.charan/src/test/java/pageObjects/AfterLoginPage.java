package pageObjects;

import org.openqa.selenium.WebDriver;

public class AfterLoginPage {
	public WebDriver driver;
	
	public AfterLoginPage(WebDriver driver) {
		
		this.driver = driver;
	}
	public String title() {
		return driver.getTitle();
	}
	public void test() {
		System.out.println("i still can do it ");
	}

}
