package day4;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;



public class Links_All {

	public static void main(String[] args) {
		
		FirefoxDriver d=new FirefoxDriver();
		d.navigate().to("https://www.timeanddate.com/");
		d.manage().window().maximize();
		
		//Identify the no .of links
		List<WebElement> link= d.findElements(By.tagName("a"));
		 int a= link.size();
		 System.out.println(a);
		 
		 
		 for( int i=1;i<a;i++)
		 {
			String name= link.get(i).getText();
			System.out.println(name);
		 }	 
	}
}


