package Assertdemo;

import java.util.ArrayList;
import java.util.List;

import org.apache.poi.util.IntList;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssertDemo {

	@Test
		void test1string()
		{
		System.out.println("test1 method started...");
		String actual = "pune";
		String expec  = "pune1";
	
			Assert.assertEquals(actual, expec, 
					"Actual city is not matcches for expec city");
			System.out.println("test1 method ended...");
		}
	@Test
		void test2Integer()
		{
		System.out.println("test2 method started...");
		Integer actprice =  100;
		Integer expprice  = 100;
	
			Assert.assertEquals(actprice, expprice, 
					"Actual price is not matcches for expec price");
			System.out.println("test2 method ended...");
		}
	
	@Test
		void test3list()
		{
		System.out.println("test3 method started...");
		List<Integer> al1 = new ArrayList();	
		al1.add(10);
		al1.add(20);
		al1.add(30);
		List<Integer> al2 = new ArrayList();
		al2.add(10);
		al2.add(20);
		al2.add(30);
			Assert.assertEquals(al1, al2, 
					"Actual list is not matcches for expec list");
			System.out.println("test3 method ended...");
		}
	
}
