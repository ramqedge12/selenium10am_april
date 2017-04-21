package day20;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ExplicitWait_Fluentwait {
	FirefoxDriver driver;
	
	@Test
	public void waitTest()
	{
		

		driver=new FirefoxDriver();
		driver.get("http://www.amazon.in/");
		driver.manage().window().maximize();
		
		
		FluentWait<WebDriver> fwait=new FluentWait<WebDriver>(driver)
				
				.withTimeout(30, TimeUnit.SECONDS)
				.pollingEvery(2, TimeUnit.SECONDS)
				.ignoring(NoSuchElementException.class);
		        
		
	//FluentWait<WebDriver> obj=new FluentWait<WebDriver>(driver)
		
		
		//FluentWait<WebDriver> fwait=new FluentWait<WebDriver>(driver).withTimeout(10,TimeUnit.SECONDS).pollingEvery(2,TimeUnit.SECONDS).ignoring(NoSuchElementException.class);
		
		// Click on Secure Login
		driver.findElement(By.xpath("html/body/div[1]/div[1]/div[2]/div/div/div[1]/div/div/div/div/div/div[2]/div/span/span/a/span")).click();
		
		//Username
		fwait.until(ExpectedConditions.invisibilityOfElementLocated
				   (By.id("ap_emailfdgfgfdgfdgd")));
		
		//Password
		fwait.until(ExpectedConditions.visibilityOfElementLocated
				            (By.id("ap_password"))).sendKeys("nnnnnndf343453534");
		
		
	}

}



