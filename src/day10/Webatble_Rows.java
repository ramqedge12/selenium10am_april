package day10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;




public class Webatble_Rows {
  @Test
  public void f() {
	  
	  WebDriver d=new FirefoxDriver();
		d.navigate().to("https://www.timeanddate.com/worldclock/");
		d.manage().window().maximize();
		
		for(int i=1;i<=5;i++)
		{
			for (int j = 1; j <=3; j++) 
			{
				String str=d.findElement(By.xpath
		("html/body/div[1]/div[8]/section[2]/div[1]/table/tbody/tr["+i+"]/td["+j+"]"))
						.getText();         
			
				System.out.print(str+"   ");
			}
			
			System.out.println();
		}
	  
  }
}


