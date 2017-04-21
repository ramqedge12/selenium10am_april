package com.Proj.TestsTestExec;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.Proj.ReUseFun.PageObj1;
import com.Proj.ReUseFun.PageObj2;

public class PoM_Execution {
  @Test
  public void f() throws IOException {
	  
	//Excel
	  FileInputStream f1 = new FileInputStream("E:\\WorkSpace4pm\\Selenium_Project_4PM\\src\\com\\Project\\Testdata\\LoginKeywords1.xlsx");
	
	  XSSFWorkbook wd = new XSSFWorkbook(f1);
	 
	  XSSFSheet ws = wd.getSheet("Sheet3");
	  
	  
	  WebDriver d=new FirefoxDriver();
	  d.get("http://opensource.demo.orangehrmlive.com");
	  d.manage().window().maximize();
	  
	  PageObj1 obj=PageFactory.initElements(d, PageObj1.class);
	  
       PageObj2  obj2=	  PageFactory.initElements(d, PageObj2.class);
       
       String usern=ws.getRow(1).getCell(0).getStringCellValue();
       String passwd=ws.getRow(1).getCell(1).getStringCellValue();
       
       obj.loginApp(usern, passwd);
       
       Sleeper.sleepTightInSeconds(3);
       
       obj2.welcomeAd();
	  
	  
  }
}
