package day8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;



public class Drag_Drop {

	public static void main(String[] args) {
		
		FirefoxDriver d=new FirefoxDriver();
		d.get("http://jqueryui.com/droppable/");
		d.manage().window().maximize();
		
		d.switchTo().frame(0);
		
		//identify source element
		 WebElement src= d.findElement(By.id("draggable"));
		//identify target element
		
		 WebElement target= d.findElement(By.id("droppable"));
		 
		 
		 Actions dd=new Actions(d);
		 
		 dd.dragAndDrop(src, target).build().perform();

	}

}




