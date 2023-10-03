package class_wise_saiRoshini;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Pre_enq {


	
	

	
	public void Pre_enq_main(String Agent_name_value, String Loan_term_value, String Loan_amount, String Agent_branch_value) throws InterruptedException, AWTException {
	
		
	WebDriverManager.chromedriver().setup();
									
	ChromeOptions handlingSSL = new ChromeOptions();

	//Using the accept insecure cert method with true as parameter to accept the untrusted certificate
	handlingSSL.setAcceptInsecureCerts(true);

	//Creating instance of Chrome driver by passing reference of ChromeOptions object
	WebDriver driver = new ChromeDriver(handlingSSL);
					
	JavascriptExecutor js = (JavascriptExecutor) driver;
	Actions action = new Actions(driver);		
	driver.manage().window().maximize();
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	
	
	String Password = "123456";
	String login_ID = "Adithya";
//	basha -String aadhar_number = "598149064414";
	String aadhar_number = "330645218154";
//	basha -String pan_card = "HQQPS2965M";
	
	String pan_card = "DIVPB8564C";
	
//	basha- String Cust_name = "Shaik ajagar basha";
	
	String Cust_name = "Aditya Bhadauriya";
	
//	basha- String DOB = "26-08-1996";
	
	String DOB = "02-11-1993";
	String Gender = "M- Male";
//	basha- String Mobile_number = "9492227399" ;
	String Mobile_number = "7999575483" ;
	
	String alt_mob_number = "7999575483";
	
	String account_nuber = "50100588969412";
	
	String IFSC_code = "HDFC0000042";
	
	
	
	
//	WebDriverWait wait = new WebDriverWait(driver, 20);

//	WebDriverWait wait = new WebDriverWait(driver,20);
	driver.get("https://164.52.221.222/erp/security/Login");
//     Thread.sleep(3000);

	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

//		Login page
	
	driver.findElement(By.xpath("//input[@id='user']")).sendKeys(login_ID);
	
	
	driver.findElement(By.xpath("//input[@id='password']")).sendKeys(Password);

	boolean login = driver.findElement(By.xpath("//td[@class='Button_text Button_width']")).isDisplayed();

	if (login == true) {
		System.out.println("Login button is visible");
	} else {
		System.out.println("Login button is not visible");
	}

	driver.findElement(By.xpath("//td[@class='Button_text Button_width']")).click();
	
//     Thread.sleep(4000);

//     driver.findElement(By.xpath("//img[@name='isc_10main']")).click();

//     Thread.sleep(4000);

	
/***			
	
	
	boolean app = driver.findElement(By.xpath(
			"//body[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/table[1]/tbody[1]/tr[1]/td[2]"))
			.isDisplayed();
	if (app == true) {
		System.out.println("Application is visible");
	} else {
		System.out.println("Application is not visible");
	}
//     Thread.sleep(3000);
	// Application
	driver.findElement(By.xpath(
			"/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/table[1]/tbody[1]/tr[1]/td[2]"))
			.click();
//     Thread.sleep(3000);
	// Pre-Enquiry
//     Thread.sleep(3000);
	driver.findElement(By.xpath("(//div[@role='presentation'])[2]")).click();
	
	
***/
//	Pre-enq search
	
	wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.id("isc_C"))));
	
	
	WebElement search = driver.findElement(By.id("isc_C"));
	
	search.click();
	
	
	Thread.sleep(2000);
	WebElement search_text = driver.findElement(By.xpath("//input[@name='value']"));
	
	wait.until(ExpectedConditions.elementToBeClickable(search_text));
	
	search_text.sendKeys("Pre-Enquiry Form");
	
	Thread.sleep(1500);
	
	search_text.sendKeys(Keys.ENTER);
	
	
	
	
	
	
	
	// New
//     Thread.sleep(5000);
	boolean new1 = driver
			.findElement(By.xpath("(//td[@class='OBToolbarIconButton_icon_newDoc OBToolbarIconButton'])[1]"))
			.isDisplayed();
	if (new1 == true) {
		System.out.println("New is visible");
	} else {
		System.out.println("New is nor visible");
	}

	driver.findElement(By.xpath("(//td[@class='OBToolbarIconButton_icon_newDoc OBToolbarIconButton'])[1]")).click();

//     Name of customer
	Thread.sleep(1500);
	boolean customer = driver.findElement(By.xpath("//td[@class='OBFormField']//input[@name='customername']"))
		.isDisplayed();

	if (customer == true) {
		Thread.sleep(1500);
		
		driver.findElement(By.xpath("//td[@class='OBFormField']//input[@name='customername']")).sendKeys(Cust_name);
	}

	else {
		System.out.println("There is a prblm here");
	}
