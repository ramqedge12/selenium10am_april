package desktop_Components;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;
import org.testng.annotations.Test;

public class UploadFile_AutoIT {
  
	@Test
  public void f() throws IOException {
	  
		FirefoxDriver d=new FirefoxDriver();
		d.navigate().to("http://toolsqa.com/automation-practice-form/");
		d.manage().window().maximize();
		
		Sleeper.sleepTightInSeconds(2);
		// Click Browse Button
		d.findElement(By.id("photo")).click();
		
		Sleeper.sleepTightInSeconds(2);
		
		// implement/ Execute AutoIT script in Webdriver Testcase
		Runtime.getRuntime().exec("E:/Worksapce10AM/AutoIT/Upload_Auto.exe");
 
	
	}
}





