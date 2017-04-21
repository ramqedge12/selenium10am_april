package day20;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Cookies1 {
  @Test
  public void f() {
	  
	  WebDriver driver=new FirefoxDriver();
		 driver.get("http://fb.com/");
		 driver.manage().window().maximize();
	  
		 
	Set<Cookie> cook=	 driver.manage().getCookies();
	System.out.println(cook.size());
	
	  Iterator<Cookie> cokies=cook.iterator();
	  
	  while(cokies.hasNext())
	  {
		  Cookie ck= cokies.next();
	
		 System.out.println(ck.getDomain()+"-----"+ck.getName()+"-----"+ck.getValue()+"------"+ck.getExpiry());
	  }
	
	driver.manage().deleteAllCookies();
	
	 cook=	 driver.manage().getCookies();
	 System.out.println(cook.size());  
	  
  }
}
