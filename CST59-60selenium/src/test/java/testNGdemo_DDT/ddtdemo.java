package testNGdemo_DDT;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

	public class ddtdemo {
		@Test(dataProvider="DP")
		public void login(String USER,String password)
		{
		if(USER.equals("rahul"))
		{
{		Assert.fail("For this data set, login test is failed...");
			System.out.println("user loggin traying + US :" + USER + "PWD:" + password);
}
		}
		}
		@DataProvider(name="DP")
		public Object [][] getdata()
{
			Object [][] data = new Object[4][2];
			data[0][0]= "virat";
			data[0][1]= "virat@gmail.com";
			data[1][0]= "rohit";
			data[1][1]= "rohit@gmail.com";
			data[2][0]= "rahul";
			data[2][1]= "rahul@gmail.com";
			data[3][0]= "rushi";
			data[3][1]= "rushi@gmail.com";
			return data;
}
}

