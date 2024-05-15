package automation.charan.Learn.charan;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Scrolling {

	public static void main(String[] args) throws Exception {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,500)");
		Thread.sleep(3000);
		js.executeScript("document.querySelector('.tableFixHead').scrollTop=4000");
		int sum=0;
		List<WebElement> values = driver.findElements(By.cssSelector("table[name=courses] td:nth-child(3)"));
		for(int i=0;i<values.size();i++) {
			sum = sum +Integer.parseInt(values.get(i).getText());
		}
		System.out.println(sum);

	}

}
