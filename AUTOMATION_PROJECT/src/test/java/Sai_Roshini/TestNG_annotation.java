package Sai_Roshini;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.github.dockerjava.api.model.Driver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNG_annotation {

	WebDriver driver;
//	Precedence Wise Execution:
	
	
	@BeforeMethod(enabled = true)
	public void beforeMethod() {
		
		
	}
	
	@Test(priority = 1, enabled = true)
	public void pre_enq_upto_GetScore() throws InterruptedException {
			

				WebDriverManager.chromedriver().setup();
				
				driver = new ChromeDriver();
				
				JavascriptExecutor js = (JavascriptExecutor) driver;
						
				driver.manage().window().maximize();
				WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
				String aadhar_number = "598149064414";
				String pan_card = "HQQPS2965M";
//				WebDriverWait wait = new WebDriverWait(driver, 20);

//				WebDriverWait wait = new WebDriverWait(driver,20);
				driver.get("https://saiuat.easycloud.co.in/erp/security/Login");

//		         Thread.sleep(3000);

				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

//		 		Login page
				
				driver.findElement(By.xpath("//input[@id='user']")).sendKeys("Adithya");

				driver.findElement(By.xpath("//input[@id='password']")).sendKeys("123456");

				boolean login = driver.findElement(By.xpath("//td[@class='Button_text Button_width']")).isDisplayed();

				if (login == true) {
					System.out.println("Login button is visible");
				} else {
					System.out.println("Login button is not visible");
				}

				driver.findElement(By.xpath("//td[@class='Button_text Button_width']")).click();

//		         Thread.sleep(4000);

//		         driver.findElement(By.xpath("//img[@name='isc_10main']")).click();

//		         Thread.sleep(4000);

				
/***			
				
				
				boolean app = driver.findElement(By.xpath(
						"//body[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/table[1]/tbody[1]/tr[1]/td[2]"))
						.isDisplayed();
				if (app == true) {
					System.out.println("Application is visible");
				} else {
					System.out.println("Application is not visible");
				}
//		         Thread.sleep(3000);
				// Application
				driver.findElement(By.xpath(
						"/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/table[1]/tbody[1]/tr[1]/td[2]"))
						.click();
//		         Thread.sleep(3000);
				// Pre-Enquiry
//		         Thread.sleep(3000);
				driver.findElement(By.xpath("(//div[@role='presentation'])[2]")).click();
				
				
***/
//				Pre-enq search
				
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
//		         Thread.sleep(5000);
				boolean new1 = driver
						.findElement(By.xpath("(//td[@class='OBToolbarIconButton_icon_newDoc OBToolbarIconButton'])[1]"))
						.isDisplayed();
				if (new1 == true) {
					System.out.println("New is visible");
				} else {
					System.out.println("New is nor visible");
				}

				driver.findElement(By.xpath("(//td[@class='OBToolbarIconButton_icon_newDoc OBToolbarIconButton'])[1]")).click();

//		         Name of customer
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
////		         Adhar number
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

//		       Click on pan number   

				driver.findElement(By.xpath("//input[@name='panno']")).click();
				Thread.sleep(3000);

				driver.findElement(By.xpath("//input[@name='panno']")).sendKeys(pan_card);
				System.out.println("PAN done");
//				ADPED9876A
//				Date of birth

				Thread.sleep(2100);

				driver.findElement(By.xpath("//input[@name='dateofbirth_dateTextField']")).click();
				Thread.sleep(2000);

				driver.findElement(By.xpath("//input[@name='dateofbirth_dateTextField']")).sendKeys("26-08-1996");
				System.out.println("Date done");
//Gender
				Thread.sleep(2000);

				driver.findElement(By.xpath("//input[@name='gender']")).click();

				Thread.sleep(2000);
				driver.findElement(By.xpath("//input[@name='gender']")).sendKeys("M- Male");
				System.out.println("Gender done");

//Mobile number
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
				

//	save button
//				Thread.sleep(2000);
//				boolean save = driver.findElement(By.xpath("//td[@class='OBToolbarIconButton_icon_save OBToolbarIconButton']")).isEnabled();
//				
//				if (save == true) {
//					System.out.println("Save button is visible");
//					
//				}
//				else {
//					System.out.println("Save button is not visible");
//				}
//				
//				driver.findElement(By.xpath("//td[@class='OBToolbarIconButton_icon_save OBToolbarIconButton']")).click();
				
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

//				Done button in KYC
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
				
//				error message after fetch kyc fail
				try {
						boolean fail_message = driver.findElement(By.xpath("//b[normalize-space()='No record found']")).isDisplayed();
							
						Thread.sleep(2000);
						
						String failed =  driver.findElement(By.xpath("//b[normalize-space()='No record found']")).getText();
						if (fail_message == true) {
							System.out.println("Displayed error message is: "+ failed);
						} 
//Filling of address	
						if(fail_message == true) {
//							Permanent address button search button
							
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
//							postal
							
							boolean add_permanent_address_postal = driver.findElement(By.xpath("//input[@name='Postal']")).isDisplayed();
							
							Thread.sleep(2000);
							
							if (add_permanent_address_postal == true) {
								driver.findElement(By.xpath("//input[@name='Postal']")).sendKeys("500020");
							
								System.out.println("Address bar postal done");
							}
							else {
								System.out.println("Try diffrent method for address bar title");
							}
							
							
//							Country
							
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
							
//							State
							
							Thread.sleep(2000);
							boolean add_permanent_address_state = driver.findElement(By.xpath("//input[@name='State']")).isDisplayed();
							
							
							if (add_permanent_address_state == true) {
//								driver.findElement(By.xpath("//input[@name='State']")).clear();
//							
//								System.out.println("Address bar State displayed cleared");
								
								Thread.sleep(2000);
								driver.findElement(By.xpath("//input[@name='State']")).click();
								Thread.sleep(1000);
								driver.findElement(By.xpath("//input[@name='State']")).sendKeys("Telangana");
								
								System.out.println("State key sent succesfully");
							}
							else {
								System.out.println("Try diffrent method for address State not displayed");
							}
							
//							District

							Thread.sleep(2000);
							boolean add_permanent_address_district = driver.findElement(By.xpath("//input[@name='District']")).isDisplayed();
							
							
							if (add_permanent_address_district == true) {
//								driver.findElement(By.xpath("//input[@name='State']")).clear();
//							
//								System.out.println("Address bar State displayed cleared");
								
								Thread.sleep(2000);
								driver.findElement(By.xpath("//input[@name='District']")).click();
								Thread.sleep(1000);
								driver.findElement(By.xpath("//input[@name='District']")).sendKeys("HYDERABAD");
								
								System.out.println("District key sent succesfully");
							}
							else {
								System.out.println("Try diffrent method for address District not displayed");
							}
							
//							City
							
							Thread.sleep(2000);
							boolean add_permanent_address_city = driver.findElement(By.xpath("//input[@name='City']")).isDisplayed();
							
							
							if (add_permanent_address_city == true) {
//								driver.findElement(By.xpath("//input[@name='State']")).clear();
//							
//								System.out.println("Address bar State displayed cleared");
								
								Thread.sleep(2000);
								driver.findElement(By.xpath("//input[@name='City']")).click();
								Thread.sleep(1000);
								driver.findElement(By.xpath("//input[@name='City']")).sendKeys("HYDERABAD");
								
								System.out.println("City key sent succesfully");
							}
							else {
								System.out.println("Try diffrent method for address City not displayed");
							}
							
//							Address_1
							Thread.sleep(2000);
							boolean add_permanent_address_address_1 = driver.findElement(By.xpath("//input[@name='Address Line 1']")).isDisplayed();
							
							
							if (add_permanent_address_address_1 == true) {
//								driver.findElement(By.xpath("//input[@name='State']")).clear();
//							
//								System.out.println("Address bar State displayed cleared");
								
								Thread.sleep(2000);
								driver.findElement(By.xpath("//input[@name='Address Line 1']")).click();
								Thread.sleep(1000);
								driver.findElement(By.xpath("//input[@name='Address Line 1']")).sendKeys("Har har mahadev");
								
								System.out.println("Address_1 key sent succesfully");
							}
							else {
								System.out.println("Try diffrent method for address Address_1 not displayed");
							}
							
//							Done_buttom
							Thread.sleep(2000);
							boolean done_button_ = driver.findElement(By.xpath("//td[normalize-space()='Done']")).isEnabled();
							
							if(done_button_ == true) {
								driver.findElement(By.xpath("//td[normalize-space()='Done']")).click();
								System.out.println("Done button clicked");
							}
							else {
								System.out.println("Done button not clicked");
							}
							
//							Sucess_message
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
//				success message after fetch kyc
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

//				Scroll
				
//				js.executeScript("window.scrollBy(0,350)", "");
				Thread.sleep(2000);
		        WebElement hoverable = driver.findElement(By.xpath("//input[@name='product']"));
		        new Actions(driver)
		                .moveToElement(hoverable)
		                .perform();				
				
		        
		        
		        
//				Loan account type
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


			       
			       
//					Loan amount
//					js.executeScript("document.getElementById(isc_3H7.value='100000')");
//					System.out.println("Loan amount done");				
				
				
//				Agent Name
//				js.executeScript("document.getElementByName(bpagent.value='ACHARIYA EDUCATIONAL PUBLIC TRUST')");
//				System.out.println("Agent name done");
		        Thread.sleep(2000);
		        
		        WebElement Agent_name = driver.findElement(By.xpath("(//input[@name='bpagent'])[2]"));
		        
		        Agent_name.sendKeys("ACHARIYA EDUCATIONAL PUBLIC TRUST");
		        
		        
				Thread.sleep(1500);
				
				Agent_name.sendKeys(Keys.ENTER);
		        
		        
				
				
				
//				Loan terms
//				js.executeScript("document.getElementById(isc_3GA.value='6/1 EMI PLAN')");
//				System.out.println("Loan terms done");
		      //
	        	
		        Thread.sleep(2000);
	
		        
		        WebElement Loan_term = driver.findElement(By.xpath("(//input[@name='lDSAgent'])[2]"));
		        
		        Loan_term.sendKeys("6/1 EMI PLAN");
		        
		        
				Thread.sleep(1500);
				
				Loan_term.sendKeys(Keys.ENTER);

//		Loan amount      
				
		        Thread.sleep(2000);
		        
		        driver.findElement(By.xpath("(//input[@name='loanamount'])")).click();
		        driver.findElement(By.xpath("(//input[@name='loanamount'])")).sendKeys("50,000.00");
		        Thread.sleep(2000);

//				Agent branch

		        Thread.sleep(2000);
	
		        
		        WebElement Agent_branch = driver.findElement(By.xpath("(//input[@name='agentbranch'])[2]"));
		        
		        Agent_branch.sendKeys("PONDICHERRY");
		        
		        
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
					
//					js.executeScript("document.getElementById(isc_3GM.value='PONDICHERRY')");
//					System.out.println("Agent branch done");
//								
				
				
//				Actions builder = new Actions(driver);
//				Action seriesOfActions = builder
//						.moveToElement(txtUsername)
//						.click()
//						.keyDown(txtUsername, Keys.SHIFT)
//						.sendKeys(txtUsername, "hello")
//						.keyUp(txtUsername, Keys.SHIFT)
//						.doubleClick(txtUsername)
//						.contextClick()
//						.build();
//						
//					seriesOfActions.perform() ;
//				Agent Name

				
						
//				
//				
//				Thread.sleep(2300);
//				boolean agent_name = driver.findElement(By.xpath("//input[@name='lDSLoanaccounttype']")).isDisplayed();
//				System.out.println("Loan account type is visible");
//				if (agent_name == true) {
//					
////					driver.findElement(By.xpath("(//table[@role='presentation'])[42]")).sendKeys("ACHARIYA EDUCATIONAL PUBLIC TRUST");
//					System.out.println("Agent name key sent");
//				}
//				
//				else {
//					System.out.println("Try another method for agent");
//				}
//				
				
				
//				Loan terms
//				Loan amount
				
//				address_1
//				Thread.sleep(2000);
		//
//				boolean add_permanent_address_line_1 = driver.findElement(By.xpath("//input[@id='isc_1TB']")).isDisplayed();
//				
//				Thread.sleep(2000);
//				if (add_permanent_address_line_1 == true) {
//					driver.findElement(By.xpath("//input[@id='isc_1TB']")).sendKeys("hjkafdhjfka djnahs");
//				
//					System.out.println("Address line 1 done");
//				}
//				else {
//					System.out.println("Try diffrent method for address line 1");
//				}
//				
//				boolean add_permanent_address_line_2 = driver.findElement(By.xpath("//input[@name='Address Line 2']")).isDisplayed();
//				
//				Thread.sleep(2000);
//				if (add_permanent_address_line_2 == true) {
//					driver.findElement(By.xpath("//input[@name='Address Line 2']")).sendKeys("dhjfka djnahs");
//				
//					System.out.println("Address line 2 done");
//				}
//				else {
//					System.out.println("Try diffrent method for address line 2 ");
//				}
//				
		//	
//				
//				
//				boolean add_permanent_address_city = driver.findElement(By.xpath("//input[@name='District']")).isDisplayed();
//				
//				Thread.sleep(2000);
//				if (add_permanent_address_city == true) {
//					driver.findElement(By.xpath("//input[@name='District']")).sendKeys("Hyderabad");
//				
//					System.out.println("Address city done");
//				}
//				else {
//					System.out.println("Try diffrent method for address city ");
//				}
//				Add permanent address postal
				
				
				
				//       try to get text adhar again  

//		         Thread.sleep(3000);
//		         boolean adhar1 =  driver.findElement(By.xpath("//label[normalize-space()='Aadhaar Number']")).isDisplayed();
//		         
//		         if(adhar1 == true) {
//		         	System.out.println("Adhar1 is visible again");
//		         }
//		         else {
//		         	System.out.println("Adhar1 is not visible again");
//		         }

//		         TO save the data click on save
//		         Thread.sleep(3000);

//		         boolean save = driver.findElement(By.xpath("//td[@class='OBToolbarIconButton_icon_save OBToolbarIconButton']")).isDisplayed();
//		         if(save == true) {
//		         	System.out.println("Save button is visible");
//		         }
//		         else {
//		         	System.out.println("Not visible");
//		         }
//		         
////		         Thread.sleep(2000);
//		         driver.findElement(By.xpath("//td[@class='OBToolbarIconButton_icon_save OBToolbarIconButton']")).click();
////		       

//		         driver.findElement(By.xpath("//body[1]/div[3]/div[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[2]")).click();
//		         Thread.sleep(4000);
//		         driver.findElement(By.xpath("//div[@id='isc_GP']//table")).click();

//		         boolean check = driver.findElement(By.xpath("//div[@id='isc_57']")).isDisplayed();
//		         
//		         if(check == true) {
//		         	System.out.println("logout button is visible");
//		         }
//		         
//		         else {
//		         	System.out.println("Logout button is not visible");
//		         }
//		         
//		         Thread.sleep(3000);
//		         
//		         driver.findElement(By.xpath("//td[normalize-space()='OK']")).click();
//		       Thread.sleep(5000);  
//				 driver.close();
//			}
				
				Thread.sleep(2000);
//	Download Cibil/crif
				
				WebElement Cibil = driver.findElement(By.xpath("(//div[@role='button'])[14]"));
				
				Cibil.click();
				System.out.println("Clicked on download cibil");
				Thread.sleep(2000);
				
				boolean Done_button_in_Cibil = driver.findElement(By.xpath("//td[normalize-space()='Done']")).isDisplayed();
				
				Thread.sleep(2000);
				if(Done_button_in_Cibil = true) {
					WebElement Cibil_Done = driver.findElement(By.xpath("//td[normalize-space()='Done']"));
					
					Cibil_Done.click();
					System.out.println("Clicked on Done in download cibil");
				}
				else {
					System.out.println("Done button in cibil is not visible");
				}
	
//	Validate cibil by cibil score
//				scroll to cibil score
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
		        	System.out.println("Cibil score Message is=="+ fetch_msg);
		        }
		        else {
		        	System.out.println("Cibil score Message not fetched");
		        }
		        
		        
		        
		        
		        boolean select_cibil = driver.findElement(By.xpath("//input[@name='actualcibilscore']")).isDisplayed();
		        
		        if(select_cibil == true) {
		        	String value_cibil = driver.findElement(By.xpath("//input[@name='actualcibilscore']")).getText();
		        	System.out.println("Value of cibil=="+ value_cibil);
		        }
		        else {
		        	System.out.println("Unable to fetch cibil value");
		        }
		        
		        String get_cibil = driver.findElement(By.xpath("//input[@name='actualcibilscore']")).getAttribute("type");
		        		        		        
		        System.out.println("Cibil score is ==" + get_cibil);
	
	
	
//		        Get Score
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
				
//				validating Get score
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
					
//	copy bs link url 
				String bs_link_url_path = "//input[@name='ldsBsurl']";
//				Scroll to bslink
				Thread.sleep(4000);
		        WebElement bs_link_url = driver.findElement(By.xpath(bs_link_url_path));
		        new Actions(driver)
		                .moveToElement(bs_link_url)
		                .perform();		
		        System.out.println("Moved to cibil score");
		        Thread.sleep(2000);
		        
		        bs_link_url.getAttribute("value");
		        
	
	}	

		
	
	@Test(priority = 2, enabled = true)
	
	public void delete_process_loans() throws InterruptedException {
		
	

			WebDriverManager.chromedriver().setup();
			
			driver = new ChromeDriver();
			
			JavascriptExecutor js = (JavascriptExecutor) driver;
			
			Actions action = new Actions(driver);
			
			driver.manage().window().maximize();
			
//			WebDriverWait wait = new WebDriverWait(driver, 20);

			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
			driver.get("https://saiuat.easycloud.co.in/erp/security/Login");

//	         Thread.sleep(3000);

			driver.manage().window().maximize();
//			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

//	 		Login page
			
			wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//input[@id='user']"))));

			WebElement login_id = driver.findElement(By.xpath("//input[@id='user']"));
			
			wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//input[@id='password']"))));
			
			WebElement pass = driver.findElement(By.xpath("//input[@id='password']"));
			
			login_id.sendKeys("Adithya");
			pass.sendKeys("123456");
			
			wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//td[@class='Button_text Button_width']"))));
			
			boolean login = driver.findElement(By.xpath("//td[@class='Button_text Button_width']")).isDisplayed();

			if (login == true) {
				System.out.println("Login button is visible");
			} else {
				System.out.println("Login button is not visible");
			}

			WebElement login_button = driver.findElement(By.xpath("//td[@class='Button_text Button_width']"));
			
			login_button.click();
			
//			Search button
			Thread.sleep(5000);
			
			wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.id("isc_C"))));
			
			
			WebElement search = driver.findElement(By.id("isc_C"));
			
			search.click();

						
