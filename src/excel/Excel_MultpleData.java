package excel;

import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
//import org.apache.xerces.impl.dv.xs.DecimalDV;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;



public class Excel_MultpleData {
	

	@Test
	public void f() throws IOException, InterruptedException {
		
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://newtours.demoaut.com");
		
		FileInputStream f=new FileInputStream("E:\\Worksapce10AM\\SeleniumProject10AM\\testdata\\links.xlsx");
		
		XSSFWorkbook wb=new XSSFWorkbook(f);
		XSSFSheet ws=wb.getSheet("Sheet1");
		
	int	rc= ws.getLastRowNum();
		
		
		
		
		
		for(int i=1;i<=rc;i++)
		{
		
			//for(int j=1;j<=rc;j++)
			//{
			Thread.sleep(1000);
			
			//click link
			driver.findElement(By.linkText(ws.getRow(i).getCell(0).getStringCellValue())).click();
			
			
			
			//get current URL
			String acturl=driver.getCurrentUrl();
			
			//stores the data into Excel sheet
			ws.getRow(i).createCell(2).setCellValue(acturl);
			
			//  OR
			//c=r.createCell(2);
			//c.setCellValue(acturl);
			
			String expurl=ws.getRow(i).getCell(1).getStringCellValue();
			
			if(acturl.equals(expurl))
			{
				ws.getRow(i).createCell(3).setCellValue("PASS");
			}
			else
			{
				 Cell c =ws.getRow(i).createCell(3);
				 c.setCellValue("fail");
				
			}
			driver.navigate().back();
			
		}
		
		//stores the data into excel with new file 
		
		FileOutputStream fos=new FileOutputStream("E:\\Worksapce10AM\\SeleniumProject10AM\\testdata12345.xlsx");
	
		wb.write(fos);
		
		fos.close();
		

	}

}




 