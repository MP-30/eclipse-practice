package Sai_Roshini;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Pre_enquiry {
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
				
		driver.manage().window().maximize();
		
		String aadhar_number = "598149064414";
//		WebDriverWait wait = new WebDriverWait(driver, 20);

//		WebDriverWait wait = new WebDriverWait(driver,20);
		driver.get("https://saiuat.easycloud.co.in/erp/security/Login");

//         Thread.sleep(3000);

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

// 		Login page
		
		driver.findElement(By.xpath("//input[@id='user']")).sendKeys("adithya");

		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("123456");

		boolean login = driver.findElement(By.xpath("//td[@class='Button_text Button_width']")).isDisplayed();

		if (login == true) {
			System.out.println("Login button is visible");
		} else {
			System.out.println("Login button is not visible");
		}

		driver.findElement(By.xpath("//td[@class='Button_text Button_width']")).click();

//         Thread.sleep(4000);

//         driver.findElement(By.xpath("//img[@name='isc_10main']")).click();

//         Thread.sleep(4000);

		boolean app = driver.findElement(By.xpath(
				"//body[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/table[1]/tbody[1]/tr[1]/td[2]"))
				.isDisplayed();
		if (app == true) {
			System.out.println("Application is visible");
		} else {
			System.out.println("Application is not visible");
		}
//         Thread.sleep(3000);
		// Application
		driver.findElement(By.xpath(
				"/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/table[1]/tbody[1]/tr[1]/td[2]"))
				.click();
//         Thread.sleep(3000);
		// Pre-Enquiry
//         Thread.sleep(3000);
		driver.findElement(By.xpath("(//div[@role='presentation'])[2]")).click();
		// New
//         Thread.sleep(5000);
		boolean new1 = driver
				.findElement(By.xpath("(//td[@class='OBToolbarIconButton_icon_newDoc OBToolbarIconButton'])[1]"))
				.isDisplayed();
		if (new1 == true) {
			System.out.println("New is visible");
		} else {
			System.out.println("New is nor visible");
		}

		driver.findElement(By.xpath("(//td[@class='OBToolbarIconButton_icon_newDoc OBToolbarIconButton'])[1]")).click();

//         Name of customer
		Thread.sleep(3000);
		boolean customer = driver.findElement(By.xpath("//td[@class='OBFormField']//input[@name='customername']"))
				.isSelected();

		if (customer = true) {
			Thread.sleep(3000);
			driver.findElement(By.xpath("//td[@class='OBFormField']//input[@name='customername']")).sendKeys("Shaik ajagar basha");
		}

		else {
			System.out.println("There is a prblm here");
		}
////         Adhar number
		Thread.sleep(3000);
		boolean adhar = driver.findElement(By.xpath("//label[normalize-space()='Aadhaar Number']")).isDisplayed();

		if (adhar == true) {
			System.out.println("Adhar is visible");
		} else {
			System.out.println("Adhar is not visible");
		}
		Thread.sleep(3000);
		driver.findElement(By.xpath("//td[@class='OBFormField']//input[@name='prooftypenumber']"))
				.sendKeys(aadhar_number);
		Thread.sleep(3000);

//       Click on pan number   

		driver.findElement(By.xpath("//input[@name='panno']")).click();
		Thread.sleep(3000);

		driver.findElement(By.xpath("//input[@name='panno']")).sendKeys("HQQPS2965M");
		System.out.println("PAN done");
//		ADPED9876A
//		Date of birth

		Thread.sleep(2100);

		driver.findElement(By.xpath("//input[@name='dateofbirth_dateTextField']")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//input[@name='dateofbirth_dateTextField']")).sendKeys("26-08-1996");
		System.out.println("Date done");
//         Gender
		Thread.sleep(2000);

		driver.findElement(By.xpath("//input[@name='gender']")).click();

		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='gender']")).sendKeys("M- Male");
		System.out.println("Gender done");

//         Mobile number
		Thread.sleep(2000);

		boolean mobile = driver.findElement(By.xpath("//td[@class='OBFormField']//input[@name='mobilenumber']"))
				.isSelected();

		if (mobile = true) {
			Thread.sleep(3000);
			driver.findElement(By.xpath("//td[@class='OBFormField']//input[@name='mobilenumber']"))
					.sendKeys("9492227399");
			System.out.println("Mobile number done");
		} else {
			System.out.println("some thing went wrong with mobile number");
		}
		Thread.sleep(2000);
		

//		save button
//		Thread.sleep(2000);
//		boolean save = driver.findElement(By.xpath("//td[@class='OBToolbarIconButton_icon_save OBToolbarIconButton']")).isEnabled();
//		
//		if (save == true) {
//			System.out.println("Save button is visible");
//			
//		}
//		else {
//			System.out.println("Save button is not visible");
//		}
//		
//		driver.findElement(By.xpath("//td[@class='OBToolbarIconButton_icon_save OBToolbarIconButton']")).click();
		
//         Fetch kyc

		Thread.sleep(2000);
		boolean fetch_kyc = driver.findElement(By.xpath("(//td[@nowrap='true'])[19]")).isDisplayed();

		if (fetch_kyc == true) {
			System.out.println("Yes kyc is displayed");
		} else {
			System.out.println("Kyc not displayed");
		}

		Thread.sleep(2000);
		driver.findElement(By.xpath("(//td[@nowrap='true'])[19]")).click();

//		Done button in KYC
		boolean done_button = driver.findElement(By.xpath("(//td[normalize-space()='Done'])[1]")).isDisplayed();
		
		if(done_button) {
			System.out.println("Done button is visible");
		}
		else {
			System.out.println("Done button is not visible");
		}
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//td[normalize-space()='Done'])[1]")).click();

		
//		error message after fetch kyc fail
		
		boolean fail_message = driver.findElement(By.xpath("//b[normalize-space()='No record found']")).isDisplayed();
			
		Thread.sleep(2000);
		
		String failed =  driver.findElement(By.xpath("//b[normalize-space()='No record found']")).getText();
		if (fail_message == true) {
			System.out.println("Displayed message is: "+ failed);
		} 
		else {
			System.out.println("Please try again to fetch error method");
		}
		
//		Permanent button search button
		
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
//		postal
		
		boolean add_permanent_address_postal = driver.findElement(By.xpath("//input[@name='Postal']")).isDisplayed();
		
		Thread.sleep(2000);
		
		if (add_permanent_address_postal == true) {
			driver.findElement(By.xpath("//input[@name='Postal']")).sendKeys("500020");
		
			System.out.println("Address bar postal done");
		}
		else {
			System.out.println("Try diffrent method for address bar title");
		}
		
		
//		Country
		
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
		
//		State
		
		Thread.sleep(2000);
		boolean add_permanent_address_state = driver.findElement(By.xpath("//input[@name='State']")).isDisplayed();
		
		
		if (add_permanent_address_state == true) {
//			driver.findElement(By.xpath("//input[@name='State']")).clear();
//		
//			System.out.println("Address bar State displayed cleared");
			
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@name='State']")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//input[@name='State']")).sendKeys("Telangana");
			
			System.out.println("State key sent succesfully");
		}
		else {
			System.out.println("Try diffrent method for address State not displayed");
		}
		
