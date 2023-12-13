package testNGdemo_1;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class shipping
{
	@BeforeTest
	public void befor()
	{
		System.out.println("befor execut test case");
	}
	@AfterTest
	public void after()
	{
		System.out.println("after execut test case");
	}
	@Test
    public void test1()
{
	System.out.println("test1 in executed..");
}
	@Test
   public void test2()
{
	System.out.println("test2 in executed..");
	
}




}
