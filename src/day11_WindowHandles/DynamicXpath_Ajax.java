package day11_WindowHandles;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;
import org.testng.annotations.Test;

public class DynamicXpath_Ajax {
 
  @Test
  public void f() {
	  
	  WebDriver driver=new FirefoxDriver();
		driver.get("https://in.yahoo.com/?p=us");
		driver.manage().window().maximize();
		Sleeper.sleepTightInSeconds(3);
		
		//search BOx
		driver.findElement(By.id("uh-search-box")).sendKeys("selenium");
		
		//identify the multiple elements in ajax
		List<WebElement> links= driver.findElements(By.xpath("//*[starts-with(@id,'yui_3_18_0_3_1491')]/span"));
		System.out.println(links.size());
		Sleeper.sleepTightInSeconds(3);
		
		// click selenium tutorial
		links.get(2).click();
		
		
		
  }
}
