package excel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class Excel_JXL {
  @Test
  public void f() throws BiffException, IOException {
	  
	  
	  FileInputStream fis=new FileInputStream
			      ("E:\\Worksapce10AM\\SeleniumProject10AM\\testdata\\test.xls");
	 Workbook wb=  Workbook.getWorkbook(fis);
	 
	Sheet ws=  wb.getSheet("Sheet1");
	 
	  FirefoxDriver d=new FirefoxDriver();
		d.navigate().to("http://opensource.demo.orangehrmlive.com/");
		d.manage().window().maximize();
		
		d.findElement(By.id("txtUsername")).sendKeys(ws.getCell(0, 1).getContents());
		
		d.findElement(By.id("txtPassword")).sendKeys(ws.getCell(1, 1).getContents());
		
		d.findElement(By.id("btnLogin")).click();
		
  }
}
