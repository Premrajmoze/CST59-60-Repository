package Griddemo;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class amazondemo {
	@Test
	public void AMTest() throws MalformedURLException, InterruptedException
	{
		 DesiredCapabilities dc = new DesiredCapabilities();
		 dc.setBrowserName("Edge");
		 WebDriver driver = new RemoteWebDriver(new URL(" http://192.168.233.210:4444"),dc);
		 driver.get("https://www.amazon.com");
		 System.out.println("Amazon title : "+ driver.getTitle());
		 Thread.sleep(5000l);
		 driver.quit();
	}
}
