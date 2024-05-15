package automation.charan.Learn.charan;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

public class TableGrid {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		JavascriptExecutor js =(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,550)");
		List<WebElement>values = driver.findElements(By.cssSelector("div[class=tableFixHead] td:nth-child(4)"));
		int sum=0;
        for(int i =0;i<values.size();i++) {
        sum=sum+Integer.parseInt(values.get(i).getText());
        	
        }
        System.out.println(sum);
       String total = driver.findElement(By.xpath("//div[@class='totalAmount']")).getText();
       String[] s = total.split(":");
       int n = Integer.parseInt(s[1].trim());
       System.out.println(n);
       System.out.println(sum==n);
      
	}

}
