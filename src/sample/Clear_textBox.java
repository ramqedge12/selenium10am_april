package sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;




public class Clear_textBox {

	public static void main(String[] args) throws Exception {
		
		WebDriver driver=new FirefoxDriver();
		driver.navigate().to("http://google.com");
		driver.manage().window().maximize();
	
		Thread.sleep(2000);
		
		// identify the serach box
		
		driver.findElement(By.id("lst-ib")).sendKeys("Selenium");
		Thread.sleep(2000);
		driver.findElement(By.id("lst-ib")).clear();
		Thread.sleep(2000);
		driver.findElement(By.id("lst-ib")).sendKeys("qtp");
		Thread.sleep(2000);
		
		//search button
		driver.findElement(By.id("_fZl")).click();

	}

}
