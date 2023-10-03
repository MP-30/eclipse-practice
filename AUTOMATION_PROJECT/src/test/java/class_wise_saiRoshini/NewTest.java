package class_wise_saiRoshini;

import java.awt.AWTException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;



public class NewTest {
	
	public ExtentReports extent;
	public ExtentSparkReporter spark;
	public ExtentTest logger;
	public WebDriver driver;
	
	
	@BeforeTest
	public void BeforeTest() {

		System.out.println("BeforeTest");
		
		extent = new ExtentReports();

		spark = new ExtentSparkReporter("/home/aditya/Documents/eclipse-workspace/AUTOMATION_PROJECT/New_Report/Index2.html");
		extent.attachReporter(spark);
		extent.setSystemInfo("Host Name", "SaiRoshini_Testing");
		extent.setSystemInfo("Environment", "Production");
		extent.setSystemInfo("User Name", "Aditya");
		spark.config().setDocumentTitle("Regresion");
		                // Name of the report
		spark.config().setReportName("Name of the Report Comes here ");
		                // Dark Theme
		spark.config().setTheme(Theme.DARK);
	}
	
	@BeforeMethod
	public void Before_test() {
	
		
		System.out.println("BeforeMethod");
			
		
		
		
	}

	
	
	@Test(priority = 1, enabled = true)
	public void f() throws InterruptedException, AWTException {
		
		
		Pre_enq main_method = new Pre_enq()  ;
		main_method.Pre_enq_main("ACHARIYA EDUCATIONAL PUBLIC TRUST","6/1 EMI PLAN","50,000.00", "PONDICHERRY"  );
		logger = extent.createTest("To verify 1");
		
		logger.log(Status.INFO, "Opening Browser");
	}
	
	@Test(priority = 2, enabled = true)
	public void f1() throws InterruptedException, AWTException {
		
		logger = extent.createTest("To verify 2");
		
		logger.log(Status.INFO, "Opening Browser");
		Pre_enq main_method = new Pre_enq()  ;
		main_method.Pre_enq_main("AAKRITHI SKIN and HAIR CLINIC","10/2 EMI PALN","50,000.00", ".VIZAG, OPP: CMR CENTRAL ANDHRA BANK ROAD PITHAPURAM COLONY"  );
	}
	
	@Test(priority = 3, enabled = true)
	public void f2() throws InterruptedException, AWTException {
		
		logger = extent.createTest("To verify 3");
		
		logger.log(Status.INFO, "Opening Browser");
		Pre_enq main_method = new Pre_enq()  ;
		main_method.Pre_enq_main("ADMS MARKETING PVT LTD","12/0 EMI PLAN (INT)","50,000.00", " M R MOTORS - Kalaburgi Karnataka"  );
	}
	
	
	@Test(priority = 4, enabled = true)
	public void f3() throws InterruptedException, AWTException {
		
		logger = extent.createTest("To verify 4");
		
		logger.log(Status.INFO, "Opening Browser");
		Pre_enq main_method = new Pre_enq()  ;
		main_method.Pre_enq_main("ADVANCE BEAUTY CLINIC PRIVATE LIMITED","10/2 EMI PALN","50,000.00", ".CHENNAI, NO 222 Y BLOCK 2ND AVENUE ANNA NAGAR "  );
	}
	
	
	@Test(priority = 5, enabled = true)
	public void f4() throws InterruptedException, AWTException {
		
		logger = extent.createTest("To verify 5");
		
		logger.log(Status.INFO, "Opening Browser");
		Pre_enq main_method = new Pre_enq()  ;
		main_method.Pre_enq_main("AIR VOICE INDIA ELECTRIC PVT LTD","12/0 EMI PLAN","50,000.00", "AIR VOICE INDIA ELECTRIC PVT LTD - HO GUJARAT"  );
		logger.log(Status.INFO, "Opening Browser2");
		logger.createNode("Every thing is ok");
	}
	
	
	@AfterMethod
	
	public void Del1() throws InterruptedException {
		
		
		try {
			Delete_enquiry main1 = new Delete_enquiry();
			main1.delete_process_enquiry();
		}
			catch(Exception enquiry_creaded_prblm ) {
			
		}
		Thread.sleep(2000);
		try {
			Delete_loan main2 = new Delete_loan();
			main2.delete_process_loans();
		}
			catch(Exception delete_loan) {
				
			}
		
		Thread.sleep(2000);
		
		try {
			Delete_location_pre_enq main3 = new Delete_location_pre_enq();
			main3.delete_process_location_and_pre_enq();
		}
		
		catch(Exception Delete_location) {
			
		}
		
		Thread.sleep(2000);
		
		try {
			Delete_bank main4 = new Delete_bank();
			main4.delete_process_bank();
		}
		
		catch(Exception Delete_bank) {
			
		}
		Thread.sleep(2000);
		
		try {
		Delete_client_master main5 = new Delete_client_master();
		main5.delete_client_master();
		}
		
		catch(Exception Delete_client_master) {
			
		}
		Thread.sleep(2000);
	}
	
	
		
	
	
	
	
	
	}

