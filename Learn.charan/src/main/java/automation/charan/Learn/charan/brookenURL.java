package automation.charan.Learn.charan;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class brookenURL {

	public static void main(String[] args) throws Exception, Exception {
		WebDriver driver;
		driver = new FirefoxDriver();
		driver.get("https://www.amazon.in/");
	String url =	driver.findElement(By.cssSelector("a[href$='https://press.aboutamazon.in/?utm_source=gateway&utm_medium=footer']")).getAttribute("href");
		HttpURLConnection conn = (HttpURLConnection)new URL(url).openConnection();
		conn.connect();
		int repc = conn.getResponseCode();
		if(repc>=400) {
			System.out.println(url +"link is broken");
		}
		else {
			System.out.println(url + "link is not broken");
		}

	}

}