////     Adhar number
	Thread.sleep(1500);
	boolean adhar = driver.findElement(By.xpath("//label[normalize-space()='Aadhaar Number']")).isDisplayed();

	if (adhar == true) {
		System.out.println("Adhar is visible");
	} else {
		System.out.println("Adhar is not visible");
	}
	Thread.sleep(1500);
	driver.findElement(By.xpath("//td[@class='OBFormField']//input[@name='prooftypenumber']"))
			.sendKeys(aadhar_number);
	Thread.sleep(1500);

//   Click on pan number   

	driver.findElement(By.xpath("//input[@name='panno']")).click();
	Thread.sleep(3500);

	driver.findElement(By.xpath("//input[@name='panno']")).sendKeys(pan_card);
	System.out.println("PAN done");
//	ADPED9876A
//	Date of birth

	Thread.sleep(2100);

	driver.findElement(By.xpath("//input[@name='dateofbirth_dateTextField']")).click();
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("//input[@name='dateofbirth_dateTextField']")).sendKeys(DOB);
	System.out.println("Date done");
//Gender
	Thread.sleep(2000);

	driver.findElement(By.xpath("//input[@name='gender']")).click();

	Thread.sleep(2000);
	
	driver.findElement(By.xpath("//input[@name='gender']")).sendKeys(Gender);
	System.out.println("Gender done");

//Mobile number
	Thread.sleep(2000);

	boolean mobile = driver.findElement(By.xpath("//td[@class='OBFormField']//input[@name='mobilenumber']"))
			.isDisplayed();
	 
	if (mobile == true) {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//td[@class='OBFormField']//input[@name='mobilenumber']"))
				.sendKeys(Mobile_number);
		System.out.println("Mobile number done");
	} else {
		System.out.println("some thing went wrong with mobile number");
	}
	Thread.sleep(2000);
	

//save button
//	Thread.sleep(2000);
//	boolean save = driver.findElement(By.xpath("//td[@class='OBToolbarIconButton_icon_save OBToolbarIconButton']")).isEnabled();
//	
//	if (save == true) {
//		System.out.println("Save button is visible");
//		
//	}
//	else {
//		System.out.println("Save button is not visible");
//	}
//	
//	driver.findElement(By.xpath("//td[@class='OBToolbarIconButton_icon_save OBToolbarIconButton']")).click();
	
//Fetch kyc

	Thread.sleep(2000);
	boolean fetch_kyc = driver.findElement(By.xpath("(//td[@nowrap='true'])[19]")).isDisplayed();

	if (fetch_kyc == true) {
		System.out.println("Yes kyc is displayed");
	} else {
		System.out.println("Kyc not displayed");
	}

	Thread.sleep(2000);
	driver.findElement(By.xpath("(//td[@nowrap='true'])[19]")).click();

//	Done button in KYC
	boolean done_button = driver.findElement(By.xpath("(//td[normalize-space()='Done'])[1]")).isDisplayed();
	
	if(done_button) {
		System.out.println("Done button is visible");
	}
	else {
		System.out.println("Done button is not visible");
	}
	Thread.sleep(2000);
	driver.findElement(By.xpath("(//td[normalize-space()='Done'])[1]")).click();
