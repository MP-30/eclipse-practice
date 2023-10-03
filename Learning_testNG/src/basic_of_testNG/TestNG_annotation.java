package basic_of_testNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNG_annotation {

//	Precedence Wise Execution:
	
	@BeforeSuite
	
	public void beforeSuite() {
		System.out.println("beforeSuite annotation");
	}
	
	@BeforeTest
	public void beforeTest() {
		System.out.println("beforeTest annotation");
	}
	
	@BeforeClass
	public void beforeClass() {
		System.out.println("beforeClass annotation");
	}
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("beforeMethod annotation");
	}
	
	@Test
	public void test() {
		System.out.println("test annotation");
	}
	@Test
	
	public void registration() {
		System.out.println("test annotation");
	}
	@AfterMethod
	public void afterMethod() {
		System.out.println("afterMethod annotation");
	}
	
	@AfterClass
	public void afterClass() {
		System.out.println("afterClass annotation");
	}
	
	@AfterTest
	public void afterTest() {
		System.out.println("afterTest annotation");
	}
	
	@AfterSuite
	public void afterSuite() {
		System.out.println("afterSuite annotation");
	}
}
