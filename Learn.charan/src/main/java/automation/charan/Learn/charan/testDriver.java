package automation.charan.Learn.charan;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class testDriver {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.booking.com/");
		Set<String> w =driver.getWindowHandles();
		Iterator<String> it = w.iterator();
		String Parent= it.next();
		String child = it.next();
		driver.switchTo().window(child).close();
		driver.switchTo().window(Parent);
		driver.findElement(By.xpath("//input[@name='ss']")).sendKeys("Hyderabad");
		driver.findElement(By.xpath("//div[@data-testid='searchbox-dates-container']")).click();
		driver.findElement(By.cssSelector("span[aria-label='19 May 2024']")).click();
		driver.findElement(By.cssSelector("span[aria-label='6 June 2024']")).click();
		driver.findElement(By.cssSelector("button[type='submit']")).click();

		
		

	}

}