/**
	
//	error message after fetch kyc fail
	try {
			boolean fail_message = driver.findElement(By.xpath("//b[normalize-space()='No record found']")).isDisplayed();
				
			Thread.sleep(2000);
			
			String failed =  driver.findElement(By.xpath("//b[normalize-space()='No record found']")).getText();
			if (fail_message == true) {
				System.out.println("Displayed error message is: "+ failed);
			} 
//Filling of address	
			if(fail_message == true) {
//				Permanent address button search button
				
				boolean address_add_button = driver.findElement(By.xpath("//body[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/form[1]/table[1]/tbody[1]/tr[5]/td[4]/table[1]/tbody[1]/tr[1]/td[2]/table[1]/tbody[1]/tr[1]/td[2]/span[1]")).isDisplayed();
				
				Thread.sleep(2000);
				
				if(address_add_button == true) {
					driver.findElement(By.xpath("//body[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/form[1]/table[1]/tbody[1]/tr[5]/td[4]/table[1]/tbody[1]/tr[1]/td[2]/table[1]/tbody[1]/tr[1]/td[2]/span[1]")).click();
					System.out.println("Address add button clicked");
				}
				else {
					System.out.println("Address add button does not click");
				}
				
				boolean add_permanent_address = driver.findElement(By.xpath("//div[@class='OBPopupHeader']//div[@class='normal']//div[@class='normal']//div//div[@role='label']//div")).isDisplayed();
				
				if (add_permanent_address == true) {
					String address_string =driver.findElement(By.xpath("//div[@class='OBPopupHeader']//div[@class='normal']//div[@class='normal']//div//div[@role='label']//div")).getText();
				
					System.out.println("Address bar title: "+ address_string);
				}
				else {
					System.out.println("Try diffrent method for address bar title");
				}
//				postal
				
				boolean add_permanent_address_postal = driver.findElement(By.xpath("//input[@name='Postal']")).isDisplayed();
				
				Thread.sleep(2000);
				
				if (add_permanent_address_postal == true) {
					driver.findElement(By.xpath("//input[@name='Postal']")).sendKeys("500020");
				
					System.out.println("Address bar postal done");
				}
				else {
					System.out.println("Try diffrent method for address bar title");
				}
				
				
//				Country
				
				Thread.sleep(2000);
				boolean add_permanent_address_country = driver.findElement(By.xpath("//input[@name='Country']")).isDisplayed();
				
				
				if (add_permanent_address_country == true) {
					driver.findElement(By.xpath("//input[@name='Country']")).clear();
				
					System.out.println("Address bar Country displayed cleared");
					
					Thread.sleep(1000);
					
					driver.findElement(By.xpath("//input[@name='Country']")).sendKeys("India");
					
					System.out.println("Country key sent succesfully");
				}
				else {
					System.out.println("Try diffrent method for address country not displayed");
				}
				
//				State
				
				Thread.sleep(2000);
				boolean add_permanent_address_state = driver.findElement(By.xpath("//input[@name='State']")).isDisplayed();
				
				
				if (add_permanent_address_state == true) {
//					driver.findElement(By.xpath("//input[@name='State']")).clear();
//				
//					System.out.println("Address bar State displayed cleared");
					
					Thread.sleep(2000);
					driver.findElement(By.xpath("//input[@name='State']")).click();
					Thread.sleep(1000);
					driver.findElement(By.xpath("//input[@name='State']")).sendKeys("Telangana");
					
					System.out.println("State key sent succesfully");
				}
				else {
					System.out.println("Try diffrent method for address State not displayed");
				}
				
//				District

				Thread.sleep(2000);
				boolean add_permanent_address_district = driver.findElement(By.xpath("//input[@name='District']")).isDisplayed();
				
				
				if (add_permanent_address_district == true) {
//					driver.findElement(By.xpath("//input[@name='State']")).clear();
//				
//					System.out.println("Address bar State displayed cleared");
					
					Thread.sleep(2000);
					driver.findElement(By.xpath("//input[@name='District']")).click();
					Thread.sleep(1000);
					driver.findElement(By.xpath("//input[@name='District']")).sendKeys("HYDERABAD");
					
					System.out.println("District key sent succesfully");
				}
				else {
					System.out.println("Try diffrent method for address District not displayed");
				}
				
//				City
				
				Thread.sleep(2000);
				boolean add_permanent_address_city = driver.findElement(By.xpath("//input[@name='City']")).isDisplayed();
				
				
				if (add_permanent_address_city == true) {
//					driver.findElement(By.xpath("//input[@name='State']")).clear();
//				
//					System.out.println("Address bar State displayed cleared");
					
					Thread.sleep(2000);
					driver.findElement(By.xpath("//input[@name='City']")).click();
					Thread.sleep(1000);
					driver.findElement(By.xpath("//input[@name='City']")).sendKeys("HYDERABAD");
					
					System.out.println("City key sent succesfully");
				}
				else {
					System.out.println("Try diffrent method for address City not displayed");
				}
				
//				Address_1
				Thread.sleep(2000);
				boolean add_permanent_address_address_1 = driver.findElement(By.xpath("//input[@name='Address Line 1']")).isDisplayed();
				
				
				if (add_permanent_address_address_1 == true) {
//					driver.findElement(By.xpath("//input[@name='State']")).clear();
//				
//					System.out.println("Address bar State displayed cleared");
					
					Thread.sleep(2000);
					driver.findElement(By.xpath("//input[@name='Address Line 1']")).click();
					Thread.sleep(1000);
					driver.findElement(By.xpath("//input[@name='Address Line 1']")).sendKeys("Har har mahadev");
					
					System.out.println("Address_1 key sent succesfully");
				}
				else {
					System.out.println("Try diffrent method for address Address_1 not displayed");
				}
				
//				Done_buttom
				Thread.sleep(2000);
				boolean done_button_ = driver.findElement(By.xpath("//td[normalize-space()='Done']")).isEnabled();
				
				if(done_button_ == true) {
					driver.findElement(By.xpath("//td[normalize-space()='Done']")).click();
					System.out.println("Done button clicked");
				}
				else {
					System.out.println("Done button not clicked");
				}
				
//				Sucess_message
				Thread.sleep(2000);
				boolean Success_message = driver.findElement(By.xpath("//div[contains(text(),'Pincode is active(unhold) status, You can proceed ')]")).isDisplayed();
				
				Thread.sleep(1000);
				
				String Suc_msg =  driver.findElement(By.xpath("//div[contains(text(),'Pincode is active(unhold) status, You can proceed ')]")).getText();
				if (Success_message == true) {
					System.out.println("Displayed message for address submition is: "+ Suc_msg);
				} 
				else {
					System.out.println("Please try again to fetch address submition");
				}

			}
			
			else {
				System.out.println("Please try again to fetch error method");
			}
	}
	catch(Exception No_record_element_not_found) {
		
		throw No_record_element_not_found;
		
	}
	
***/				
//	success message after fetch kyc
	try {
		boolean sucess_message = driver.findElement(By.xpath("//b[normalize-space()='Download successfull']")).isDisplayed();
		
		Thread.sleep(2000);
		
		String failed =  driver.findElement(By.xpath("//b[normalize-space()='Download successfull']")).getText();
		if (sucess_message == true) {
			System.out.println("Displayed sucess message is: "+ failed);
		} 
		else {
			System.out.println("Please try again to fetch sucess method");
		}
	}
	catch(Exception Sucess_element_not_found) {
		throw Sucess_element_not_found;
	}

