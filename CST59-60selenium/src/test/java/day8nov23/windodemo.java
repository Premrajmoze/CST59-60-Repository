package day8nov23;


import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class windodemo {
	public static void main(String[] args) {
		
	WebDriver driver =new ChromeDriver();
	driver.get("https://www.google.com");
	Dimension d = new Dimension(1,200);
	driver.manage().window().setSize(d);
	Point p = new Point(50,400);
	driver.manage().window().setPosition(p);
	
	
	
	
	
	
	
	
	
	}

}
