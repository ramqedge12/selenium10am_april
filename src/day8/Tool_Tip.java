package day8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class Tool_Tip {

	WebDriver d;
	
	public void abc()
	{
		 d=new FirefoxDriver();
		d.get("http://demoqa.com/tooltip/");
		d.manage().window().maximize();
	}
	
	public void tooltip()
	{
		//identify Text Box
				WebElement src= d.findElement(By.id("age"));
				Sleeper.sleepTightInSeconds(2);
				
				Actions act=new Actions(d);
				
				act.moveToElement(src).perform();
				
				Sleeper.sleepTightInSeconds(2);
				
				//identify Tool Tip Box
				  String str= d.findElement(By.className("ui-tooltip-content")).getText();

				  System.out.println(str);
	}
	
	
	
	public static void main(String[] args) {
		
		Tool_Tip obj=new  Tool_Tip();
		
		obj.abc();
		obj.tooltip();
	}

}