//	Scroll
	
//	js.executeScript("window.scrollBy(0,350)", "");
	Thread.sleep(2000);
    WebElement hoverable = driver.findElement(By.xpath("//input[@name='product']"));
    new Actions(driver)
            .moveToElement(hoverable)
            .perform();				
	
    
    
    
//	Loan account type
	Thread.sleep(2000);
	boolean agent_name = driver.findElement(By.xpath("//div[contains(text(),'Agent/Loan Details')]")).isDisplayed();
	System.out.println("Maxmun is visible");
	if (agent_name == true) {
		
		String agen = driver.findElement(By.xpath("//div[contains(text(),'Agent/Loan Details')]")).getText();
		System.out.println("Agent name block : " + agen);
	}
	
	else {
		System.out.println("Try another method for agent block");
	}


       
       
//		Loan amount
//		js.executeScript("document.getElementById(isc_3H7.value='100000')");
//		System.out.println("Loan amount done");				
	
	
//	Agent Name
//	js.executeScript("document.getElementByName(bpagent.value='ACHARIYA EDUCATIONAL PUBLIC TRUST')");
//	System.out.println("Agent name done");
    Thread.sleep(2000);
    
    WebElement Agent_name = driver.findElement(By.xpath("(//input[@name='bpagent'])[2]"));
    
    
    Agent_name.sendKeys(Agent_name_value);
    
    
	Thread.sleep(1500);
	
	Agent_name.sendKeys(Keys.ENTER);
    
    
	
	
	
//	Loan terms
//	js.executeScript("document.getElementById(isc_3GA.value='6/1 EMI PLAN')");
//	System.out.println("Loan terms done");
  //
	
    Thread.sleep(2000);

    
    WebElement Loan_term = driver.findElement(By.xpath("(//input[@name='lDSAgent'])[2]"));
    
    Loan_term.sendKeys(Loan_term_value);
    
    
	Thread.sleep(1500);
	
	Loan_term.sendKeys(Keys.ENTER);

//Loan amount      
	
    Thread.sleep(2000);
    
    driver.findElement(By.xpath("(//input[@name='loanamount'])")).click();
    
    
    driver.findElement(By.xpath("(//input[@name='loanamount'])")).sendKeys(Loan_amount);
    Thread.sleep(2000);

//	Agent branch

    Thread.sleep(2000);

    
    WebElement Agent_branch = driver.findElement(By.xpath("(//input[@name='agentbranch'])[2]"));
    
    
    
    Agent_branch.sendKeys(Agent_branch_value);
    
    
	Thread.sleep(1500);
	
	Agent_branch.sendKeys(Keys.ENTER);
    
/***
	 boolean Agent_branch =  driver.findElement(By.xpath("//input[@oninput='isc_OBSelectorItem_6._handleInput()']")).isDisplayed();
       
       if(Agent_branch = true) {
        WebElement agent_branch_key = driver.findElement(By.xpath("//input[@oninput='isc_OBSelectorItem_6._handleInput()']"));
        js.executeScript("arguments[0].value='PONDICHERRY';", agent_branch_key);    
       }
       else 
       {System.out.println("Something went wrong");}
		
***/		       
		
//		js.executeScript("document.getElementById(isc_3GM.value='PONDICHERRY')");
//		System.out.println("Agent branch done");
//					
	
	
//	Actions builder = new Actions(driver);
//	Action seriesOfActions = builder
//			.moveToElement(txtUsername)
//			.click()
//			.keyDown(txtUsername, Keys.SHIFT)
//			.sendKeys(txtUsername, "hello")
//			.keyUp(txtUsername, Keys.SHIFT)
//			.doubleClick(txtUsername)
//			.contextClick()
//			.build();
//			
//		seriesOfActions.perform() ;
//	Agent Name

	
			
//	
//	
//	Thread.sleep(2300);
//	boolean agent_name = driver.findElement(By.xpath("//input[@name='lDSLoanaccounttype']")).isDisplayed();
//	System.out.println("Loan account type is visible");
//	if (agent_name == true) {
//		
////		driver.findElement(By.xpath("(//table[@role='presentation'])[42]")).sendKeys("ACHARIYA EDUCATIONAL PUBLIC TRUST");
//		System.out.println("Agent name key sent");
//	}
//	
//	else {
//		System.out.println("Try another method for agent");
//	}
//	
	
	
//	Loan terms
//	Loan amount
	
