package day09nov23;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class jqrmethod {
	private static void SelectChoice(List<WebElement> low, String... val) 
	{
		for (WebElement ele : low)  //1 t o 15
		{
			if (val[0].equals("ALL"))
				ele.click();
			else
			{	
			for (String str : val) // 2
			{
				if (ele.getText().equals(str))
					ele.click();
			}
		}
		}
		
	}
		
	public static void main(String[] args) {
		
		  WebDriver driver=new EdgeDriver();
		  driver.get("https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/");
		  driver.manage().window().maximize();
		  driver.findElement(By.id("justAnInputBox")).click();
		  
		  
		 List<WebElement> low =  driver.findElements(By.xpath("(//div[@class='comboTreeDropDownContainer'])[1]//span[@class='comboTreeItemTitle']"));
		 System.out.println("size:" + low.size());  // 15
		// SelectChoice(low,"choice 4","choice 1","choice 6 2 3"); 
		 SelectChoice(low,"ALL");
	}
		}


