package testng;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class webtable {

	@Test
	public void wb() throws Exception{
		
		// System.setProperty("webdriver.chrome.driver","D:\\Library\\chromedriver.exe" );
			FirefoxDriver driver=new FirefoxDriver();	
			 
			// driver.manage().window().maximize();
		driver.get("http://www.timeanddate.com/worldclock/");
		driver.manage().window().maximize();
		
		Thread.sleep(5000);
		//identify the webtable
		WebElement table=driver.findElement(By.xpath("html/body/div[1]/div[7]/section[2]/div[1]/table"));
		
		//no.of rows
		List<WebElement> rows=table.findElements(By.tagName("tr"));
		System.out.println(rows.size());
		/*
		for(int i=0;i<rows.size();i++)
		{
			//no.of colomns
			List<WebElement> cols=rows.get(i).findElements(By.tagName("td"));
			System.out.println(cols.size());
			
			for(int j=0;j<cols.size();j++)
			{
				System.out.print(cols.get(j).getText()+"  ");
			}
			System.out.println(rows.get(i).getText()+"  ");

		}*/

	}
}
