package day7_aui;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.server.browserlaunchers.Sleeper;



public class Right_Click {

	public static void main(String[] args) {
		
		FirefoxDriver d=new FirefoxDriver();
		d.get("https://www.google.co.in/");
		d.manage().window().maximize();
		
		WebElement link= d.findElement(By.linkText("Gmail"));
		
		Actions rc=new Actions(d);
		
		Sleeper.sleepTightInSeconds(2);
		
	//	rc.contextClick(link).sendKeys("P").build().perform();
		// OR
		rc.contextClick(link).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN)
		                                    .click().build().perform();
	rc.doubleClick(link).perform();
	}

}

