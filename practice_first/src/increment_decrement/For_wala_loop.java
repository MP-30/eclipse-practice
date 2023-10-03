package increment_decrement;

public class For_wala_loop {

	public static void main(String[] args) {
		
		for(int i = 1; i<=5;i++) {
			System.out.println();
			
			for(int j = 1; j <=i; j++) {
				System.out.print("1 ");
			}	
		}
		int down = 5;
		for (int k=1; k<=down; k++) {
			System.out.println();
			for (int l =down;l>k;l-- ) {
				System.out.print("1 ");
			}
		}
	}
}
