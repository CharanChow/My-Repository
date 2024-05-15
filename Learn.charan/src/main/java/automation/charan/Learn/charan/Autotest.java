package automation.charan.Learn.charan;

import static org.testng.Assert.assertEquals;

import java.io.File;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
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
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class Autotest {
	public static WebDriver driver;
	public static void main(String args[]) throws InterruptedException, IOException {
		FirefoxOptions options = new FirefoxOptions();
		options.setAcceptInsecureCerts(true);
		driver = new FirefoxDriver(options);
		driver.get("https://www.amazon.in/");
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("C://User//schar//screenshot.png"));
		System.out.println(driver.getTitle());
	String link =	driver.findElement(By.xpath("//a[contains(.,'About Us')]")).getAttribute("href");
	  HttpURLConnection conn = (HttpURLConnection) new URL(link).openConnection();
	  conn.setRequestMethod("HEAD");
	  conn.connect();
	  int respCode = conn.getResponseCode();
	  System.out.println(respCode);
	
		
		
		
//		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//		FileUtils.copyFile(src, new File("C://Users//schar//screenshot.png"));
//		System.out.println(driver.getTitle());
		
	}

}
