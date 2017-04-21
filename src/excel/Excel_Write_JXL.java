package excel;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.testng.annotations.Test;

import jxl.Workbook;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;
import jxl.write.biff.RowsExceededException;

public class Excel_Write_JXL {
  @Test
  public void f() throws IOException, RowsExceededException, WriteException {
	  
	  String path="E:\\Worksapce10AM\\SeleniumProject10AM\\testdata\\test.xls";
	  
	  FileOutputStream fos=new FileOutputStream(path);
	  WritableWorkbook wb=Workbook.createWorkbook(fos);
	  WritableSheet ws= wb.createSheet("Results", 0);
	  
	  
	  Label un=new Label(3, 5, "user");
	  ws.addCell(un);
	  
	  Label psd=new Label(5, 7, "psd");
	  ws.addCell(psd);
	 
	  
	 Label res= new Label(2, 5, "hello");
	  ws.addCell(res);
	  
	  
	  wb.write();
	  wb.close();
	 
	   
	   
	   
	  
	  
  }
}
