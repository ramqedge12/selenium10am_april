package desktop_Components;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;
import org.testng.annotations.Test;

public class DownloadFile_AutoIT {
  
	@Test
  public void f() throws IOException {
	  
		FirefoxDriver d=new FirefoxDriver();
		d.navigate().to("http://www.seleniumhq.org/download/");
		d.manage().window().maximize();
		
		Sleeper.sleepTightInSeconds(2);
		// Click  3.3.1 link
		d.findElement(By.linkText("3.3.1")).click();
		
		Sleeper.sleepTightInSeconds(2);
		// implement/ Execute AutoIT script in Webdriver Testcase
		Runtime.getRuntime().exec("E:\\Worksapce10AM\\AutoIT\\Save_Auto.exe");
		
  }
}






