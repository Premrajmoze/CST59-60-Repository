package testNGdemo;


import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class secondday_3 {

	@Test
	public void reg()
	{
		System.out.println("test1 being executed.. in REG method");
		Assert.fail("Interntionally marking as failed");
	}
	
	@Test(dependsOnMethods= {"reg"})
	public void login()
	{
		System.out.println("test2 being executed ..in LOGIN method");
	}
	
	@Test(dependsOnMethods= {"login"})
	public void logout()
	{
		System.out.println("test3 being executed ..in LOGout method");
		purchaseItems();
	}
	@BeforeMethod(alwaysRun = true)
	public void befor()
	{
		System.out.println("BEFOR executing the all test case in FIRST");
	}
	
	@AfterMethod (alwaysRun = true)
	public void after()
	{
		System.out.println("AFTER executing the all test case in LAST");
	}
	public void purchaseItems()
	{
		System.out.println("10 items are purchased!!!");
	}
}