//	address_1
//	Thread.sleep(2000);
//
//	boolean add_permanent_address_line_1 = driver.findElement(By.xpath("//input[@id='isc_1TB']")).isDisplayed();
//	
//	Thread.sleep(2000);
//	if (add_permanent_address_line_1 == true) {
//		driver.findElement(By.xpath("//input[@id='isc_1TB']")).sendKeys("hjkafdhjfka djnahs");
//	
//		System.out.println("Address line 1 done");
//	}
//	else {
//		System.out.println("Try diffrent method for address line 1");
//	}
//	
//	boolean add_permanent_address_line_2 = driver.findElement(By.xpath("//input[@name='Address Line 2']")).isDisplayed();
//	
//	Thread.sleep(2000);
//	if (add_permanent_address_line_2 == true) {
//		driver.findElement(By.xpath("//input[@name='Address Line 2']")).sendKeys("dhjfka djnahs");
//	
//		System.out.println("Address line 2 done");
//	}
//	else {
//		System.out.println("Try diffrent method for address line 2 ");
//	}
//	
//	
//	
//	
//	boolean add_permanent_address_city = driver.findElement(By.xpath("//input[@name='District']")).isDisplayed();
//	
//	Thread.sleep(2000);
//	if (add_permanent_address_city == true) {
//		driver.findElement(By.xpath("//input[@name='District']")).sendKeys("Hyderabad");
//	
//		System.out.println("Address city done");
//	}
//	else {
//		System.out.println("Try diffrent method for address city ");
//	}
//	Add permanent address postal
	
	
	
	//       try to get text adhar again  

//     Thread.sleep(3000);
//     boolean adhar1 =  driver.findElement(By.xpath("//label[normalize-space()='Aadhaar Number']")).isDisplayed();
//     
//     if(adhar1 == true) {
//     	System.out.println("Adhar1 is visible again");
//     }
//     else {
//     	System.out.println("Adhar1 is not visible again");
//     }

//     TO save the data click on save
//     Thread.sleep(3000);

//     boolean save = driver.findElement(By.xpath("//td[@class='OBToolbarIconButton_icon_save OBToolbarIconButton']")).isDisplayed();
//     if(save == true) {
//     	System.out.println("Save button is visible");
//     }
//     else {
//     	System.out.println("Not visible");
//     }
//     
////     Thread.sleep(2000);
//     driver.findElement(By.xpath("//td[@class='OBToolbarIconButton_icon_save OBToolbarIconButton']")).click();
////   

//     driver.findElement(By.xpath("//body[1]/div[3]/div[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[2]")).click();
//     Thread.sleep(4000);
//     driver.findElement(By.xpath("//div[@id='isc_GP']//table")).click();

//     boolean check = driver.findElement(By.xpath("//div[@id='isc_57']")).isDisplayed();
//     
//     if(check == true) {
//     	System.out.println("logout button is visible");
//     }
//     
//     else {
//     	System.out.println("Logout button is not visible");
//     }
//     
//     Thread.sleep(3000);
//     
//     driver.findElement(By.xpath("//td[normalize-space()='OK']")).click();
//   Thread.sleep(5000);  
//	 driver.close();
//}
	
	Thread.sleep(2000);
//Download Cibil/crif
	
	WebElement Cibil = driver.findElement(By.xpath("(//div[@role='button'])[14]"));
	
	Cibil.click();
	System.out.println("Clicked on download cibil");
	Thread.sleep(2000);
	
	boolean Done_button_in_Cibil = driver.findElement(By.xpath("//td[normalize-space()='Done']")).isDisplayed();
	
	Thread.sleep(2000);
	if(Done_button_in_Cibil == true) {
		WebElement Cibil_Done = driver.findElement(By.xpath("//td[normalize-space()='Done']"));
		
		Cibil_Done.click();
		System.out.println("Clicked on Done in download cibil");
	}
	else {
		System.out.println("Done button in cibil is not visible");
	}

//Validate cibil by cibil score
//	scroll to cibil score
	Thread.sleep(4000);
    WebElement move_to_cibil = driver.findElement(By.xpath("//input[@name='actualcibilscore']"));
    new Actions(driver)
            .moveToElement(move_to_cibil)
            .perform();		
    System.out.println("Moved to cibil score");
    Thread.sleep(2000);
   
    boolean sucess_msg = driver.findElement(By.xpath("//div[@role='article']//div")).isDisplayed();
    
    if(sucess_msg== true) {
    	
    	String fetch_msg = driver.findElement(By.xpath("//div[@role='article']//div")).getText();
    	System.out.println("Cibil score Message is=="+" [" +fetch_msg+"]");
    }
    else {
    	System.out.println("Cibil score Message not fetched");
    }
    

    
    
    boolean select_cibil = driver.findElement(By.xpath("//input[@name='actualcibilscore']")).isDisplayed();
    Thread.sleep(3000);
    if(select_cibil == true) {
    	String value_cibil = driver.findElement(By.xpath("//input[@name='actualcibilscore']")).getText();
    	System.out.println("Value of cibil=="+ value_cibil);
    }
    else {
    	System.out.println("Unable to fetch cibil value");
    }
    
    String get_cibil = driver.findElement(By.xpath("//input[@name='actualcibilscore']")).getAttribute("value");
    		        		        
    System.out.println("Cibil score is ==" + get_cibil);



