
package testNGdemo_1;


import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class Pyment {

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
	   public void test3()
	{
		System.out.println("test3 in executed..");
	}
	@Test
	   public void test4()
	{
		System.out.println("test4 in executed..");
		
	}
	}

