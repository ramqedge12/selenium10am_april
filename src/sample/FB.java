package sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class FB {

	public static void main(String[] args) {
		
		WebDriver driver=new FirefoxDriver();
		driver.navigate().to("https://fb.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("email")).sendKeys("hapy.hi.5");
	
		driver.findElement(By.id("pass")).sendKeys("9059973143");
		Sleeper.sleepTightInSeconds(2);
		
		driver.findElement(By.xpath("html/body/div[1]/div[2]/div/div/div/div/div[2]/form/table/tbody/tr[2]/td[3]/label/input")).click();
		
		Sleeper.sleepTightInSeconds(2);
		
		driver.findElement(By.id("userNavigationLabel")).click();
		
		Sleeper.sleepTightInSeconds(3);
		driver.findElement(By.linkText("Log out")).click();

	}

}
