package Sai_Roshini;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Learning_report {
	public ExtentReports extent;
	public ExtentSparkReporter spark;
	public ExtentTest logger;
	public WebDriver driver;

	@BeforeSuite
	public void BeforeSuite() {
		System.out.println("BeforeSuite");

	}

	@BeforeTest
	public void BeforeTest() {

		System.out.println("BeforeTest");
		
		extent = new ExtentReports();

		spark = new ExtentSparkReporter("/home/aditya/Documents/eclipse-workspace/AUTOMATION_PROJECT/Extent_reports/Index_demo.html");
		extent.attachReporter(spark);
		extent.setSystemInfo("Host Name", "SoftwareTestingMaterial");
		         extent.setSystemInfo("Environment", "Production");
		extent.setSystemInfo("User Name", "Rajkumar SM");
		spark.config().setDocumentTitle("Title of the Report Comes here ");
		                // Name of the report
		spark.config().setReportName("Name of the Report Comes here ");
		                // Dark Theme
		spark.config().setTheme(Theme.DARK);
	}

	

	@BeforeMethod
	public void BeforeMethod() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		System.out.println("BeforeMethod");
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
	}

	@Test
	public void Test1() {
		logger = extent.createTest("To verify Google Title");
		
		logger.log(Status.INFO, "Opening Browser");
		System.out.println("Test1");
	}

	@Test
	public void Test2() {
		logger = extent.createTest("To verify Google Title2");
		logger.log(Status.INFO, "Opening Browser2");
		logger.createNode("Every thing is ok");
		System.out.println("Test2");
	}
	@AfterMethod
	public void AfterMethod() {

		System.out.println("AfterMethod");
	}

	

	@AfterTest
	public void AfterTest() {
		extent.flush();
		System.out.println("AfterTest");
	}

	

}