//			--------Search Client Master in search--------
			WebElement search_text = driver.findElement(By.xpath("//input[@name='value']"));
			
			wait.until(ExpectedConditions.elementToBeClickable(search_text));
			
			search_text.sendKeys("Client Master");
			
			Thread.sleep(1500);
			
			search_text.sendKeys(Keys.ENTER);

//			------Search adhar number in adhar search box-------
			wait.until(ExpectedConditions.elementToBeClickable(By.name("aadhaarnumber")));
			
			WebElement adhar_search_text = driver.findElement(By.name("aadhaarnumber"));		
			
			adhar_search_text.sendKeys("598149064414");
	/***
			js.executeScript("document.getElementById(isc_AS.value='598149064414')");
	***/		Thread.sleep(2000);
			
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//table[@role='presentation'])[2]")));
			
			WebElement adhar_select = driver.findElement(By.xpath("(//table[@role='presentation'])[2]"));
			
			boolean adhar_select_is = adhar_select.isDisplayed();
			
			if(adhar_select_is == true) {
					 
				adhar_select.click();
				System.out.println("Adhar Checkbox is selected");
				}
			
			else {
				System.out.println("Adhar checkbox not selected");
			}
			Thread.sleep(2000);
			
//			select Loans
			try {
					driver.findElement(By.xpath("(//td)[260]")).click();
					System.out.println("Loans parent clicked");
					Thread.sleep(2000);
					
			}
			catch(Exception e)
			{
			System.out.println("Loan is not there");
			}
			
			
