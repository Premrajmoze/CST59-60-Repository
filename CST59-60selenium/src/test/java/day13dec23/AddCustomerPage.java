package day13dec23;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.github.javafaker.Faker;

public class AddCustomerPage {
	 WebDriver driver;
	    // constructor
	    AddCustomerPage(WebDriver driver)
	    {
	        this.driver = driver;
	    }

	    //Locators
	    private final By txtFirstName = By.name("firstName");
	    private final By txtMiddleName = By.name("middleName");
	    private final By txtLastName = By.name("lastName");
	    private final By btnSave     = By.xpath("//button[@type='submit']");
	    private final By confirmationMsg = By.xpath("//*[@id='oxd-toaster_1']/div");
	    // methods
	    private void enterFirstName(String firstName)
	    {
	        driver.findElement(txtFirstName).sendKeys(firstName);
	    }
	    private void enterMiddleName(String middleName)
	    {
	        driver.findElement(txtMiddleName).sendKeys(middleName);
	    }
	    private void enterLastName(String lastName)
	    {
	        driver.findElement(txtLastName).sendKeys(lastName);
	    }

	    void clickSaveBtn()
	    {
	        driver.findElement(btnSave).click();
	    }
	    public void addCustomerDetails() throws InterruptedException
	    {
	        Faker f = new Faker();

	        enterFirstName(f.name().firstName());
	        enterMiddleName(f.name().lastName());
	        enterLastName(f.name().firstName()+"_Sr");

	    }
	   public String getconfirmationMsg()
	    {
	        return driver.findElement(confirmationMsg).getText();
	    }

	}