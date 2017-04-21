package day10;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;
import org.testng.annotations.Test;

public class Frames_Paytm {
  @Test
  public void f() {
	  
	  WebDriver d=new FirefoxDriver();
		d.navigate().to("https://paytm.com/");
		d.manage().window().maximize();
		
		Sleeper.sleepTightInSeconds(2);
		
		//click on login Link
		d.findElement(By.xpath("html/.........iv[3]/div[3]/div")).click();
		Sleeper.sleepTightInSeconds(3);
		
		//identify the mutliple frames
		 List<WebElement> frames= d.findElements(By.tagName("iframe"));
		 System.out.println(frames.size());
		 
		 for(int i=0;i<frames.size();i++)
		 {
			 d.switchTo().frame(i);
		 try{
			 Sleeper.sleepTightInSeconds(1);
			 
			 d.findElement(By.id("input_0")).sendKeys("949494949449");
			 d.findElement(By.id("input_1")).sendKeys("helooajsjjsj");
			 d.findElement(By.xpath("html/.....-content/button[1]")).click();
			 
		 }
		 catch(Exception e)
		 {
			 d.switchTo().defaultContent();
		 }
		 
		 } 
  }
}

