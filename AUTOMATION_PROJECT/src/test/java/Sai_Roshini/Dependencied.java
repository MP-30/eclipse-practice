package Sai_Roshini;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dependencied {
 
	public static WebDriver driver;
	
	@BeforeTest
	public void start() {
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://mycarhelpline.com");
	
	System.out.println(driver.getCurrentUrl());
	String CurrentURL = "https://mycarhelpline.com";
	}
	
	@Test(priority = 2, enabled = true)
	public void test(){
		System.out.println(driver.getCurrentUrl());
		String CurrentURL = "https://mycarhelpline.com";
		
		if(CurrentURL.equals("https://mycarhelpline.com")) {
			System.out.println("Test Case Landing Page is PASS");
			
		}
		else {
			System.out.println("Test Case Landing Page is FAIL");
		}
		
		
		}
	@Test(priority = 1, enabled = true, dependsOnMethods = "test")
	public void helli(){
		System.out.println("Start");
	}
	
	@Test(priority = 3, enabled = true, dependsOnMethods = {"test","helli"})
	public void hello(){
		System.out.println("End");
	}
	@AfterTest(enabled = true)
	public void logout() {
		driver.quit();
	}
}