//		District

		Thread.sleep(2000);
		boolean add_permanent_address_district = driver.findElement(By.xpath("//input[@name='District']")).isDisplayed();
		
		
		if (add_permanent_address_district == true) {
//			driver.findElement(By.xpath("//input[@name='State']")).clear();
//		
//			System.out.println("Address bar State displayed cleared");
			
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@name='District']")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//input[@name='District']")).sendKeys("HYDERABAD");
			
			System.out.println("District key sent succesfully");
		}
		else {
			System.out.println("Try diffrent method for address District not displayed");
		}
		
//		City
		
		Thread.sleep(2000);
		boolean add_permanent_address_city = driver.findElement(By.xpath("//input[@name='City']")).isDisplayed();
		
		
		if (add_permanent_address_city == true) {
//			driver.findElement(By.xpath("//input[@name='State']")).clear();
//		
//			System.out.println("Address bar State displayed cleared");
			
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@name='City']")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//input[@name='City']")).sendKeys("HYDERABAD");
			
			System.out.println("City key sent succesfully");
		}
		else {
			System.out.println("Try diffrent method for address City not displayed");
		}
		
//		Address_1
		Thread.sleep(2000);
		boolean add_permanent_address_address_1 = driver.findElement(By.xpath("//input[@name='Address Line 1']")).isDisplayed();
		
		
		if (add_permanent_address_address_1 == true) {
//			driver.findElement(By.xpath("//input[@name='State']")).clear();
//		
//			System.out.println("Address bar State displayed cleared");
			
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@name='Address Line 1']")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//input[@name='Address Line 1']")).sendKeys("Har har mahadev");
			
			System.out.println("Address_1 key sent succesfully");
		}
		else {
			System.out.println("Try diffrent method for address Address_1 not displayed");
		}
		
//		Done_buttom
		Thread.sleep(2000);
		boolean done_button_ = driver.findElement(By.xpath("//td[normalize-space()='Done']")).isEnabled();
		
		if(done_button_ == true) {
			driver.findElement(By.xpath("//td[normalize-space()='Done']")).click();
			System.out.println("Done button clicked");
		}
		else {
			System.out.println("Done button not clicked");
		}
		
//		Sucess_message
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

		
//		Loan account type
		Thread.sleep(2000);
		boolean agent_name = driver.findElement(By.xpath("//div[contains(text(),'Agent/Loan Details')]")).isDisplayed();
		System.out.println("Maxmun is visible");
		if (agent_name == true) {
			
			String age = driver.findElement(By.xpath("//div[contains(text(),'Agent/Loan Details')]")).getText();
			System.out.println("Agent name key sent: " + age);
		}
		
		else {
			System.out.println("Try another method for agent");
		}
