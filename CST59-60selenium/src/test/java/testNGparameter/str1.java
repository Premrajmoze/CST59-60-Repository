package testNGparameter;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class str1 {
	@Test
@Parameters("first_name")

public void string(String s1)
{
	String st = "hello";
	System.out.println(s1);
	System.out.println(st);
	//System.out.println(st+s1);
}
}
