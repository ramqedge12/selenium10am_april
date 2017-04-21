package day5;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;



public class Links_Visible {

	public static void main(String[] args) throws Exception {
		
		FirefoxDriver d=new FirefoxDriver();
		d.navigate().to("http://google.com/");
		d.manage().window().maximize();
		
		//identify the no .of links
		List<WebElement> elements= d.findElements(By.tagName("a"));
		System.out.println(elements.size());
		
		for (int i = 0; i < elements.size(); i++) 
		{
			//if link text is not empty ( Visible)
			if(   ! elements.get(i).getText().isEmpty())
			{
				Thread.sleep(1000);
			elements.get(i).click();
			String url= d.getCurrentUrl();
			System.out.println(url);
			
			d.navigate().back();
			elements= d.findElements(By.tagName("a"));
			}
		}

	}

}




