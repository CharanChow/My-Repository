package automation.charan.Learn.charan;



import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Stream;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class App {
	public static void main(String args[]) {
		range(45);
		
		

	}
	public static boolean isPrime(int num) {
		if(num<=1) {
			return false;
			}
			for( int i = 2;i<num;i++) {
				if (num%i ==0) {
					return false;
				
			}
			 
		}
			return true;
	}
	public static void range(int num) {
	 for(int i = 2; i<=num;i++) {
		 if(isPrime(i)) {
			 System.out.println(i +" is a prime number");
		 }
	 }
	}
}


	



	

