package interface_understanting;

public interface Automobile {
	//interface in java is a reference type
	//interface is pure abstract methods
	//collection of abstract method
	//A class implements an interface, it inherits abstract method of the interface
	//constants, default methods, static methods, nested types
	//Abstract method does not have body but if we want body then only for default and static method we can make body
	// main method is allowed in interface
	//any variable of any datatype once declared or initialized in interface is final in nature(static)
	
	String name = "Rohit";
	int i = 10;
	
	
	public void steering();
	public void horn();
	public void infotainment();
	public void cruisecontrol();
	public void brakes();

	public static void sunroof() {
	System.out.println("Interface automobile says there is sunroof");	
	}
	
	
	public static void main(String...strings ) {
		System.out.println("This is the main method inside the interface");
	} 
}
