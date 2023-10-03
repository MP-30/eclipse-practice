package class_wise_saiRoshini;

import java.time.Duration;

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

import io.github.bonigarcia.wdm.WebDriverManager;

public class Delete_bank {
	

public void delete_process_bank() throws InterruptedException {
		
		

		WebDriverManager.chromedriver().setup();
		
		
		
		ChromeOptions handlingSSL = new ChromeOptions();

		//Using the accept insecure cert method with true as parameter to accept the untrusted certificate
		handlingSSL.setAcceptInsecureCerts(true);

		//Creating instance of Chrome driver by passing reference of ChromeOptions object
		WebDriver driver = new ChromeDriver(handlingSSL);
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		Actions action = new Actions(driver);
		
		driver.manage().window().maximize();
		
//		WebDriverWait wait = new WebDriverWait(driver, 20);

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		driver.get("https://164.52.221.222/erp/security/Login");

//         Thread.sleep(3000);

		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

// 		Login page
		
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
		
//		Search button
		Thread.sleep(5000);
		
		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.id("isc_C"))));
		
		
		WebElement search = driver.findElement(By.id("isc_C"));
		
		search.click();

					
//		--------Search Client Master in search--------
		WebElement search_text = driver.findElement(By.xpath("//input[@name='value']"));
		
		wait.until(ExpectedConditions.elementToBeClickable(search_text));
		
		search_text.sendKeys("Client Master");
		
		Thread.sleep(1500);
		
		search_text.sendKeys(Keys.ENTER);

//		------Search adhar number in adhar search box-------
		wait.until(ExpectedConditions.elementToBeClickable(By.name("aadhaarnumber")));
		
		WebElement adhar_search_text = driver.findElement(By.name("aadhaarnumber"));		
		
		adhar_search_text.sendKeys("330645218154");
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
		
//		select bank
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("(//div[@eventproxy='isc_OBTabBarButtonChild_1'])[1]")).click();
		Thread.sleep(2000);
		System.out.println("bank selected");
		

		
		
//		delete button
		try {
				boolean delete = driver.findElement(By.xpath("(//td[@class='OBToolbarIconButton_icon_eliminate OBToolbarIconButton'])[2]")).isDisplayed();
					if(delete == true) {
						System.out.println("bank child clicked");
						driver.findElement(By.xpath("(//td[@class='OBToolbarIconButton_icon_eliminate OBToolbarIconButton'])[2]")).click();
					}
					else {
						System.out.println("bank child not clicked");
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
//		delete location---1 
	
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


//		Pre-enq delete process
		
//		Search button
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
		
//		clear filter

		Thread.sleep(4000);
		boolean element_1 = driver.findElement(By.xpath("//span[normalize-space()='Clear Filter(s)']")).isDisplayed();
		if(element_1 == true) {
			System.out.println("visible clear filter ");
			driver.findElement(By.xpath("//span[normalize-space()='Clear Filter(s)']")).click();	
		}
		else {
			System.out.println("not visible clear filter");
		}
//		Search aadhar number
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name='prooftypenumber']")).sendKeys("598149064414");
		System.out.println("Searching for aadhar card");

		
//		checkbox
//		I want to do refresh so that i select automaticlly
		Thread.sleep(2000);
//		Refresh button
		driver.findElement(By.xpath("//body[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[56]/table[1]/tbody[1]/tr[1]/td[1]")).click();
		System.out.println("refresh");
//		delete 
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
		
		
								
//		boolean checkbox = driver.findElement(By.xpath("(//span[@eventpart='valueicon'])[1]")).isDisplayed();
//		
//		if(checkbox == true) {
//			System.out.println("Visible check box");
//		 WebElement checkWalaBox = 	driver.findElement(By.xpath("(//td)[84]"));
//		       
//		 checkWalaBox.click();
//		}
//		else {
//			System.out.println("NOt visible checkbox");
//		}
//		
		
		//using click action method
		
		//		Checkbox
//		driver.findElement(By.xpath("//input[@name='prooftypenumber']")).sendKeys("598149064414");
//		
//		driver.findElement(By.cssSelector("div[role='label'][eventproxy='isc_Number_4']")).click();
//

//		client master process again 
		
***/
		
		Thread.sleep(2000);
		driver.quit();
}
	
}