//    Get Score
    Thread.sleep(3000);
    WebElement Get_score = driver.findElement(By.xpath("(//div[@role='button'])[15]"));
    
    Get_score.click();	
    System.out.println("Get score clicked");
	
	
	Thread.sleep(2000);
	boolean done_get_score = driver.findElement(By.xpath("//td[normalize-space()='Done']")).isDisplayed();
	if( done_get_score == true) {
		driver.findElement(By.xpath("//td[normalize-space()='Done']")).click();
		System.out.println("Clicked on Done in Get Score");
	}
	else {
		System.out.println("Done of get score not visible");
	}
	
//	validating Get score
	Thread.sleep(2000);
	boolean sucess_msg_of_get_score = driver.findElement(By.xpath("//div[@role='article']//div")).isDisplayed();
    Thread.sleep(2000);
    if(sucess_msg_of_get_score== true) {
    	
    	String validate_get_score = driver.findElement(By.xpath("//div[@role='article']//div")).getText();
    	System.out.println("Get score Message is=="+ validate_get_score);
    }
    else {
    	System.out.println("Get score Message not fetched");
    }
    
    
//    Scroll upto Final Decision
    
    Thread.sleep(2000);
    WebElement move_to_final_decision = driver.findElement(By.xpath("//input[@name='finaldecision']"));
    new Actions(driver)
            .moveToElement(move_to_final_decision)
            .perform();		
    System.out.println("Moved to Final Decision");
    Thread.sleep(2000);
    
    
    
//    CIBIL Limit Value
    String validate_CIBIL_Limit_Value = driver.findElement(By.xpath("//input[@name='cibillimit']")).getAttribute("value");
	System.out.println("CIBIL Limit Value is=="+ validate_CIBIL_Limit_Value);
	
//	Final Decision
	String validate_Final_Decision = driver.findElement(By.xpath("//input[@name='finaldecision']")).getAttribute("value");
	System.out.println("Final Decision=="+ validate_Final_Decision);
	
	

//	Generate and send BS link
    Thread.sleep(3000);
    String bs_link_path = "(//div[@role='button'])[17]";
    boolean Bs_link = driver.findElement(By.xpath(bs_link_path)).isDisplayed();		        
    if (Bs_link == true) {
    	System.out.println("Bs link is visible");
    	driver.findElement(By.xpath(bs_link_path)).click();
    }
    else{
    	System.out.println("Bs link path not displayed");
    }
    Thread.sleep(2000);
	boolean done_bs_link = driver.findElement(By.xpath("//td[normalize-space()='Done']")).isDisplayed();
	if( done_bs_link == true) {
		driver.findElement(By.xpath("//td[normalize-space()='Done']")).click();
		System.out.println("Clicked on Done in bs_link");
	}
	else {
		System.out.println("Done of bs_link not visible");
	}
		
//copy bs link url 
	String bs_link_url_path = "//input[@name='ldsBsurl']";
//	Scroll to bslink
	Thread.sleep(5000);
    WebElement bs_link_url = driver.findElement(By.xpath(bs_link_url_path));
    new Actions(driver)
            .moveToElement(bs_link_url)
            .perform();		
    System.out.println("Moved to bs_link_url");
    Thread.sleep(3000);
    
    String bs_link_url_value = bs_link_url.getAttribute("value");
    
    System.out.println("bs link url is---"+bs_link_url_value);


//Open new tab
    ((JavascriptExecutor)driver).executeScript("window.open()");
    Thread.sleep(2000);
    
    
    ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
    
    driver.switchTo().window(tabs.get(1));
    driver.get(bs_link_url_value);
