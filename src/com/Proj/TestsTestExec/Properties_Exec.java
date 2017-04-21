package com.Proj.TestsTestExec;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Properties_Exec {
	
	public WebDriver d;
	
  @Test
  public void f() throws IOException ,FileNotFoundException{
	  
	  //Excel App
	  String path1="E:\\Worksapce10AM\\SeleniumProject10AM\\src\\com\\Proj\\Testdata\\LoginKeywords.xlsx";
		
		FileInputStream f=new FileInputStream(path1);

		XSSFWorkbook wb=new XSSFWorkbook(f);
		XSSFSheet ws=wb.getSheet("Sheet1");
	  
	  
	  //properties
	  
	  String path="E:\\Worksapce10AM\\SeleniumProject10AM\\src\\com\\Proj\\Properties\\test.properties";
	  
	  FileInputStream fis=new FileInputStream(path);
	  
	  Properties pr=new Properties();
	  pr.load(fis);
	  
	  d=new FirefoxDriver();
	  d.get("http://opensource.demo.orangehrmlive.com/");
	  
	  
	  d.findElement(By.id(pr.getProperty("un"))).sendKeys(ws.getRow(3).getCell(4).getStringCellValue());
	  d.findElement(By.id(pr.getProperty("psd"))).sendKeys(ws.getRow(4).getCell(4).getStringCellValue());
	  
	  d.findElement(By.id(pr.getProperty("logbtn"))).click();
	  
	  
  }
}
