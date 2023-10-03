package interface_understanting;

public class Execution {

	public static void main (String...strings ) {
		//Can we make object of an interface?? Answer is No
		
//		Automobile automobile = new Automobile();  - you can not create Object of an interface
	
		Hyundai hyundai = new Hyundai();
		
		hyundai.horn();
		hyundai.steering();
		hyundai.infotainment();
		hyundai.cruisecontrol();
		hyundai.brakes();
	
		hyundai.sunroof();//should not call a static method via object reference(not a good practice)
		Hyundai.sunroof();// This is better ways to call static method
		
		Automobile automobile = new Hyundai(); //Interface object reference is refering class reference
//		WebDriver driver = new ChromeDriver(); 
		
		automobile.steering();
		automobile.horn();
		automobile.brakes();
		automobile.cruisecontrol();
		automobile.infotainment();
		
		Automobile.sunroof();
		System.out.println(Automobile.i);
		System.out.println(Automobile.name);
	}
}
