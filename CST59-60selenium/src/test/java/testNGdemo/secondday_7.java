package testNGdemo;

import java.util.Random;

import org.testng.annotations.Test;


public class secondday_7 {
	
	@Test(expectedExceptions=NullPointerException.class)
	public void reg() throws InterruptedException
	{
		String s = null;
		System.out.println(s.length());
		Random rnd = new Random();
		long no = rnd.nextInt(1000);
		System.out.println("New User generated : " + "USER_" + no);
	}
}