//bankconnect
//    search bank
    Thread.sleep(4000);
    driver.findElement(By.xpath("//input[@placeholder='Search Your Bank']")).sendKeys("Union Bank of India");
    
    Thread.sleep(2000);
    driver.findElement(By.xpath("//div[contains(text(),'Union Bank of India')]")).click();
    
    Thread.sleep(2000);
    driver.findElement(By.xpath("//div[normalize-space()='Bank statements']")).click();
    
    Thread.sleep(2000);
    driver.findElement(By.xpath("//div[@class='sc-AxhCb bXEyhD']")).click();
    
    
   
    Robot rb = new Robot();	
    Thread.sleep(2000);
    
    StringSelection ss = new StringSelection("STATEMENT.pdf");
    
    Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
    
    rb.keyPress(KeyEvent.VK_CONTROL);
    rb.keyPress(KeyEvent.VK_V);
    
    rb.keyRelease(KeyEvent.VK_CONTROL);
    rb.keyRelease(KeyEvent.VK_V);
    
    rb.keyPress(KeyEvent.VK_ENTER);
    rb.keyRelease(KeyEvent.VK_ENTER);
    
    
    Thread.sleep(2000);
    
    WebElement pdf_password = driver.findElement(By.xpath("//input[@type='password']"));
    pdf_password.sendKeys("JINK2601");
    Thread.sleep(1000);
   WebElement button = driver.findElement(By.xpath("//button[@class='sc-AxmLO kUvkPB']"));
   
   button.click();
   driver.switchTo().window(tabs.get(0)); 
   
   System.out.println("Please wait for 20 seconds");
   Thread.sleep(20000);
   
//   Click on download bank statement
   driver.findElement(By.xpath("(//div[@role='button'])[18]")).click();


   Thread.sleep(4000);
	boolean Download_bank_done = driver.findElement(By.xpath("//td[normalize-space()='Done']")).isDisplayed();
	if( Download_bank_done == true) {
		driver.findElement(By.xpath("//td[normalize-space()='Done']")).click();
		System.out.println("Clicked on Done in bank");
	}
	else {
		System.out.println("Done of get score not bank");
	}
//	Click on Get score
	Thread.sleep(7000);
	driver.findElement(By.xpath("(//div[@role='button'])[15]")).click();

	Thread.sleep(2000);
	boolean Download_bank_done_score = driver.findElement(By.xpath("//td[normalize-space()='Done']")).isDisplayed();
	if( Download_bank_done_score == true) {
		driver.findElement(By.xpath("//td[normalize-space()='Done']")).click();
		System.out.println("Clicked on Done in bank_get score");
	}
	else {
		System.out.println("Done of get score not bank_get score");
	}
	
	
//	Scroll to avg_balance_limit
	
	String Path_for_avg_balance_limit = "//input[@name='avgballimit']";
	
	Thread.sleep(2000);
    WebElement avg_balance_limit = driver.findElement(By.xpath(Path_for_avg_balance_limit));
    new Actions(driver)
            .moveToElement(avg_balance_limit)
            .perform();		
    System.out.println("Moved to Avg balance");
    Thread.sleep(2000);
    
    String value_ofavg_balance = driver.findElement(By.xpath(Path_for_avg_balance_limit)).getAttribute("value");
	
    System.out.println("Avg_balance---"+ value_ofavg_balance);
    
    
//    Manual final value
    
    String Path_for_Manual_final_Decision = "//input[@name='manualFinaldecision']";
	
	Thread.sleep(2000);
    WebElement Manual_final_Decision = driver.findElement(By.xpath(Path_for_Manual_final_Decision));
    new Actions(driver)
            .moveToElement(Manual_final_Decision)
            .perform();		
    System.out.println("Moved to Manual_final_Decision");
    Thread.sleep(2000);
    
    String Manual_final_Decision_value = Manual_final_Decision.getAttribute("value");
    System.out.println("Manual_final_Decision_value-----"+ Manual_final_Decision_value);
    
    Thread.sleep(1000);
    
    driver.findElement(By.xpath(Path_for_Manual_final_Decision)).clear();
    Thread.sleep(200);
    driver.findElement(By.xpath(Path_for_Manual_final_Decision)).sendKeys("ELIGIBILE");
    
//	Avaliable Credit Limit
    
    String Path_Avaliable_credit_limit = "//input[@name='creditlimit']";
    
    Thread.sleep(2000);
    WebElement Avaliable_credit_limit = driver.findElement(By.xpath(Path_Avaliable_credit_limit));
    new Actions(driver)
            .moveToElement(Avaliable_credit_limit)
            .perform();		
    System.out.println("Moved to Avaliable_credit_limit");
    Thread.sleep(2000);
    
    
    
    Avaliable_credit_limit.clear();
    Thread.sleep(200);
    Avaliable_credit_limit.sendKeys("50000.00");
    
    String Value_of_updated_credit_limit =  Avaliable_credit_limit.getAttribute("value");
    
    System.out.println("Value_of_updated_credit_limit---"+ Value_of_updated_credit_limit);
    
//    final_decision
    
    String Path_to_finaldecision = "//input[@name='finaldecision']";
    
    Thread.sleep(2000);
    WebElement finaldecision = driver.findElement(By.xpath(Path_to_finaldecision));
    new Actions(driver)
            .moveToElement(finaldecision)
            .perform();		
    System.out.println("Moved to Avaliable_final_limit");
    Thread.sleep(2000);
    
    finaldecision.clear();
    Thread.sleep(200);
    finaldecision.sendKeys("ELIGIBILE");
    
    String Value_of_updated_final_decision =  finaldecision.getAttribute("value");
    
    System.out.println("Value_of_updated_final_decision---"+ Value_of_updated_final_decision);
    
