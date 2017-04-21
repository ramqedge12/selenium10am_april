package day11_WindowHandles;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;
import org.testng.annotations.Test;

public class CssSelector12 {
  @Test
  public void f() {
	  
	  WebDriver driver=new FirefoxDriver();
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
		Sleeper.sleepTightInSeconds(3);
		
		driver.findElement(By.cssSelector("input#twotabsearchtextbox")).
		                                                sendKeys("helloooooo");
		
  }
}
