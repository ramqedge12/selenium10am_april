package testng;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;

public class NewTest {
  
	@Test(priority=0)
	public void f() 
	{
		System.out.println("C/A");
	}
	@Test(priority=1)
	public void a()
	{
		System.out.println("Login");
	}
	@Test(priority=2)
	public void b()
	{
		System.out.println("Login");
	}
	@BeforeTest
	public void beforeTest() 
	{
		System.out.println("launch");
	}
  @AfterMethod
  public void afterTest() 
  {
	  System.out.println("Close");
  }

}
