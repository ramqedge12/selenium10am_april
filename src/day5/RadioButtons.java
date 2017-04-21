package day5;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RadioButtons {

	public static void main(String[] args) {
		
		FirefoxDriver d=new FirefoxDriver();
		d.navigate().to("http://echoecho.com/htmlforms10.htm");
		d.manage().window().maximize();
		
		// identify block of radio btns
		WebElement block=d.findElement(By.xpath("html/body/div[2]/table[9]/tbody/tr/td[4]/table/tbody/tr/td/div/span/form/table[3]/tbody/tr/td/table/tbody/tr/td"));

		// identify group1 elements
		 List<WebElement> radio= block.findElements(By.name("group1"));
		 System.out.println(radio.size());
		 
		 
		 for (int i = 0; i < radio.size(); i++) 
		 {
			System.out.println(radio.get(i).getAttribute("value")+"-----"
                                            +radio.get(i).getAttribute("checked"));
		}
		
	}

}
