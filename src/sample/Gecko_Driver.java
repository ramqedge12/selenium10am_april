package sample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;



public class Gecko_Driver {

	public static void main(String[] args) {

		System.setProperty("webdriver.gecko.driver", 
				                             "E:\\Worksapce10AM\\geckodriver.exe");

		WebDriver driver=new FirefoxDriver();
		driver.navigate().to("https://www.amazon.com/");
		
		
	}

}
