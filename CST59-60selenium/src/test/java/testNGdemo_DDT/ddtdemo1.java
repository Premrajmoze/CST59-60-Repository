package testNGdemo_DDT;

import java.util.HashMap;
import java.util.Map;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

	public class ddtdemo1 {
		@Test(dataProvider="DP")
		public void login(HashMap<String,String> map)
		{
			System.out.println("user loggin traying + US :" +map.get("name")+map.get("pwd")+map.get("age") );
		}
		@DataProvider(name="DP")
		public Object[] getdata()
{
			Object[] data = new Object[4];
			
			Map<String,String> m1 = new HashMap<>();
			m1.put("name", "virat");
			m1.put("pwd", "rohit@gmail.com");
			m1.put("age", "32");
			data[0]= m1;
			
			Map<String,String> m2 = new HashMap<>();
			m2.put("name", "rohit");
			m2.put("pwd", "rohit@gmail.com");
			m2.put("age", "33");
			data[1]= m2;
			
			Map<String,String> m3 = new HashMap<>();
			m3.put("name", "vishal");
			m3.put("pwd", "vishal@gmail.com");
			m3.put("age", "36");
			data[2]= m3;
			
			Map<String,String> m4 = new HashMap<>();
			m4.put("name", "sharma");
			m4.put("pwd", "sharma@gmail.com");
			m4.put("age", "36");
			data[3]= m4;
			
			return data;
}
}

