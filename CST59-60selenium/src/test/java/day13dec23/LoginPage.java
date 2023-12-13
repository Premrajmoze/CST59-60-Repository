package day13dec23;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	  /*
     * 1. constructor(driver)
     * 2. Locators
     * 3. methods
     */

    WebDriver driver;
    LoginPage(WebDriver driver)
    {
        this.driver= driver;
    }
    // Locators
    private final By txtUserName = By.name("username");
    private final By txtPassword = By.name("password");
    private final By btnLogin    = By.xpath("//button[@type='submit']");

    // methods
    private LoginPage enterUserName(String un)
    {
        driver.findElement(txtUserName).sendKeys(un);
        return this;
        //	return new LoginPage(driver);
    }
    private LoginPage enterPassword(String pw)
    {
        driver.findElement(txtPassword).sendKeys(pw);
        return this;
    }

    private LandingPage clickBtnLogin()
    {
        driver.findElement(btnLogin).click();
        return new LandingPage(driver);
    }


    public LandingPage LoginToAppl(String un, String pw)
    {
        return enterUserName(un).enterPassword(pw).clickBtnLogin();
    }
}