package day6;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CheckBox_Testing2 {

	public static void main(String[] args) {
		
		FirefoxDriver d=new FirefoxDriver();
		d.get("http://echoecho.com/htmlforms09.htm");
		d.manage().window().maximize();
		
		// identify the 3 check boxes
	List<WebElement> checks=d.findElements(By.
			              xpath("//td[@class='table5']/input[@type='checkbox']"));
	System.out.println(checks.size());

	for (int i = 0; i < checks.size(); i++) 
	{
		
		// if check box is not selected
		if(  !  checks.get(i).isSelected())
		{
			checks.get(i).click();
			
			System.out.println(checks.get(i).getAttribute("value"));
		}
	
	}
	}
}