//			delete button
			try {
					boolean delete = driver.findElement(By.xpath("(//td[@class='OBToolbarIconButton_icon_eliminate OBToolbarIconButton'])[2]")).isDisplayed();
						if(delete == true) {
							System.out.println("Loan child clicked");
							driver.findElement(By.xpath("(//td[@class='OBToolbarIconButton_icon_eliminate OBToolbarIconButton'])[2]")).click();
						}
						else {
							System.out.println("Loan child not clicked");
						}
				}
			catch(Exception e)
				{
				System.out.println("Loan is not there");
				}
			Thread.sleep(2000);
							
			driver.findElement(By.xpath("//td[contains(text(),'Yes')]")).click();
			
			System.out.println("Loan child deleted");
			
			
			
			
			
			
			
			
			
			
			
			
/***===========================================			
//			delete location---1 
		
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("(//div[@eventproxy='isc_OBTabBarButtonChild_3'])[1]")).click();
			Thread.sleep(2000);
			System.out.println("location selected");
			try {	
				boolean delete1 = driver.findElement(By.xpath("//body[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[23]")).isDisplayed();
				if(delete1 == true) {
					System.out.println("true1");
					driver.findElement(By.xpath("//body[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[23]")).click();
				}
				else {
					System.out.println("false1");
				}
			}
			catch(Exception e){
				System.out.println("sometning went wrong");
			}
			Thread.sleep(2000);
			driver.findElement(By.xpath("//td[contains(text(),'Yes')]")).click();
	
	
//			Pre-enq delete process
			
//			Search button
			Thread.sleep(3000);
			
			wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.id("isc_C"))));
			
			
			WebElement search_again = driver.findElement(By.id("isc_C"));
			
			search_again.click();
			
			
			Thread.sleep(2000);
			WebElement search_text_again = driver.findElement(By.xpath("//input[@name='value']"));
			
			wait.until(ExpectedConditions.elementToBeClickable(search_text_again));
			
			search_text_again.sendKeys("Pre-Enquiry Form");
			
			Thread.sleep(1500);
			
			search_text_again.sendKeys(Keys.ENTER);
			
//			clear filter

			Thread.sleep(4000);
			boolean element_1 = driver.findElement(By.xpath("//span[normalize-space()='Clear Filter(s)']")).isDisplayed();
			if(element_1 == true) {
				System.out.println("visible clear filter ");
				driver.findElement(By.xpath("//span[normalize-space()='Clear Filter(s)']")).click();	
			}
			else {
				System.out.println("not visible clear filter");
			}
//			Search aadhar number
			Thread.sleep(3000);
			driver.findElement(By.xpath("//input[@name='prooftypenumber']")).sendKeys("598149064414");
			System.out.println("Searching for aadhar card");

			
//			checkbox
//			I want to do refresh so that i select automaticlly
			Thread.sleep(2000);
//			Refresh button
			driver.findElement(By.xpath("//body[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[56]/table[1]/tbody[1]/tr[1]/td[1]")).click();
			System.out.println("refresh");
//			delete 
			Thread.sleep(2000);
			boolean delete2 = driver.findElement(By.xpath("//body[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[55]/table[1]/tbody[1]/tr[1]/td[1]")).isDisplayed();
			if(delete2 == true) {
				System.out.println("delete2");
				driver.findElement(By.xpath("//body[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[55]/table[1]/tbody[1]/tr[1]/td[1]")).click();
			}
			else {
				System.out.println("delete 2 not done");
			}
		
		
			Thread.sleep(2000);
			driver.findElement(By.xpath("//td[contains(text(),'Yes')]")).click();
			
			
									
//			boolean checkbox = driver.findElement(By.xpath("(//span[@eventpart='valueicon'])[1]")).isDisplayed();
//			
//			if(checkbox == true) {
//				System.out.println("Visible check box");
//			 WebElement checkWalaBox = 	driver.findElement(By.xpath("(//td)[84]"));
//			       
//			 checkWalaBox.click();
//			}
//			else {
//				System.out.println("NOt visible checkbox");
//			}
//			
			
			//using click action method
			
			//		Checkbox
//			driver.findElement(By.xpath("//input[@name='prooftypenumber']")).sendKeys("598149064414");
//			
//			driver.findElement(By.cssSelector("div[role='label'][eventproxy='isc_Number_4']")).click();
//	

//			client master process again 
			
***/
	}
	
	
	@Test(priority = 3, enabled = true)
	
	public void delete_process_location_and_pre_enq() throws InterruptedException {
		
	

			WebDriverManager.chromedriver().setup();
			
			driver = new ChromeDriver();
			
			JavascriptExecutor js = (JavascriptExecutor) driver;
			
			Actions action = new Actions(driver);
			
			driver.manage().window().maximize();
			
//			WebDriverWait wait = new WebDriverWait(driver, 20);

			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
			driver.get("https://saiuat.easycloud.co.in/erp/security/Login");

//	         Thread.sleep(3000);

			driver.manage().window().maximize();
//			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

//	 		Login page
			
			wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//input[@id='user']"))));

			WebElement login_id = driver.findElement(By.xpath("//input[@id='user']"));
			
			wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//input[@id='password']"))));
			
			WebElement pass = driver.findElement(By.xpath("//input[@id='password']"));
			
			login_id.sendKeys("Adithya");
			pass.sendKeys("123456");
			
			wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//td[@class='Button_text Button_width']"))));
			
			boolean login = driver.findElement(By.xpath("//td[@class='Button_text Button_width']")).isDisplayed();

			if (login == true) {
				System.out.println("Login button is visible");
			} else {
				System.out.println("Login button is not visible");
			}

			WebElement login_button = driver.findElement(By.xpath("//td[@class='Button_text Button_width']"));
			
			login_button.click();
			
//			Search button
			Thread.sleep(5000);
			
			wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.id("isc_C"))));
			
			
			WebElement search = driver.findElement(By.id("isc_C"));
			
			search.click();


						