//		Agent Name
		js.executeScript("document.getElementById(isc_O3.value='ACHARIYA EDUCATIONAL PUBLIC TRUST')");
		
		
//		Loan terms
		js.executeScript("document.getElementById(isc_OB.value='6/1 EMI PLAN')");
		
//		Agent branch
		
		js.executeScript("document.getElementById(isc_ON.value='PONDICHERRY')");
		
//		Loan amount
		js.executeScript("document.getElementById(isc_P8.value='100000')");
		
//		Scroll
		
//		js.executeScript("window.scrollBy(0,350)", "");
		Thread.sleep(2000);
        WebElement hoverable = driver.findElement(By.id("isc_Q5"));
        new Actions(driver)
                .moveToElement(hoverable)
                .perform();
		
		
		
//		Actions builder = new Actions(driver);
//		Action seriesOfActions = builder
//				.moveToElement(txtUsername)
//				.click()
//				.keyDown(txtUsername, Keys.SHIFT)
//				.sendKeys(txtUsername, "hello")
//				.keyUp(txtUsername, Keys.SHIFT)
//				.doubleClick(txtUsername)
//				.contextClick()
//				.build();
//				
//			seriesOfActions.perform() ;
//		Agent Name

		
				
//		
//		
//		Thread.sleep(2300);
//		boolean agent_name = driver.findElement(By.xpath("//input[@name='lDSLoanaccounttype']")).isDisplayed();
//		System.out.println("Loan account type is visible");
//		if (agent_name == true) {
//			
////			driver.findElement(By.xpath("(//table[@role='presentation'])[42]")).sendKeys("ACHARIYA EDUCATIONAL PUBLIC TRUST");
//			System.out.println("Agent name key sent");
//		}
//		
//		else {
//			System.out.println("Try another method for agent");
//		}
//		
		
		
//		Loan terms
//		Loan amount
		
//		address_1
//		Thread.sleep(2000);
//
//		boolean add_permanent_address_line_1 = driver.findElement(By.xpath("//input[@id='isc_1TB']")).isDisplayed();
//		
//		Thread.sleep(2000);
//		if (add_permanent_address_line_1 == true) {
//			driver.findElement(By.xpath("//input[@id='isc_1TB']")).sendKeys("hjkafdhjfka djnahs");
//		
//			System.out.println("Address line 1 done");
//		}
//		else {
//			System.out.println("Try diffrent method for address line 1");
//		}
//		
//		boolean add_permanent_address_line_2 = driver.findElement(By.xpath("//input[@name='Address Line 2']")).isDisplayed();
//		
//		Thread.sleep(2000);
//		if (add_permanent_address_line_2 == true) {
//			driver.findElement(By.xpath("//input[@name='Address Line 2']")).sendKeys("dhjfka djnahs");
//		
//			System.out.println("Address line 2 done");
//		}
//		else {
//			System.out.println("Try diffrent method for address line 2 ");
//		}
//		
//	
//		
//		
//		boolean add_permanent_address_city = driver.findElement(By.xpath("//input[@name='District']")).isDisplayed();
//		
//		Thread.sleep(2000);
//		if (add_permanent_address_city == true) {
//			driver.findElement(By.xpath("//input[@name='District']")).sendKeys("Hyderabad");
//		
//			System.out.println("Address city done");
//		}
//		else {
//			System.out.println("Try diffrent method for address city ");
//		}
//		Add permanent address postal
		
		
		
		//       try to get text adhar again  

//         Thread.sleep(3000);
//         boolean adhar1 =  driver.findElement(By.xpath("//label[normalize-space()='Aadhaar Number']")).isDisplayed();
//         
//         if(adhar1 == true) {
//         	System.out.println("Adhar1 is visible again");
//         }
//         else {
//         	System.out.println("Adhar1 is not visible again");
//         }

//         TO save the data click on save
//         Thread.sleep(3000);

//         boolean save = driver.findElement(By.xpath("//td[@class='OBToolbarIconButton_icon_save OBToolbarIconButton']")).isDisplayed();
//         if(save == true) {
//         	System.out.println("Save button is visible");
//         }
//         else {
//         	System.out.println("Not visible");
//         }
//         
////         Thread.sleep(2000);
//         driver.findElement(By.xpath("//td[@class='OBToolbarIconButton_icon_save OBToolbarIconButton']")).click();
////       

//         driver.findElement(By.xpath("//body[1]/div[3]/div[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[2]")).click();
//         Thread.sleep(4000);
//         driver.findElement(By.xpath("//div[@id='isc_GP']//table")).click();

//         boolean check = driver.findElement(By.xpath("//div[@id='isc_57']")).isDisplayed();
//         
//         if(check == true) {
//         	System.out.println("logout button is visible");
//         }
//         
//         else {
//         	System.out.println("Logout button is not visible");
//         }
//         
//         Thread.sleep(3000);
//         
//         driver.findElement(By.xpath("//td[normalize-space()='OK']")).click();
//       Thread.sleep(5000);  
//		 driver.close();
//	}
	}
}
