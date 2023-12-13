package day13dec23;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Runner {
	
	 WebDriver driver;

     @BeforeMethod
     public void setUp() {
         driver = new ChromeDriver();
         driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
         driver.manage().window().maximize();
         driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
     }

     @AfterMethod
     public void tearDown() {
         driver.quit();
     }

     @Test(description = "Verifying login for Orange HRM")
     public void login() {
         LoginPage loginPage = new LoginPage(driver);

         LandingPage landingPage = loginPage.LoginToAppl("Admin", "admin123");

         String actLabel = landingPage.getLabelText();
         String expLabel = "Dashboard";
         Assert.assertEquals(actLabel, expLabel, "ERROR=> Label does not match");

//		verifyLabel(actLabel, expLabel);
     }

     @Test(description = "Add new customer")
     public void verifyAddCustomer() throws InterruptedException {
         LoginPage loginPage = new LoginPage(driver);
         LandingPage landingPage = loginPage.LoginToAppl("Admin", "admin123");
         String actLabel = landingPage.getLabelText();
         String expLabel = "Dashboard";
         Assert.assertEquals(actLabel, expLabel, "ERROR=> Label does not match");

         landingPage.clickOnPIM();
         AddCustomerPage acp = landingPage.clickOnAddBtn();
/*		acp.enterFirstName("FN_"  +System.currentTimeMillis());
		acp.enterMiddleName("MN_" +System.currentTimeMillis());
		acp.enterLastName("LN_"   +System.currentTimeMillis());
*/
         acp.addCustomerDetails();
         acp.clickSaveBtn();
         Thread.sleep(5000L);
     }
}
