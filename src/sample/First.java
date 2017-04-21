package sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class First {

	public static void main(String[] args) {
		
		WebDriver driver;
		
		driver=new FirefoxDriver();
		driver.get("http://fb.com");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("email")).sendKeys("112234444444");
		driver.findElement(By.id("pass")).sendKeys("djfhdjhjdhjdh");
		
		driver.findElement(By.id("u_0_q")).click();
	}

}
