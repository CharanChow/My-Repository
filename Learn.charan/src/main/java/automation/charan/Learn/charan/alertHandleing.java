package automation.charan.Learn.charan;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.decorators.WebDriverDecorator;

import io.github.bonigarcia.wdm.WebDriverManager;

public class alertHandleing {

	public static void main(String[] args) throws InterruptedException, IOException {
	WebDriver driver = new FirefoxDriver();
	driver.get("https://the-internet.herokuapp.com");
	driver.findElement(By.cssSelector("a[href*='javascript_alerts']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//button[@onclick='jsAlert()']")).click();
	System.out.println(driver.switchTo().alert().getText());
	driver.switchTo().alert().accept();
	
	driver.findElement(By.xpath("//button[@onClick='jsConfirm()']")).click();
	System.out.println(driver.switchTo().alert().getText());
	driver.switchTo().alert().accept();
	driver.close();

	}

}
