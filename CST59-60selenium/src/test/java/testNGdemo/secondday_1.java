package testNGdemo;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class secondday_1 {

	@Test
	public void test1_reg()
	{
		System.out.println("test1 being executed.. in REG method");
	}
	
	@Test
	public void test2_login()
	{
		System.out.println("test2 being executed ..in LOGIN method");
	}
	
	@Test
	public void test3_logout()
	{
		System.out.println("test3 being executed ..in LOGout method");
	}
	@BeforeMethod 
	public void befor()
	{
		System.out.println("BEFOR executing the all test case in FIRST");
	}
	
	@AfterMethod 
	public void after()
	{
		System.out.println("AFTER executing the all test case in LAST");
	}
}
