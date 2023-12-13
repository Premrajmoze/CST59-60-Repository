package day13dec23;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LandingPage {
	  WebDriver driver;
      LandingPage(WebDriver driver)
      {
          this.driver = driver;
      }

      // Locators
      private final By labelDashboard = By.xpath("//h6");
      private final By menuPIM        = By.xpath("//a[@href='/web/index.php/pim/viewPimModule']");
      private final By btnAdd         = By.xpath("//*[@id='app']//div[2]/div[1]/button");
      // Methods
      public String getLabelText()
      {
          return driver.findElement(labelDashboard).getText();
      }

      public LandingPage clickOnPIM()
      {
          driver.findElement(menuPIM).click();
          return this;
      }

      public AddCustomerPage clickOnAddBtn()
      {
          driver.findElement(btnAdd).click();
          return new AddCustomerPage(driver);
      }

  }
