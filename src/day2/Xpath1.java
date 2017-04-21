package day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Xpath1 {

	public static void main(String[] args) {
		
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath(".//*[@id='searchDropdownBox']")).sendKeys("Books");
		
		driver.findElement(By.xpath("html/body/div[1]/header/div/div[1]/div[3]/div/form/div[3]/div[1]/input")).sendKeys("selenium");
		
		driver.findElement(By.xpath(".//*[@id='nav-search']/form/div[2]/div/input")).click();

	}

}
