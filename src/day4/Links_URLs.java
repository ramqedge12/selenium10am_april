package day4;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Links_URLs {

	public static void main(String[] args) {
		
		FirefoxDriver d=new FirefoxDriver();
		d.navigate().to("http://newtours.demoaut.com/");
		d.manage().window().maximize();
		
		List<WebElement> elements= d.findElements(By.tagName("a"));
		System.out.println(elements.size());
		
		for (int i = 0; i < elements.size(); i++) 
		{
			elements.get(i).click();
			String url= d.getCurrentUrl();
			System.out.println(url);
			
			d.navigate().back();
			
			elements= d.findElements(By.tagName("a"));
			
		}
	}
}
