package automation.charan.Learn.charan;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class scope {

	public static void main(String[] args) {
		WebDriver driver;
		driver = new FirefoxDriver();
		driver.get("https://www.amazon.in/");
		WebElement footer = driver.findElement(By.xpath("//div[@id='navFooter']"));
		System.out.println(footer.findElements(By.tagName("a")).size());

	}

}
