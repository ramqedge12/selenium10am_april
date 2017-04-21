package grid;

import java.net.MalformedURLException;
import java.net.URL;

import org.apache.bcel.generic.CPInstruction;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;




public class Grid_Single {
  @Test
  public void f() throws MalformedURLException {
	  
	  DesiredCapabilities capb=null;
	  
	  capb=DesiredCapabilities.firefox();
	  
	  capb.setBrowserName("firefox");
	  capb.setPlatform(Platform.WINDOWS);
	  
	
	  RemoteWebDriver d=new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), capb);

	  d.get("http://fb.com");
	  
	  
	  
  }


}
