package day5;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class Alerts1 {

	public static void main(String[] args) 
	{
		FirefoxDriver d=new FirefoxDriver();
		d.navigate().to("http://primusbank.qedgetech.com/");
		d.manage().window().maximize();
		
		d.findElement(By.id("login")).click();
		Sleeper.sleepTightInSeconds(2);
		
		String str= d.switchTo().alert().getText();
		System.out.println(str);
		
		Sleeper.sleepTightInSeconds(2);
		
		d.switchTo().alert().accept();
		
	}

}
