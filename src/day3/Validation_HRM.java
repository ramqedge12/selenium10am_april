package day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;



public class Validation_HRM {

	public static void main(String[] args) {
		
		WebDriver d=new FirefoxDriver();
		d.get("https://www.facebook.com/");
		d.manage().window().maximize();
		
		
		String expres="Facebook";
		
	  String  actres=	d.getTitle();
	  System.out.println("The actuall launch Title is======="+actres);
	  
	  if(expres.equals(actres))
	  {
		  System.out.println("Launch Sucessssssssss");
	  }
	  else
	  {
		  System.out.println("Launch not Sucessssssssss");
	  }
	 
	 //Login Validation
	  
	  d.get("http://professional.demo.orangehrmlive.com/auth/login");
	  d.findElement(By.id("txtUsername")).sendKeys("Admin");
	  d.findElement(By.id("txtPassword")).sendKeys("admin");
	  d.findElement(By.id("btnLogin")).click();
	  
	  
	  String explog="Welcome Admin";
	  
	  //identify the Welcome Admin link
	  String actlog=  d.findElement(By.id("welcome")).getText();
	  System.out.println("The actuall login link is==="+actlog);
	  
	  
	  if(explog.equalsIgnoreCase(actlog))
	  {
		  System.out.println("Login sucess");
	  }
	  else
	  {
		  System.out.println("Login not sucess");
	  }
	}
}
