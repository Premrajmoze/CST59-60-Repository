package testNGparameter;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class str {
	@Test
@Parameters("first_name")

public void string(String s)
{
	String st = "hello";
	System.out.println(s);
	System.out.println(st);
	//System.out.println(st+s);
}
}
