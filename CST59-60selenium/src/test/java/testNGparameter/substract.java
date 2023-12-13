package testNGparameter;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class substract {
@Test
@Parameters({"a","b"})
public void sub(int c, int d)
{
	int subs = c-d;
	System.out.println("adding"+subs);
}
}
