package day8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;



public class Slider {

	public static void main(String[] args) {
		
		FirefoxDriver d=new FirefoxDriver();
		d.get("http://jqueryui.com/slider/#slider-vertical");
		d.manage().window().maximize();
		
		d.switchTo().frame(0);
		
		//identify the slider
		WebElement slider= d.findElement(By.xpath(".//*[@id='slider-vertical']/span"));
		
		int a= slider.getLocation().y;
		
		Actions act=new Actions(d);
		
		act.dragAndDropBy(slider,60, a).build().perform();

		
		
		
	}

}







