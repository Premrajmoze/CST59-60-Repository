package testNGdemo;

import java.util.Random;

import org.testng.annotations.Test;


public class secondday_5 {
	
	@Test(invocationCount=12)
	public void reg()
	{
		Random rnd = new Random();
		long no = rnd.nextInt(1000);
		System.out.println("New User generated : " + "USER_" + no);
	}
}

