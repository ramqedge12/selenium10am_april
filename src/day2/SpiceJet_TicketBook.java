package day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;



public class SpiceJet_TicketBook {

	public static void main(String[] args) throws Exception{
		
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.spicejet.com/");
		driver.manage().window().maximize();
		
		//click One Way
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
		
		//click on Leaving from
		
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXTaction")).click();
		driver.findElement(By.linkText("Hyderabad (HYD)")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.linkText("Bengaluru (BLR)")).click();
		Thread.sleep(2000);
		//date
		driver.findElement(By.linkText("25")).click();
		Thread.sleep(2000);
		
		new Select(driver.findElement(By.id("ctl00_mainContent_ddl_Adult"))).
		                                           selectByVisibleText("2 Adults");
		Thread.sleep(2000);
		new Select(driver.findElement(By.id("ctl00_mainContent_ddl_Child"))).
		                                             selectByVisibleText("1 Child");
		
		Thread.sleep(2000);
		
		//click Find Flights
		driver.findElement(By.id("ctl00_mainContent_btn_FindFlights")).click();
		
	}

}




