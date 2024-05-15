package automation.charan.Learn.charan;



import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;


public class LActions {
	public static WebDriver driver;



	public static void main(String[] args) throws InterruptedException {
		driver = new FirefoxDriver();
		driver.get("https://www.amazon.in/");
		Actions a = new Actions(driver);
		WebElement search = driver.findElement(By.id("twotabsearchtextbox"));
		a.moveToElement(search).click().keyDown(Keys.SHIFT).sendKeys("happiness hypothessis").build().perform();
		a.moveToElement(driver.findElement(By.xpath("//input[@type='submit']"))).click().build().perform();
		Thread.sleep(3000);
		a.moveToElement(driver.findElement(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal']"))).click().build().perform();
       Set<String> windows = driver.getWindowHandles();
       Iterator<String> IT = windows.iterator();
       String ParentID =IT.next();
       String ChildID = IT.next();
       Thread.sleep(4000);
       driver.switchTo().window(ChildID);
       String[] unwantedtitle = driver.getTitle().split(":");
       System.out.println(unwantedtitle[0]);
       String[]title = unwantedtitle[0].split("Buy");
       String t = title[1].trim();
       System.out.println(t);
       
       
       }

}
