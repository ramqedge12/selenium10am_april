package day6;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class Radiobutton2 {
	
	public static void main(String[] args) {
	  
	  FirefoxDriver d=new FirefoxDriver();
		d.get("http://echoecho.com/htmlforms10.htm");
		d.manage().window().maximize();
		
		//xpath of the complete block of 2 radio groups
			WebElement block=d.findElement(By.xpath("html/body/div[2]/table[9]/tbody/tr/td[4]/table/tbody/tr/td/div/span/form/table[3]/tbody/tr/td/table/tbody/tr/td"));
			
		//loop for groups	
			for(int k=1;k<=2;k++)
			{
			   List<WebElement> radio=block.findElements(By.name("group"+k));
			  
		 // loop for 3 radio buttons of groups
			   for(int i=0;i<radio.size();i++)
		 	   {
				   radio.get(i).click();
				   
				   Sleeper.sleepTightInSeconds(2);
				   
			// loop for print every element name......
				   for(int j=0;j<radio.size();j++)
				   {
					   System.out.println(radio.get(j).getAttribute("value")+"---"
				                              +radio.get(j).getAttribute("checked"));
				   }
				   System.out.println("########################");
				}
			}
			
  }
  
}


