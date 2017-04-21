package com.Proj.TestsTestExec;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

import com.Proj.ReUseFun.ReUse_Function;
//import com.Project.ReusableFunctions.Reuse_function;

public class Hybrid_HRM {
  
	public  String res;
	@Test
  public void f() throws IOException {
	  
		ReUse_Function reuse=new ReUse_Function();
		
		
		//Excel
		  FileInputStream f1 = new FileInputStream("E:\\WorkSpace4pm\\Selenium_Project_4PM\\src\\com\\Project\\Testdata\\LoginKeywords1.xlsx");
		
		  XSSFWorkbook wd = new XSSFWorkbook(f1);
		 
		  XSSFSheet ws = wd.getSheet("Sheet3");
		  
		 String username= ws.getRow(1).getCell(0).getStringCellValue();
		 String password= ws.getRow(1).getCell(1).getStringCellValue();
		  
		String res=  reuse.loginApp(username, password);
		  
		  
	  ws.getRow(1).createCell(2).setCellValue(res);
	  
	  String output="E:\\Worksapce10AM\\SeleniumProject10AM\\src\\com\\Proj\\TestResults\\hybris_output.xlsx";
		
		FileOutputStream fos=new FileOutputStream(output);
		wd.write(fos);
		fos.close();
		

	  
	  
	  
  }
}