//			--------Search Client Master in search--------
			WebElement search_text = driver.findElement(By.xpath("//input[@name='value']"));
			
			wait.until(ExpectedConditions.elementToBeClickable(search_text));
			
			search_text.sendKeys("Client Master");
			
			Thread.sleep(1500);
			
			search_text.sendKeys(Keys.ENTER);

//			------Search adhar number in adhar search box-------
			wait.until(ExpectedConditions.elementToBeClickable(By.name("aadhaarnumber")));
			
			WebElement adhar_search_text = driver.findElement(By.name("aadhaarnumber"));		
			
			adhar_search_text.sendKeys("598149064414");
	
//			js.executeScript("document.getElementById(isc_AS.value='598149064414')");
			Thread.sleep(2000);
			
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//table[@role='presentation'])[2]")));
			
			WebElement adhar_select = driver.findElement(By.xpath("(//table[@role='presentation'])[2]"));
			
			boolean adhar_select_is = adhar_select.isDisplayed();
			
			if(adhar_select_is == true) {
					 
				adhar_select.click();
				System.out.println("Adhar Checkbox is selected");
				}
			
			else {
				System.out.println("Adhar checkbox not selected");
			}
			Thread.sleep(2000);

		
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("(//div[@eventproxy='isc_OBTabBarButtonChild_3'])[1]")).click();
			Thread.sleep(2000);
			System.out.println("location selected");
			try {	
				boolean delete1 = driver.findElement(By.xpath("(//td[@class='OBToolbarIconButton_icon_eliminate OBToolbarIconButton'])[2]")).isDisplayed();
				if(delete1 == true) {
					System.out.println("true1");
					driver.findElement(By.xpath("(//td[@class='OBToolbarIconButton_icon_eliminate OBToolbarIconButton'])[2]")).click();
				}
				else {
					System.out.println("false1");
				}
			}
			catch(Exception e){
				System.out.println("sometning went wrong");
			}
			Thread.sleep(2000);
			driver.findElement(By.xpath("//td[contains(text(),'Yes')]")).click();
	
						
			
			
			
	
