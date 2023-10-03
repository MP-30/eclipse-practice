package interface_understanting;

public class Hyundai implements Automobile { // is a relationship

	
	public static void sunroof() {
		System.out.println("Hyundai sunroof");
	}
	@Override
	public void steering() {
		System.out.println("Hyundai steering");		
	}

	@Override
	public void horn() {
		System.out.println("Hyundai horn");
		
	}

	@Override
	public void infotainment() {
		System.out.println("Hyundai infotainment");
		
	}

	@Override
	public void cruisecontrol() {
		System.out.println("Hyundai cruisecontrol");
		
	}

	@Override
	public void brakes() {
		System.out.println("Hyundai brakes");
		
	}

	
}
