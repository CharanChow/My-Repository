package utils;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import pageObjects.PageObjectManager;

public class TestContexSetup {
	public WebDriver driver;
	public PageObjectManager pageobjectmanager;
	public TestBase testbase;
	
	public TestContexSetup() throws IOException {
		testbase = new TestBase();
		 pageobjectmanager = new PageObjectManager(testbase.WebDriverManager());
		
	}
}
