package automation.charan.Learn.charan;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class screenShot {

	public static void main(String[] args) throws IOException {
		WebDriver driver;
		driver = new FirefoxDriver();
		driver.get("https://www.flipkart.com/");
		WebElement search = driver.findElement(By.xpath("//input[@title='Search for Products, Brands and More']"));
	    search.sendKeys("books");
		WebElement c = driver.findElement(By.cssSelector("button[type='submit']"));
		c.click();
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyDirectory(src, new File("C:\\Charan Kumar\\screenshot.png"));

	}

}
