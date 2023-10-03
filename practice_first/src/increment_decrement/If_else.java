package increment_decrement;

public class If_else {

	public static void main( String [] args) {
		
		int a =90;
		int b = 70;
		int c = 40;
		
		if(a<b&b<c) {
			System.out.println("a is the smallest"+ a);
		}
		else if (b<a & b<c ) {
			System.out.println("b is smallest"+ b);
			
		}
		else {
			System.out.println("c is smallest"+ c);
		}
	}
}
 