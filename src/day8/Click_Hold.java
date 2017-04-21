package day8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.server.browserlaunchers.Sleeper;



public class Click_Hold {

	public static void main(String[] args) {
		
		FirefoxDriver d=new FirefoxDriver();
		d.get("http://jqueryui.com/");
		d.manage().window().maximize();
		
		WebElement src= d.findElement(By.linkText("Draggable"));
		
		Actions act=new Actions(d);
		
		act.clickAndHold(src).perform();
		
		Sleeper.sleepTightInSeconds(2);
		
		act.release(src).perform();
		
		

	}

}
