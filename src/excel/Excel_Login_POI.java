package excel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Excel_Login_POI {
  @Test
  public void f() throws IOException {
	  
	  FileInputStream fis= new FileInputStream
			        ("E:\\Worksapce10AM\\SeleniumProject10AM\\testdata\\test12.xlsx");
	  
	  XSSFWorkbook wb=new XSSFWorkbook(fis);
	  
	  XSSFSheet ws=wb.getSheetAt(0);
	  
	  FirefoxDriver d=new FirefoxDriver();
		d.navigate().to("http://opensource.demo.orangehrmlive.com/");
		d.manage().window().maximize();
		
		d.findElement(By.id("txtUsername")).sendKeys
		                    (ws.getRow(1).getCell(0).getStringCellValue());
        d.findElement(By.id("txtPassword")).sendKeys
                                 (ws.getRow(1).getCell(1).getStringCellValue());
		
		d.findElement(By.id("btnLogin")).click();
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
  }
}
