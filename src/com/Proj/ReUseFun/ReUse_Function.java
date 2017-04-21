package com.Proj.ReUseFun;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.Proj.Utilities.ScreenShot;

public class ReUse_Function {
	
	public WebDriver d;
	
	public String loginApp(String un, String psd) throws IOException
	{
		//properties File
		 String path="E:\\Worksapce10AM\\SeleniumProject10AM\\src\\com\\Proj\\Properties\\test.properties";
		  
		  FileInputStream fis=new FileInputStream(path);
		  
		  Properties pr=new Properties();
		  pr.load(fis);
		
		  String expres="WelComAdmin";
		
		
		 d=new FirefoxDriver();
		  d.get("http://opensource.demo.orangehrmlive.com/");
		  
		  
		  d.findElement(By.id(pr.getProperty("un"))).sendKeys(un);
		  d.findElement(By.id(pr.getProperty("psd"))).sendKeys(psd);
		  
		  d.findElement(By.id(pr.getProperty("logbtn"))).click();
		
		 String actres= d.findElement(By.id("welcome")).getText();
		 
		 if(expres.equals(actres))
		 {
			 return "PASS";
		 }
		 else
		 {
			 
			 ScreenShot.screens(d, "Login");
			 
			 return "FAIL";
		 }
		
		
		
		
	}

}
