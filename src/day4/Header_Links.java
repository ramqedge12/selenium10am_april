package day4;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Header_Links {

	public static void main(String[] args) {
		
		FirefoxDriver d=new FirefoxDriver();
		d.navigate().to("https://www.bing.com/");
		d.manage().window().maximize();
		
		//identify the Block
		WebElement block= d.findElement(By.id("sc_hdu"));
		
		//identify the Block links
		List<WebElement> links=  block.findElements(By.tagName("a"));
		
		System.out.println(links.size());
		
		for(int j=0;j<links.size();j++)
		{
			System.out.println(links.get(j).getText());
		}
	
	}

}


