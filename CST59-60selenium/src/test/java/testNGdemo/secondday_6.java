package testNGdemo;

import java.util.Random;

import org.testng.annotations.Test;


public class secondday_6 {
	
	@Test(timeOut=5000)
	public void reg() throws InterruptedException
	{
		Thread.sleep(500l);
		Random rnd = new Random();
		long no = rnd.nextInt(1000);
		System.out.println("New User generated : " + "USER_" + no);
	}
}

