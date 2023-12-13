package testNGparameter;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class str2 {
	@Test
@Parameters("first_name")

public void string(String s2)
{
	String st = "hello";
	System.out.println(s2);
	System.out.println(st);
	//System.out.println(st+s2);
}
}
