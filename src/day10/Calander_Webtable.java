package day10;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Calander_Webtable {
	FirefoxDriver driver;
	
	@BeforeTest
	public void setUp()
	{
		driver=new FirefoxDriver();
		driver.get("http://www.cleartrip.com/");
		driver.manage().window().maximize();
		Sleeper.sleepTightInSeconds(3);
		
	}
	@Test
	public void calanderTest()
	{
		
		
		driver.findElement(By.id("OneWay")).click();
		driver.findElement(By.id("FromTag")).sendKeys("Hyderabad, IN - Rajiv Gandhi International (HYD)");
		driver.findElement(By.id("ToTag")).sendKeys("New Delhi, IN - Indira Gandhi Airport (DEL)");

// Click on Date
		driver.findElement(By.xpath
				("//*[@id='ORtrip']/section[2]/div[1]/dl/dd/div/a/i")).click();
		
//User defined date
		String doj="10/May/2018";
		 
		String a[]= doj.split("/");
		
		
		
		
		String day=a[0];
		String month= a[1];
		String year=a[2];
		
// get the calander year text
		String calyear=driver.findElement(By.className("ui-datepicker-year")).getText();

		
		
		while(! calyear.equals(year))
		{
//click on Arrow in calander
			driver.findElement(By.xpath("//*[@id='ui-datepicker-div']/div[2]/div/a"))
			.click();

        // get the calander year text
			calyear=driver.findElement(By.className("ui-datepicker-year")).getText();
		}

		
		
       // get the calander month text
		String calmonth=driver.findElement(By.className("ui-datepicker-month")).getText();

		while(!calmonth.equals(month))
		{

         //click on Arrow in calander

			driver.findElement(By.xpath("//*[@id='ui-datepicker-div']/div[2]/div/a"))
			.click();
			calmonth=driver.findElement(By.className("ui-datepicker-month")).getText();
		}
		
		
		WebElement table=driver.findElement(By.xpath("//*[@id='ui-datepicker-div']/div[1]"));
		List<WebElement> rows=table.findElements(By.tagName("tr"));
		Sleeper.sleepTightInSeconds(2);
		
		
		System.out.println(rows.size());
		
		
		for(int i=0;i<rows.size();i++)
		{
			List<WebElement> cols=rows.get(i).findElements(By.tagName("td"));
			Sleeper.sleepTightInSeconds(1);
			
			for(int j=0;j<cols.size();j++)
			{
				if(cols.get(j).getText().equals(day))
				{
					cols.get(j).click();
					break;
				}
			}
		}
		Sleeper.sleepTightInSeconds(4);
		driver.findElement(By.id("SearchBtn")).click();
			
	}
	
}

