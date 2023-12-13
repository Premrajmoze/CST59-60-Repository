package testNGGroupsdemo;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Test;

public class Listenertestcase1 {
@Test
void TC4()
{
	System.out.println("TC4 passed...");
	Assert.assertTrue(true,"intetionaly passed");
}
@Test
void TC5()
{
	System.out.println("TC5 failed...");
	Assert.assertTrue(false,"intetionaly failled");
}
@Test
void TC6()
{
	System.out.println("TC6 skkiped...");
	throw new SkipException("Intentioannly Skipping TC3...");
}

}
