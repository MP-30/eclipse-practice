package practice;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Orange {

	public static  WebDriver driver ;
	
//	private String getDateTime() {
//        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
//        Date date = new Date();
//        return dateFormat.format(date);
//    }
		public static void main (String[] args) throws InterruptedException {
			
			WebDriverManager.chromedriver().setup();
			
			driver = new ChromeDriver();
			
			driver.manage().window().maximize();
			
			driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
			
			Thread.sleep(2000);
			
			WebElement usr =  driver.findElement(By.xpath("//p[@class='oxd-text oxd-text--p'][1]"));
			
			String usr_1 = usr.getText();
			String usr_id = usr_1.substring(11);
			
			System.out.println(usr_id);
			
			WebElement pass =  driver.findElement(By.xpath("//p[@class='oxd-text oxd-text--p'][2]"));
			
			String pass_1 = pass.getText();
			String password = pass_1.substring(11);
			System.out.println(password);
			
			WebElement username = driver.findElement(By.xpath("//input[@name='username']"));
			username.sendKeys(usr_id);
			
			WebElement Password = driver.findElement(By.xpath("//input[@name='password']"));
			Password.sendKeys(password);
		
			WebElement login = driver.findElement(By.cssSelector("button[type='submit']"));
			login.click();
		
			System.out.println(new SimpleDateFormat("dd-MM-YYYY").format(new Date()));
			java.util.Date date=new java.util.Date();  
			String date_1 = date.toString();
			System.out.println(date_1);
			String day = date_1.substring(0, 3);
			
			String Month = date_1.substring(4, 8);
			
			String Year = date_1.substring(24,28);
			
			String Date = date_1.substring(8,11);
			
			String Hr = date_1.substring(11,13);
			
			String Min = date_1.substring(14,16);
			
			String Sec = date_1.substring(17,19);
			
			int sec_1 = Integer.parseInt(Sec);
			
			int sec_2 = sec_1 -5;
						
			System.out.println("Year: "+ Year);
			
			System.out.println("Month: "+Month);
		
			System.out.println("Day: "+day);
			
			System.out.println("Hr: " +Hr);
			
			System.out.println("Min: " + Min);
									
			System.out.println("Date: "+Date);
			
			System.out.println("Sec: "+Sec);

			System.out.println("Sec-6: " +sec_2);
		}
		}

