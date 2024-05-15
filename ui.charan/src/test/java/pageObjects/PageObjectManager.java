package pageObjects;

import org.openqa.selenium.WebDriver;

public class PageObjectManager {
	
	public WebDriver driver;
	
	public PageObjectManager(WebDriver driver) {
		this.driver = driver;
	}
	
	public FBLoginPage fbLoginPage;
	
	public FBLoginPage getFBLoginPage() {
		 fbLoginPage = new FBLoginPage(driver);
		 return fbLoginPage;
		}

	public AfterLoginPage al;
    public AfterLoginPage getAfterLoginPage() {
	al = new AfterLoginPage(driver);
	return al;
}
}
