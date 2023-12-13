package practice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class actitimedemo {
	static WebDriver driver;

	static void action(By by, String data) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2));
		wait.until(ExpectedConditions.presenceOfElementLocated(by));

		driver.findElement(by).sendKeys(data);
	}

	public static void main(String[] args) throws InterruptedException {
		driver = new ChromeDriver();
		driver.get("http://desktop-qogf4cp:82/login.do");
		driver.manage().window().maximize();
		action(By.xpath("//input[@type='text']"), ("admin"));
		action(By.xpath("//input[@type='password']"), ("manager"));
		WebElement wele = driver.findElement(By.className("initial"));
		wele.click();
		wele = driver.findElement(By.xpath("(//img[@src='/img/default/pixel.gif?hash=797059755'])[13]"));
		wele.click();
		wele = driver.findElement(By.xpath("(//span[@unselectable='on'])[1]"));
		wele.click();

		action(By.xpath("//input[@name='username']"), ("actitime"));
		action(By.xpath("//input[@name='passwordText']"), ("12345"));
		action(By.xpath("//input[@name='passwordTextRetype']"), ("12345"));
		action(By.xpath("//input[@name='firstName']"), ("prem"));
		action(By.xpath("//input[@name='lastName']"), ("moze"));
		action(By.xpath("//input[@name='middleName']"), ("vitthal"));
		action(By.xpath("//input[@name='email']"), ("abcd@123gmail.com"));
		action(By.xpath("//input[@name='phone']"), ("22-34567890"));
		action(By.xpath("//input[@name='fax']"), ("12xyz123ab"));
		action(By.xpath("//input[@name='mobile']"), ("1234567890"));
		action(By.xpath("//input[@name='otherContact']"), ("0987654321"));
		wele = driver.findElement(By.xpath("//option[@value='8']"));
		wele.click();
		driver.findElement(By.xpath("(//input)[105]")).click();
		wele = driver.findElement(By.xpath("//select[@name='selectedUserGroupId']/option[3]"));
		wele.click();
		Thread.sleep(3000l);
		WebElement ele = driver
				.findElement(By.xpath("(//td[@class='listtblcell userNameTableCell userWithGroupCell']"));

		/*
		 * //for (WebElement lwele : ele) { String org =
		 * "//td[@class='listtblcell userNameTableCell userWithGroupCell']"; String exp
		 * = "//input[@name='firstName']"; if(org.endsWith(exp)) break; }
		 * driver.findElement(By.id("userRightCell_48_12")).click();
		 * driver.findElement(By.id("userRightCell_48_1")).click();
		 * driver.findElement(By.id("userRightCell_38_2")).click();
		 * driver.findElement(By.id("userRightCell_38_13")).click();
		 * driver.findElement(By.id("userRightCell_38_5")).click();
		 * driver.findElement(By.id("userRightCell_38_7")).click();
		 * driver.findElement(By.id("userRightCell_38_10")).click();
		 * driver.findElement(By.id("userRightCell_38_11")).click();
		 */
	}
}
