package automation.charan.Learn.charan;

import java.util.concurrent.TimeUnit;

import org.bouncycastle.oer.its.ieee1609dot2.basetypes.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.webdriver.WebDriverBrowser;

public class dynamicDropdown {

	

	
	public static void main(String[] args) throws Exception {
		
		WebDriverManager.chromedriver().setup();
		ChromeOptions c = new ChromeOptions();
		c.addArguments("--disable-notifications");
		
		WebDriver driver = new ChromeDriver(c);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(java.time.Duration.ofSeconds(5));
		
		driver.get("https://www.airindia.com/");
		driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys("HYD");
		
		WebDriverWait w = new WebDriverWait(driver, java.time.Duration.ofSeconds(5));
		WebElement cookie = driver.findElement(By.xpath("//button[@id='onetrust-accept-btn-handler']"));
		w.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@id='onetrust-accept-btn-handler']")));
		
		cookie.click();
		driver.findElement(By.xpath("(//input[@role='combobox'])[2]")).sendKeys("BLR");
		
		

	}

}
