package Sai_Roshini;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Data_delete_process {
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
				
		driver.manage().window().maximize();
		
		String aadhar_number = "723187613000";
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
	
//		Search button
		Thread.sleep(5000);
		
		WebElement search = driver.findElement(By.id("isc_C"));
		
		search.click();
	
//		Send data to search button
		
		Thread.sleep(2000);
		
//		Object search_value = js.executeScript("document.getElementById(isc_MR.value='Client Master')");
		
		WebElement search_text = driver.findElement(By.xpath("//input[@name='value']"));
		search_text.sendKeys("Client Master");
		Thread.sleep(2000);
		search_text.sendKeys(Keys.ENTER);
//		WebElement search_text = driver.findElement(By.xpath("//input[@name='value']").sendKeys("Client Master")); 
//		search_text.sendKeys("Client Master");
		
		WebElement adhar_search_text = driver.findElement(By.name("aadhaarnumber"));
		
		adhar_search_text.sendKeys("598149064414");
//		js.executeScript("document.getElementById(isc_AS.value='598149064414')");
		Thread.sleep(2000);
		WebElement adhar_select = driver.findElement(By.xpath("//div[@role='presentation']//span[@eventpart='valueicon']"));
		
		adhar_select.click();
	}
}
