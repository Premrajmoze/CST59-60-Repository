package day8nov23;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class svgdemo {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://sajithatharaka.github.io/svg-automation/");
		
		WebElement svgcircle = driver.findElement(By.xpath("//*[name()='svg']//*[name()='circle']"));
		System.out.println(svgcircle.getAttribute("cx"));
		System.out.println(svgcircle.getAttribute("cy"));
		System.out.println(svgcircle.getAttribute("r"));
		System.out.println(svgcircle.getAttribute("stroke"));
		System.out.println(svgcircle.getAttribute("stroke-width"));
		System.out.println(svgcircle.getAttribute("fill"));
		
		WebElement svgrec = driver.findElement(By.xpath("//*[@id='rectangle']"));
		System.out.println(svgrec.getAttribute("id"));
		System.out.println(svgrec.getAttribute("width"));
		System.out.println(svgrec.getAttribute("height"));
		System.out.println(svgrec.getAttribute("style"));

		WebElement svgtext = driver.findElement(By.xpath("//*[name()='text']"));
		System.out.println(svgtext.getAttribute("x"));
		System.out.println(svgtext.getAttribute("y"));
		System.out.println(svgtext.getAttribute("fill"));
		System.out.println(svgtext.getAttribute("hello"));
		System.out.println(svgtext.getText());
		System.out.println(svgtext.getAttribute("textContent"));
		System.out.println(svgtext.getAttribute("innerHTML"));
		
		driver.quit();
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
