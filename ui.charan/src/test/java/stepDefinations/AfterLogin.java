package stepDefinations;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Then;
import io.github.bonigarcia.wdm.WebDriverManager;
import pageObjects.AfterLoginPage;
import pageObjects.PageObjectManager;
import utils.TestContexSetup;


public class AfterLogin {
	PageObjectManager pageobjectmanager;
	TestContexSetup testContexSetup;
	
	public AfterLogin(TestContexSetup testContexSetup) {
		this.testContexSetup=testContexSetup;
	}
@Then("User should login")
	public void user_should_login() {
		AfterLoginPage al = testContexSetup.pageobjectmanager.getAfterLoginPage();
		al.test();
		System.out.println(al.title());
			}
		
		}
	

		
	

