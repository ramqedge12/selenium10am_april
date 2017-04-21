package day5;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Hidden_Links {

	public static void main(String[] args) {
		
		FirefoxDriver d=new FirefoxDriver();
		d.navigate().to("http://google.com/");
		d.manage().window().maximize();
		
		// identify no.of links
		List<WebElement> total=d.findElements(By.tagName("a"));
		System.out.println("Total links ======"+total.size());
		
		int count=0;
		
		for (int i = 0; i < total.size(); i++) 
		{
			//if link text is not empty ( Visible)
			if(  !  total.get(i).getText().isEmpty())
			{
				count=count+1;   // count++;
			}
		}

		System.out.println("Visible Links===="+count);
		System.out.println("Invisible Links===="+(total.size()-count));
		
	}

}
