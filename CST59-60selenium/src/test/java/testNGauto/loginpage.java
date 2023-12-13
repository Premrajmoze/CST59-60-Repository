package testNGauto;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class loginpage
{
	WebDriver driver;
	@Test
	void test1()
	{
		Assert.assertEquals(driver.getTitle(), "OrangeHRM","titel is not match..");
	}
	@Test
	void test2() 
	{
		Assert.assertEquals(driver.getCurrentUrl(),"https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index","URL is not Match...");
	}
	
	@AfterMethod
	void tearDoun()
	{
		driver.quit();
	}
	
	@BeforeMethod
	@Test
	void setUp()
	{
		driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.className("oxd-button oxd-button--medium oxd-button--main orangehrm-login-button")).click();
	}
	}
