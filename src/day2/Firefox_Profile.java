package day2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;

public class Firefox_Profile {

	public static void main(String[] args) {
		
		//create profile
		ProfilesIni pr=new ProfilesIni();
		
		//create Firefoxprofile
		 FirefoxProfile fp= pr.getProfile("selenium_10");
		 
		 WebDriver driver=new FirefoxDriver(fp);
		 driver.get("http://fb.com");
	}

}
