package day20oct23;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class extendreport {
	public static void main(String[] args) {
		ExtentSparkReporter htmlreport = new ExtentSparkReporter(System.getProperty("user.dir")
				+"\\src\\test\\resources");
		ExtentReports extent = new ExtentReports();
		extent.attachReporter(htmlreport);
		ExtentTest test1 = extent.createTest("VerifyTestForPayment","Verification of total payment");
		test1.assignAuthor("prem","premraj");
		test1.assignDevice("sanetry","pement","smok","regration");
		test1.log(Status.INFO, "browser opened : chrome");
		test1.info("loged in successfull");
		test1.pass("veryfication name pass");
		//test1.fail("test case failed");
		
		extent.flush();
		
		
		
		
		
		
		
	}
}
