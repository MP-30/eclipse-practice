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

import com.aventstack.extentreports.Status;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Delete_enquiry {
	
	public void delete_process_enquiry() throws InterruptedException {
		
		
		
	
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
		
		search_text.sendKeys("Enquiry Form");
		
		Thread.sleep(1500);
		
		search_text.sendKeys(Keys.ENTER);

//		------Search adhar number in adhar search box-------
		wait.until(ExpectedConditions.elementToBeClickable(By.name("prooftypenumber")));
		
		WebElement adhar_search_text = driver.findElement(By.name("prooftypenumber"));		
		
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
		
			
//		delete button
		try {
				boolean delete = driver.findElement(By.xpath("(//td[@class='OBToolbarIconButton_icon_eliminate OBToolbarIconButton'])")).isDisplayed();
					if(delete == true) {
						System.out.println("bank parent clicked");
						driver.findElement(By.xpath("(//td[@class='OBToolbarIconButton_icon_eliminate OBToolbarIconButton'])")).click();
					}
					else {
						System.out.println("bank parent not clicked");
					}
			}
		catch(Exception e)
			{
			System.out.println("bank parent is not there");
			}
		Thread.sleep(2000);
						
		driver.findElement(By.xpath("//td[contains(text(),'Yes')]")).click();
		
		System.out.println("bank parent deleted");
		
		Thread.sleep(2000);
		driver.quit();
}

}
