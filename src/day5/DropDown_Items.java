package day5;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class DropDown_Items {

	public static void main(String[] args) {
		
		FirefoxDriver d=new FirefoxDriver();
		d.navigate().to("http://newtours.demoaut.com");
		d.manage().window().maximize();
		
		// click REGISTER link
		d.findElement(By.linkText("REGISTER")).click();
		
		// identify drop down
		WebElement drop= d.findElement(By.name("country"));
		
		// identify no.of items from dropdown
		List<WebElement> items= drop.findElements(By.tagName("option"));
		System.out.println(items.size());
		
		for (int i = 0; i < items.size(); i++) 
		{
			 String name=items.get(i).getText();
			
			items.get(i).click();
			
			if(items.get(i).isSelected())
			{
				System.out.println("element is working====="+name);
			}
			else
			{
				System.out.println("element is not working====="+name);
			}
				
		}
	}
}