//			Pre-enq delete process
			
//			Search button
			Thread.sleep(3000);
			
			wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.id("isc_C"))));
			
			
			WebElement search_again = driver.findElement(By.id("isc_C"));
			
			search_again.click();
			
			
			Thread.sleep(2000);
			WebElement search_text_again = driver.findElement(By.xpath("//input[@name='value']"));
			
			wait.until(ExpectedConditions.elementToBeClickable(search_text_again));
			
			search_text_again.sendKeys("Pre-Enquiry Form");
			
			Thread.sleep(1500);
			
			search_text_again.sendKeys(Keys.ENTER);
			
//			clear filter

			Thread.sleep(4000);
			boolean element_1 = driver.findElement(By.xpath("//span[normalize-space()='Clear Filter(s)']")).isDisplayed();
			if(element_1 == true) {
				System.out.println("visible clear filter ");
				driver.findElement(By.xpath("//span[normalize-space()='Clear Filter(s)']")).click();	
			}
			else {
				System.out.println("not visible clear filter");
			}
//			Search aadhar number
			Thread.sleep(3000);
			driver.findElement(By.xpath("//input[@name='prooftypenumber']")).sendKeys("598149064414");
			System.out.println("Searching for aadhar card");

			
//			checkbox
//			I want to do refresh so that i select automaticlly
			Thread.sleep(2000);
