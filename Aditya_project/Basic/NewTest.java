package Basic;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class NewTest {

	@BeforeSuite
	
	public void beforeSuite{
		System.out.println("This is before suite annotation");
	}
	
	@BeforeTest
	
	public void beforeTest{
		System.out.println("This is before test annotation");
	}
	
	@BeforeClass
	public void beforeClass{
		System.out.println("This is before class annotation");
	}
	
	@BeforeMethod
	
	public void beforeMethod{
		System.out.println("This is before method annotation");
	}
	
	@Test
	
	public void test{
		System.out.println("This is test annotation");
	}
	
	@AfterMethod
	
	public void afterMethod{
		System.out.println("This is after method annotation");
	}
	
	@AfterClass
	
	public void afterclass{
		System.out.println("This is after class annotation");
	}
	
	@AfterTest
	
	public void after test{
		System.out.println("This is after test annotation");
	}
	
	@AfterSuite
	
	public void afterSuite{
		System.out.println("This is after suite annotation");
	}
}
