package day4;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Element_Exist {

	public static void main(String[] args) {
		
		FirefoxDriver d=new FirefoxDriver();
		d.navigate().to("http://www.hdfcbank.com/");
		d.manage().window().maximize();
		
		
		String src= d.getPageSource();
		System.out.println(src);
		
		
		if(src.contains("icici"))
		{
			System.out.println("Element is present");
		}
		else
		{
			System.out.println("Element is not present");
		}
		

	}

}