//			Refresh button
			boolean refresh_but = driver.findElement(By.xpath("(//td[@class='OBToolbarIconButton_icon_refresh OBToolbarIconButton'])[3]")).isDisplayed();
			
			if(refresh_but == true) {
				System.out.println("refresh is visible");
				driver.findElement(By.xpath("(//td[@class=\"OBToolbarIconButton_icon_refresh OBToolbarIconButton\"])[3]")).click();
			}
			else{
			System.out.println("refresh is not visible");
			}
			
			
			
//			delete 
			Thread.sleep(2000);
			boolean delete2 = driver.findElement(By.xpath("//body[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[47]/table[1]/tbody[1]/tr[1]/td[1]")).isDisplayed();
			if(delete2 == true) {
				System.out.println("delete2 done");
				driver.findElement(By.xpath("//body[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[47]/table[1]/tbody[1]/tr[1]/td[1]")).click();
			}
			else {
				System.out.println("delete 2 not done");
			}
		
		
			Thread.sleep(2000);
			driver.findElement(By.xpath("//td[contains(text(),'Yes')]")).click();
			
			
									
//			boolean checkbox = driver.findElement(By.xpath("(//span[@eventpart='valueicon'])[1]")).isDisplayed();
//			
//			if(checkbox == true) {
//				System.out.println("Visible check box");
//			 WebElement checkWalaBox = 	driver.findElement(By.xpath("(//td)[84]"));
//			       
//			 checkWalaBox.click();
//			}
//			else {
//				System.out.println("NOt visible checkbox");
//			}
//			
			
			//using click action method
			
			//		Checkbox
