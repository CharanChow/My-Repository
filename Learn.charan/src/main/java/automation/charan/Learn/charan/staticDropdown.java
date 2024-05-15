package automation.charan.Learn.charan;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class staticDropdown {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/");
		driver.findElement(By.xpath("//a[@href='/dropdown']")).click();
		Select s = new Select(driver.findElement(By.id("dropdown")));
		s.selectByIndex(2);
		s.selectByVisibleText("Option 1");
		System.out.println(s.getFirstSelectedOption().getText());
		

	}

}
