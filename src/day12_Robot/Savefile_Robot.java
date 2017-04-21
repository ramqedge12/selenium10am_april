package day12_Robot;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;
import org.testng.annotations.Test;

public class Savefile_Robot {
  @Test
  public void f() throws AWTException {
	  
	  FirefoxDriver d=new FirefoxDriver();
		d.navigate().to("http://www.seleniumhq.org/download/");
		d.manage().window().maximize();
		
		Sleeper.sleepTightInSeconds(2);
		// Click  3.3.1 link
		d.findElement(By.linkText("3.3.1")).click();
		
		Sleeper.sleepTightInSeconds(2);
		
		Robot robo=new Robot();
		
		robo.delay(2000);
		
		robo.keyPress(KeyEvent.VK_TAB);
		robo.keyRelease(KeyEvent.VK_TAB);
		
		robo.keyPress(KeyEvent.VK_ENTER);
		robo.keyRelease(KeyEvent.VK_ENTER);
		
		
			
  }
}