//			driver.findElement(By.xpath("//input[@name='prooftypenumber']")).sendKeys("598149064414");
//			
//			driver.findElement(By.cssSelector("div[role='label'][eventproxy='isc_Number_4']")).click();
//	

//			client master process again 
			

	}
	
	@Test(priority = 4, enabled = true)
	

	public void client_master() throws InterruptedException {
		
	

			WebDriverManager.chromedriver().setup();
			
			driver = new ChromeDriver();
			
			JavascriptExecutor js = (JavascriptExecutor) driver;
			
			Actions action = new Actions(driver);
			
			driver.manage().window().maximize();
			
//			WebDriverWait wait = new WebDriverWait(driver, 20);

			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
			driver.get("https://saiuat.easycloud.co.in/erp/security/Login");

//	         Thread.sleep(3000);

			driver.manage().window().maximize();
//			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

//	 		Login page
			
			wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//input[@id='user']"))));

			WebElement login_id = driver.findElement(By.xpath("//input[@id='user']"));
			
			wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//input[@id='password']"))));
			
			WebElement pass = driver.findElement(By.xpath("//input[@id='password']"));
			
			login_id.sendKeys("Adithya");
			pass.sendKeys("123456");
			
			wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//td[@class='Button_text Button_width']"))));
			
			boolean login = driver.findElement(By.xpath("//td[@class='Button_text Button_width']")).isDisplayed();

			if (login == true) {
				System.out.println("Login button is visible");
			} else {
				System.out.println("Login button is not visible");
			}

			WebElement login_button = driver.findElement(By.xpath("//td[@class='Button_text Button_width']"));
			
			login_button.click();
			
//			Search button
			Thread.sleep(5000);
			
			wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.id("isc_C"))));
			
			
			WebElement search = driver.findElement(By.id("isc_C"));
			
			search.click();

						
//			--------Search Client Master in search--------
			WebElement search_text = driver.findElement(By.xpath("//input[@name='value']"));
			
			wait.until(ExpectedConditions.elementToBeClickable(search_text));
			
			search_text.sendKeys("Client Master");
			
			Thread.sleep(1500);
			
			search_text.sendKeys(Keys.ENTER);

