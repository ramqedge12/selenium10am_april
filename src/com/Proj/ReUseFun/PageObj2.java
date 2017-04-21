package com.Proj.ReUseFun;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.server.browserlaunchers.Sleeper;
import org.openqa.selenium.support.FindBy;

public class PageObj2 {
	
	@FindBy(id="welcome") 
	WebElement wel;
	
	
	@FindBy(xpath="html/body/div[1]/div[1]/div/ul/li[2]/a") 
	WebElement logout;
	
	public void welcomeAd()
	{
		wel.click();
		
		Sleeper.sleepTightInSeconds(2);
		
		logout.click();
		
		
		
	}

}
