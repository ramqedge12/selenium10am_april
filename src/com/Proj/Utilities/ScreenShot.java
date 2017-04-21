package com.Proj.Utilities;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class ScreenShot {
	
	public static  void screens(WebDriver driver, String sname) throws IOException
	{
		String path12="E:\\Worksapce10AM\\SeleniumProject10AM\\src\\com\\Proj\\Screens\\"+sname+".jpg";
		
		 File src =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		 
		 FileUtils.copyFile(src, new File(path12));
	}

}
