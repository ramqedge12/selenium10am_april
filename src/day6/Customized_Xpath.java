package day6;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class Customized_Xpath {

	public static void main(String[] args) {
		
		FirefoxDriver d=new FirefoxDriver();
		d.navigate().to("https://www.amazon.com/");
		d.manage().window().maximize();
		
		Sleeper.sleepTightInSeconds(2);
		
		d.findElement(By.xpath
				("//div[@class='nav-search-field']/input[@id='twotabsearchtextbox']"))
		                             .sendKeys("java");

	}

}
