package java_Oops;

class Calculator{
	int z ;
	public int add(int x, int y)
	{
		System.out.println("in add");
		
		return z = x + y ;
	}
	public int add(double x , int y) {
		System.out.println("In double");
		
		return (int) (x+y);
	}
}

public class Class {

	public static void main(String...strings ) {
		Calculator calc = new Calculator();
		
		int result = calc.add(8,9);
		
		System.out.println(calc.add(8, 6));
	}
}
 