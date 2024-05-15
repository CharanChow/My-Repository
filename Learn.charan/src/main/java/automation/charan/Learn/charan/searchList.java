package automation.charan.Learn.charan;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class searchList {

	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriver driver;
		driver = new FirefoxDriver();
		driver.get("https://www.amazon.in/");
		WebElement search = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		search.click();
		search.sendKeys("books");
		Thread.sleep(3000);
		List<WebElement> L = driver.findElements(By.xpath("//div[@role='button']"));
		for(WebElement e : L) {
			System.out.println(e.getText());
		}
		File src =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("C://Just//screenshot.png"));
	}

}
