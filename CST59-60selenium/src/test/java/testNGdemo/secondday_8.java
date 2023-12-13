package testNGdemo;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class secondday_8 {
	
	@BeforeMethod
	public void beforemethod()
	{
		System.out.println("i am in befor method");
	}
	@AfterMethod
	public void afteremethod()
	{
		System.out.println("i am in after method");
	}
	@BeforeSuite
	public void beforesuite()
	{
		System.out.println("i am in befor suite");
	}
	@AfterSuite
	public void afteresuite()
	{
		System.out.println("i am in after suite");
	}
	@BeforeClass
	public void beforeclass()
	{
		System.out.println("i am in befor class");
	}
	@AfterClass
	public void aftereclass()
	{
		System.out.println("i am in after class");
	}
	@BeforeTest
	public void beforetest()
	{
		System.out.println("i am in befor test");
	}
	@AfterTest
	public void afteretest()
	{
		System.out.println("i am in after test");
	}
	
	@Test
	public void reg()
	{
		System.out.println("user is traing to registation...");
	}
}

