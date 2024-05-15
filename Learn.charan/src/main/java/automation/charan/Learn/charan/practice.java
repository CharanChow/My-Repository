package automation.charan.Learn.charan;

import java.io.File;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class practice {

	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriver driver =new FirefoxDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("sugar lipstick");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@aria-label='sugar lipstick']")).click();
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,500)");
		driver.findElement(By.xpath("//span[contains(text(),'SUGAR Cosmetics Matte Attack Lipstick for Women')]")).click();
		Set<String>H=driver.getWindowHandles();
		Iterator<String>it = H.iterator();
		String ParentId = it.next();
		String childId = it.next();
		driver.switchTo().window(childId);
		js.executeScript("window.scrollBy(0,500)");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='add-to-cart-button']")).click();
		
		}

	}


