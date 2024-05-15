package utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {
	public WebDriver driver;
	public WebDriver WebDriverManager() throws IOException {
		FileInputStream fis = new FileInputStream("C:\\Workspace\\ui.charan\\src\\test\\globalResource\\global.properties");
		Properties prop = new Properties();
		prop.load(fis);
		String URL = prop.getProperty("FBURL");
		if(driver == null) {
		System.setProperty("wedriver.chrome.driver", "C:\\Lib\\chrome-win64\\chrome-win64");
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(URL);
		}
		return driver;
		
	}

}
