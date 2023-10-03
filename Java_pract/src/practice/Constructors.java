package practice;

public class Constructors {
	
	String Browser;
	int S1No;
	
	public Constructors(String Browser, int S1No) {
		this.Browser = Browser;
		this.S1No = S1No;
	}
	
	public static void main(String...strings ) {
		
		Constructors obj0 = new Constructors("Chrome", 56);
		Constructors obj1 = new Constructors("Chrome1", 561);
		Constructors obj2 = new Constructors("Chrome2", 562);

		
		System.out.println(obj0.Browser+" "+obj0.S1No);
		System.out.println(obj1.Browser+" "+ obj1.S1No);
		
		System.out.println(obj2.Browser+" "+obj2.S1No);
	}
}
