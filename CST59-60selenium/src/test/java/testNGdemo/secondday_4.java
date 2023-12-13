package testNGdemo;

import org.testng.Assert;
import org.testng.annotations.Test;


public class secondday_4 {
	
	@Test(description = "this test script is used to register a user")
	public void reg()
	{
		System.out.println("User is trying to REGISTER");
		
	}
	@Test(enabled=false, description="this method validates item which are purchased by registered user")
	public void purchaseItems()
	{
		System.out.println("User is trying to purchaseItems");
	}
	
}

