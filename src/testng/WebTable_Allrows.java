package testng;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;
import org.testng.annotations.Test;

public class WebTable_Allrows {
  
public 	static WebDriver d;
	
	@Test
	public void table(){
		
		d=new FirefoxDriver();
		d.navigate().to("https://www.timeanddate.com/worldclock/");
		d.manage().window().maximize();
		
		Sleeper.sleepTightInSeconds(2);
		WebElement table= d.findElement(By.xpath("html/body/div[1]/div[8]/section[2]/div[1]/table"));
		
		List<WebElement> rows= table.findElements(By.tagName("tr"));
		System.out.println(rows.size());
		
		for(int i=0;i<rows.size();i++)
		{
			 List<WebElement> cols= rows.get(i).findElements(By.tagName("td"));
			 System.out.println(cols.size());
			
			 for(int j=0;j<cols.size();j++)
			{
				System.out.print(cols.get(j).getText()+"    ");
			}
			 
		System.out.println();
			 
		}
		
		
  }
  
  
  
 

}
