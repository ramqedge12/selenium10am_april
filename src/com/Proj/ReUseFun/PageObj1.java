package com.Proj.ReUseFun;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class PageObj1 {
	
	@FindBy(id="txtUsername") 
	@CacheLookup
	WebElement un;
	
	@FindBy(id="txtPassword") 
	@CacheLookup
	WebElement psd;
	
	@FindBy(id="btnLogin") 
	@CacheLookup
	WebElement log;
	
	public void loginApp(String u, String p)
	{
		un.sendKeys(u);
		psd.sendKeys(p);
		log.click();
	}
	

}
