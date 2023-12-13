package Assertdemo;

import java.util.ArrayList;
import java.util.List;

import javax.swing.plaf.synth.SynthOptionPaneUI;

import org.apache.poi.util.IntList;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssertDemo1 {

	@Test
		void test1()
	{
	System.out.println("test method started...");
	//Assert.fail("Intentionally failing the test method...");
	System.out.println("test method completed...");
	
	System.out.println("test method started...");
	int i = 10;
	int j = 10;
	Assert.assertTrue(i==j,"i and j is not matched..");
	System.out.println("test method completed...");
	
	System.out.println("test method started...");
	int a = 10;
	int b = 20;
	Assert.assertFalse(a==b,"a and b is  matched..");
	System.out.println("test method completed...");
	
	HardAssertDemo1 hard = new HardAssertDemo1();
	//hard = null;
	//Assert.assertNull(hard,"contence not null value");
	hard = null;
	Assert.assertNull(hard,"contence not null value");
	
	int c=10,d=11;
	Assert.assertNotEquals(c, d,"both are is seme");
	}
}
