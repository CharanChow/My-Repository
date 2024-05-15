package automation.charan.Learn.charan;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class frameHandle {

	public static void main(String[] args) {
		WebDriver driver;
		driver = new FirefoxDriver();
		driver.get("https://jqueryui.com/droppable/");
		System.out.println(driver.findElements(By.tagName("iframe")).size());
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[class='demo-frame']")));
		Actions a =  new Actions(driver);
		WebElement drag = driver.findElement(By.cssSelector("div[id='draggable']"));
		WebElement drop = driver.findElement(By.id("droppable"));
		a.dragAndDrop(drag, drop).build().perform();

	}

}
