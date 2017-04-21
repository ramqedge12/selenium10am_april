package day2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

import com.gargoylesoftware.htmlunit.BrowserVersion;

public class HtmlUnit_driver {

	public static void main(String[] args) {
		
		WebDriver driver=new HtmlUnitDriver(BrowserVersion.FIREFOX_38);
		driver.get("http://fb.com");
		
		System.out.println(driver.getTitle());
		

	}

}