//    Move to alt mobile number
    
    String Path_to_alt_mobile_number = "//input[@name='alternatenumber']";
    
    
    Thread.sleep(2000);
    WebElement alt_mobile_number = driver.findElement(By.xpath(Path_to_alt_mobile_number));
    new Actions(driver)
            .moveToElement(alt_mobile_number)
            .perform();		
    System.out.println("Moved to alt_mobile_number");
    Thread.sleep(2000);
    
    WebElement New_alt_mobile_number = driver.findElement(By.xpath(Path_to_alt_mobile_number));
    
    New_alt_mobile_number.clear();
    New_alt_mobile_number.sendKeys(alt_mob_number);
    
    String Value_of_new_alt_mobile_number = New_alt_mobile_number.getAttribute("value");
	
    System.out.println("Value_of_new_alt_mobile_number---"+ Value_of_new_alt_mobile_number);
    

//    path_to_bank_name
    String path_to_bank_name = "//input[@name='bankname']";
    Thread.sleep(2000);
    WebElement bank_name = driver.findElement(By.xpath(path_to_bank_name));
    new Actions(driver)
            .moveToElement(bank_name)
            .perform();		
    System.out.println("Moved to bank_name");
    Thread.sleep(2000);
    
    
    
//    to_ifsc_code
    
    String path_to_ifsc_code = "//input[@name='ifsccode']";
    Thread.sleep(1500);		        		        		        
    boolean ifsc_code = driver.findElement(By.xpath(path_to_ifsc_code)).isDisplayed();
    		if(ifsc_code == true) {
    			WebElement element = driver.findElement(By.xpath(path_to_ifsc_code));
    			
    			element.click();
    			Thread.sleep(2000);
    			element.sendKeys("HDFC0000042");
    			
    			System.out.println("ifsc done");
    		}
    		else {
    			System.out.println("Ifsc have some prblm");
    		}
    
//    bank name
    		Thread.sleep(2000);
    bank_name.sendKeys("HDFC BANK");
    
    
    
//    Path_to_bank_branch
    
    String Path_to_bank_branch = "//input[@name='bankbranch']";
    Thread.sleep(1500);
    WebElement bank_branch = driver.findElement(By.xpath(Path_to_bank_branch));
    Thread.sleep(1500);
    bank_branch.sendKeys("");
    
//    path_to_bank_account
    String path_to_bank_account = "//input[@name='accountno']";
    Thread.sleep(1500);
    WebElement bank_account = driver.findElement(By.xpath(path_to_bank_account));
    Thread.sleep(1500);
    bank_account.sendKeys(account_nuber);
    
////    Path_to_account_type
//    
//    String Path_to_account_type = "//input[@name='accounttype']";
//    Thread.sleep(1500);
//    WebElement account_type = driver.findElement(By.xpath(Path_to_account_type));
//    Thread.sleep(1500);
//    account_type.clear();
//    Thread.sleep(1000);
//    account_type.sendKeys("Saving");
    
    
    
    
    

    
    		        
//    click_on_bank_validation
    
    Thread.sleep(4000);
	driver.findElement(By.xpath("(//div[@role='button'])[12]")).click();

	Thread.sleep(2000);
	boolean bank_validation = driver.findElement(By.xpath("//td[normalize-space()='Done']")).isDisplayed();
	if( bank_validation == true) {
		driver.findElement(By.xpath("//td[normalize-space()='Done']")).click();
		System.out.println("Clicked on Done in bank_validation");
	}
	else {
		System.out.println("bank_validation_failed");
	}


//	Pre_Aproved_path
	String Pre_Aproved_path = "(//div[@role='button'])[16]";

    		        
//    click_on_pre aproved
    
    Thread.sleep(6000);
	driver.findElement(By.xpath(Pre_Aproved_path)).click();

	Thread.sleep(2000);
	boolean Pre_Aproved = driver.findElement(By.xpath("//td[normalize-space()='Done']")).isDisplayed();
	if( Pre_Aproved == true) {
		driver.findElement(By.xpath("//td[normalize-space()='Done']")).click();
		System.out.println("Clicked on Pre_Aproved");
	}
	else {
		System.out.println("Pre_Aproved_failed");
	}
	
//	Send_to_enq
	String Send_to_enq_path = "(//div[@role='button'])[9]";
	
	Thread.sleep(4000);
	driver.findElement(By.xpath(Send_to_enq_path)).click();

	Thread.sleep(2000);
	boolean Send_to_enq = driver.findElement(By.xpath("//td[normalize-space()='Done']")).isDisplayed();
	if( Send_to_enq == true) {
		driver.findElement(By.xpath("//td[normalize-space()='Done']")).click();
		System.out.println("Clicked on Send_to_enq");
	}
	else {
		System.out.println("Send_to_enq_failed");
	}

	Thread.sleep(15000);
	driver.quit();
}	
}