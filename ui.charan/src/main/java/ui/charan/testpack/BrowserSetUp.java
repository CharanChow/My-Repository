package ui.charan.testpack;

import static org.testng.Assert.assertEquals;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserSetUp {
	public static WebDriver driver;
	public static void main(String args[]) throws InterruptedException {
//       System.setProperty("wedriver.chrome.driver", "C:/Lib/chrome-win64/chrome-win64.exe");
//	    WebDriverManager.firefoxdriver().setup();
//		ChromeOptions options=new ChromeOptions();
//		WebDriverManager.chromedriver().clearDriverCache().setup();
//		WebDriver driver = (WebDriver) new ChromeOptions();
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.amazon.in/");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone");
		driver.findElement(By.id("nav-search-submit-button")).click();
		List<WebElement> Results = driver.findElements(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal']"));
		
		for(WebElement wish: Results) {
			System.out.println(wish.findElement(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal]")).getText());
			if(wish.findElement(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal']")).getText().equalsIgnoreCase("Apple iPhone 13 (128GB) - Blue"))
			{
			System.out.println(wish.findElement(By.xpath("(//span[@class='a-size-medium a-color-base a-text-normal'])[1]")).getText());
			wish.findElement(By.xpath("(//span[@class='a-size-medium a-color-base a-text-normal'])[1]")).click();
			break;
			}
			
		}
		/*
		 * List<WebElement> options = driver.findElements(By.
		 * xpath("//div[@class='s-suggestion s-suggestion-ellipsis-direction']"));
		 * for(WebElement option : options) { String str = option.getText();
		 * System.out.println("Suggested list :" + str );
		 * if(str.equalsIgnoreCase("mosquito bat")) { option.click(); break; } }
		 */
	}
}


