package sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;



public class DropDown {

	@Test
	public void aaa(){
		
		WebDriver driver=new FirefoxDriver();
		driver.navigate().to("https://www.amazon.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("searchDropdownBox")).sendKeys("Books");
	
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("java");
		
		driver.findElement(By.className("nav-input")).click();
	}

}
