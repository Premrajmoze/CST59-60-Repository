package day8nov23;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Date;

import javax.imageio.ImageIO;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;

public class ScreenShotDemo1 {
	static WebDriver driver;
	public static void main(String[] args) throws IOException {

		driver = new ChromeDriver();
		driver.get("https://courses.letskodeit.com/practice");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		
		String fileName = new Date().toString().replace(" ", "_").replace(":", "_")+".jpg";
		capturescreenshot(System.getProperty("user.dir") + "\\src\\test\\resources\\screenshort\\" + fileName);
		driver.quit();
		}
	public static void capturescreenshot(String fileName) throws IOException
	{
		Screenshot screenShot = new AShot().shootingStrategy(ShootingStrategies.viewportPasting(500)).takeScreenshot(driver);
		ImageIO.write(screenShot.getImage(), "png", new File(fileName));
	}
}