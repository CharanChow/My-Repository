package automation.charan.Learn.charan;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class windowHandle {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver;
		driver = new FirefoxDriver();
		driver.get("https://www.amazon.in/");
		Actions a = new Actions(driver);
		WebElement searchbox = driver.findElement(By.id("twotabsearchtextbox"));
		WebElement search = driver.findElement(By.xpath("//input[@type='submit']"));
		a.moveToElement(searchbox).click().keyDown(Keys.SHIFT).sendKeys("grit").build().perform();
		a.moveToElement(search).click().build().perform();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[contains(text(),'Grit Factor: 15 Attributes to Doing Life Better')]")).click();
		Set<String>Windows = driver.getWindowHandles();
		Iterator<String>IT =Windows.iterator();
		String parentID = IT.next();
		String ChildID = IT.next();
		System.out.println(driver.getTitle());
		Thread.sleep(3000);
		driver.switchTo().window(ChildID);
		System.out.println(driver.getTitle());
		
		

	}

}
