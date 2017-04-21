package day20;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;
import org.testng.annotations.Test;

public class HiddenLinks_JavaScriptExe {
  @Test
  public void f() {
	  
		WebDriver driver=new FirefoxDriver();
		driver.navigate().to("http://bing.com/");
		driver.manage().window().maximize();
		
		//click one Driver button
		WebElement src= driver.findElement(By.id("officemenu_onedrive_img"));
		
		//click Excel Online  button
		WebElement src12= driver.findElement(By.id("officemenu_excel_img"));
		
		Sleeper.sleepTightInSeconds(2);
		
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		
		jse.executeScript("arguments[0].click()", src);
		
		Sleeper.sleepTightInSeconds(2);
		
		jse.executeScript("arguments[0].click()", src12);
		
		
		
		
		
		
		
		
  }
}


