package testNGGroupsdemo;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Test;

public class Listenertestcase {
@Test
void TC1()
{
	System.out.println("TC1 passed...");
	Assert.assertTrue(true,"intetionaly passed");
}
void TC2()
{
	System.out.println("TC2 failed...");
	Assert.assertTrue(false,"intetionaly failled");

}
void TC3()
{
	System.out.println("TC3 skkiped...");
	throw new SkipException("Intentioannly Skipping TC3...");
}

}
