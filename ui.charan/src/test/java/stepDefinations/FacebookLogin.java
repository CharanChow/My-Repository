package stepDefinations;



import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import pageObjects.AfterLoginPage;
import pageObjects.FBLoginPage;
import pageObjects.PageObjectManager;
import utils.TestContexSetup;


public class FacebookLogin {
	PageObjectManager pageobjectmanager;
TestContexSetup testContexSetup;
	public FacebookLogin(TestContexSetup testContexSetup) {
		this.testContexSetup=testContexSetup;
		}
	@Given("User is on Facebook login page")
	public void user_is_on_facebook_login_page() throws InterruptedException {
	
		}
	
	@When("User enters credentials")
	public void user_enters_credentials_with_test_and_stoics() throws InterruptedException {
		FBLoginPage fbLoginPage = testContexSetup.pageobjectmanager.getFBLoginPage();
		fbLoginPage.Usercredentials();
		fbLoginPage.Password();
		}
	
}
