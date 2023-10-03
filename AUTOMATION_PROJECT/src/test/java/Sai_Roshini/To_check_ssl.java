package Sai_Roshini;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class To_check_ssl{
	
	public static void main(String[] args) throws InterruptedException {

		//Create instance of ChromeOptions Class
		ChromeOptions handlingSSL = new ChromeOptions();

		//Using the accept insecure cert method with true as parameter to accept the untrusted certificate
		handlingSSL.setAcceptInsecureCerts(true);

		//Creating instance of Chrome driver by passing reference of ChromeOptions object
		WebDriver driver = new ChromeDriver(handlingSSL);

		//Launching the URL
		driver.get("https://164.52.221.222/erp/security/Login");
		
		Thread.sleep(9200);
		System.out.println("The page title is : " +driver.getTitle());
		driver.quit();
		}
}