//			------Search adhar number in adhar search box-------
			wait.until(ExpectedConditions.elementToBeClickable(By.name("aadhaarnumber")));
			
			WebElement adhar_search_text = driver.findElement(By.name("aadhaarnumber"));		
			
			adhar_search_text.sendKeys("598149064414");
	/***
			js.executeScript("document.getElementById(isc_AS.value='598149064414')");
	***/		Thread.sleep(2000);
			
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//table[@role='presentation'])[2]")));
			
			WebElement adhar_select = driver.findElement(By.xpath("(//table[@role='presentation'])[2]"));
			
			boolean adhar_select_is = adhar_select.isDisplayed();
			
			if(adhar_select_is == true) {
					 
				adhar_select.click();
				System.out.println("Adhar Checkbox is selected");
				}
			
			else {
				System.out.println("Adhar checkbox not selected");
			}
			Thread.sleep(2000);
			
//			delete functionality
			
			try {	
				boolean delete1 = driver.findElement(By.xpath("//td[@class='OBToolbarIconButton_icon_eliminate OBToolbarIconButton']")).isDisplayed();
				if(delete1 == true) {
					System.out.println("true1");
					driver.findElement(By.xpath("//td[@class='OBToolbarIconButton_icon_eliminate OBToolbarIconButton']")).click();
				}
				else {
					System.out.println("false1");
				}
			}
			catch(Exception e){
				System.out.println("sometning went wrong with delete of parent client master");
			}
			Thread.sleep(2000);
			driver.findElement(By.xpath("//td[contains(text(),'Yes')]")).click();
		
/***			
			
			driver.findElement(By.xpath("(//div[@eventproxy='isc_OBTabBarButtonChild_3'])[1]")).click();
			Thread.sleep(2000);
			System.out.println("location selected");
			try {	
				boolean delete1 = driver.findElement(By.xpath("//body[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[23]")).isDisplayed();
				if(delete1 == true) {
					System.out.println("true1");
					driver.findElement(By.xpath("//body[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[23]")).click();
				}
				else {
					System.out.println("false1");
				}
			}
			catch(Exception e){
				System.out.println("sometning went wrong");
			}
			Thread.sleep(2000);
			driver.findElement(By.xpath("//td[contains(text(),'Yes')]")).click();
	
	
//			Pre-enq delete process
			
//			Search button
			Thread.sleep(3000);
			
			wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.id("isc_C"))));
			
			
			WebElement search_again = driver.findElement(By.id("isc_C"));
			
			search_again.click();
			
			
			Thread.sleep(2000);
			WebElement search_text_again = driver.findElement(By.xpath("//input[@name='value']"));
			
			wait.until(ExpectedConditions.elementToBeClickable(search_text_again));
			
			search_text_again.sendKeys("Pre-Enquiry Form");
			
			Thread.sleep(1500);
			
			search_text_again.sendKeys(Keys.ENTER);
			
//			clear filter

			Thread.sleep(4000);
			boolean element_1 = driver.findElement(By.xpath("//span[normalize-space()='Clear Filter(s)']")).isDisplayed();
			if(element_1 == true) {
				System.out.println("visible clear filter ");
				driver.findElement(By.xpath("//span[normalize-space()='Clear Filter(s)']")).click();	
			}
			else {
				System.out.println("not visible clear filter");
			}
//			Search aadhar number
			Thread.sleep(3000);
			driver.findElement(By.xpath("//input[@name='prooftypenumber']")).sendKeys("598149064414");
			System.out.println("Searching for aadhar card");

			
//			checkbox
//			I want to do refresh so that i select automaticlly
			Thread.sleep(2000);
//			Refresh button
			driver.findElement(By.xpath("//body[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[56]/table[1]/tbody[1]/tr[1]/td[1]")).click();
			System.out.println("refresh");
//			delete 
			Thread.sleep(2000);
			boolean delete2 = driver.findElement(By.xpath("//body[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[55]/table[1]/tbody[1]/tr[1]/td[1]")).isDisplayed();
			if(delete2 == true) {
				System.out.println("delete2");
				driver.findElement(By.xpath("//body[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[55]/table[1]/tbody[1]/tr[1]/td[1]")).click();
			}
			else {
				System.out.println("delete 2 not done");
			}
		
		
			Thread.sleep(2000);
			driver.findElement(By.xpath("//td[contains(text(),'Yes')]")).click();
			
			
									
//			boolean checkbox = driver.findElement(By.xpath("(//span[@eventpart='valueicon'])[1]")).isDisplayed();
//			
//			if(checkbox == true) {
//				System.out.println("Visible check box");
//			 WebElement checkWalaBox = 	driver.findElement(By.xpath("(//td)[84]"));
//			       
//			 checkWalaBox.click();
//			}
//			else {
//				System.out.println("NOt visible checkbox");
//			}
//			
			
			//using click action method
			
			//		Checkbox
//			driver.findElement(By.xpath("//input[@name='prooftypenumber']")).sendKeys("598149064414");
//			
//			driver.findElement(By.cssSelector("div[role='label'][eventproxy='isc_Number_4']")).click();
//	

//			client master process again 
***/			
	}			

	@AfterMethod(enabled = true)
	public void afterMethod() {
		System.out.println("afterMethod annotation");
	}
	
}
