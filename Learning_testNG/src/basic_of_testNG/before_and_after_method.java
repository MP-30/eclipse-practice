package basic_of_testNG;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class before_and_after_method {

	@BeforeMethod
	
	public void UserRegistration() {
		
		System.out.println("User is able to login");
	}
	
	@Test(priority = 1,enabled = true)
	
	public void User_login() {
		System.out.println("User is ble to login");
	}
	
	@Test(priority = 4,enabled = true)
	
	public void User_login1() {
		System.out.println("User1 is ble to login");
	}

	@Test(priority = 2,enabled = true)

	public void User_login2() {
	System.out.println("User2 is ble to login");
	}
	
	@Test(priority = 3,enabled = true)

	public void User_login3() {
	System.out.println("User3 is ble to login");
	}
	
	@AfterMethod
	
	public void User_logout() {
		System.out.println("User is able to logout");
	}
}
