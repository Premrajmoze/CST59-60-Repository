package testNGGroupsdemo;

import org.testng.annotations.Test;

public class GroupDemo {
@Test(groups={"payment","smoke"})
void paymenttest1()
{
	System.out.println("paymenttest1 is running... ");
}
@Test(groups={"payment"})
void paymenttest2()
{
	System.out.println("paymenttest2 is running... ");
}
@Test(groups={"shippin"})
void shippingtest3()
{
	System.out.println("shippingtest3 is running... ");
}
@Test(groups={"shippin","regration"})
void shippingtest4()
{
	System.out.println("shippingtest4 is passed... ");
}
}
