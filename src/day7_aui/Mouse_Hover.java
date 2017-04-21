package day7_aui;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.server.browserlaunchers.Sleeper;


public class Mouse_Hover {

	public static void main(String[] args) {
		
		FirefoxDriver d=new FirefoxDriver();
		d.get("https://www.emirates.com/in/English/");
		d.manage().window().maximize();

		// identify the EXPERIENCE lINK
		WebElement exp= d.findElement(By.xpath("html/body/form/header/div[2]/nav/div/ul/li[4]/a/span[1]"));
		
		// identify the BOOK lINK
		WebElement book= d.findElement(By.xpath("html/body/form/header/div[2]/nav/div/ul/li[1]/a/span[1]"));
		
		
		Actions mo=new Actions(d);
		Sleeper.sleepTightInSeconds(2);
		
		mo.moveToElement(exp).moveToElement(book).build().perform();
	
	}

}
