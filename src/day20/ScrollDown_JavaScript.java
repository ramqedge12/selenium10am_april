package day20;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;
import org.testng.annotations.Test;

public class ScrollDown_JavaScript {
  @Test
  public void f() throws InterruptedException {
	  
	  WebDriver driver=new FirefoxDriver();
		driver.navigate().to("http://hdfcbank.com/");
		driver.manage().window().maximize();
		
	
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	
		
		JavascriptExecutor jse= (JavascriptExecutor)driver;
		
		jse.executeScript("window.scrollBy(0,720)");
		
		
  }
}
