package day12_Robot;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;
import org.testng.annotations.Test;

public class UploadFile_Robot {
  @Test
  public void f() throws AWTException {
	  
	  FirefoxDriver d=new FirefoxDriver();
		d.navigate().to("http://toolsqa.com/automation-practice-form/");
		d.manage().window().maximize();
		
		// copy file path
		StringSelection src=new StringSelection("D:\\Demo\\xyz.png");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(src, null);
		
		Sleeper.sleepTightInSeconds(2);
		// Click Browse Button
		d.findElement(By.id("photo")).click();
		
		Sleeper.sleepTightInSeconds(2);
		
		
		Robot rb=new Robot();
		
		//Press Ctrl +V
		rb.keyPress(KeyEvent.VK_CONTROL);
		rb.keyPress(KeyEvent.VK_V);
		
		//release  V + Ctrl
		rb.keyRelease(KeyEvent.VK_V);
		rb.keyRelease(KeyEvent.VK_CONTROL);
		Sleeper.sleepTightInSeconds(2);
		
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);
		
			
  }
}


