package testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;



public class Webtable_AllRows_Col {
  @Test
  public void f() {
	  
	  WebDriver d=new FirefoxDriver();
		d.navigate().to("https://www.timeanddate.com/worldclock/");
		d.manage().window().maximize();
		
		
		 String str1="html/body/div[1]/div[8]/section[2]/div[1]/table/tbody/tr[";
		String str2= "]/td[5]";
		
		
		for(int i=1;i<=36;i++)
		{
			String name= d.findElement(By.xpath(str1+i+str2)).getText();
			System.out.println(name);
		
		}
  }
}



