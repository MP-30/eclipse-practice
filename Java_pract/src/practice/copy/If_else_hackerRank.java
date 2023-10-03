package practice.copy;

public class If_else_hackerRank {

	public static void main(String...strings ) {
		int N =24;
		
		if (2 <= N  & N <= 5 & N % 2 == 0) {
			
			System.out.println("Not Weird");
			
		}	
		else if (6 <= N  & N <= 20 & N % 2 ==0) {
			System.out.println("Weird");
			
		}
		else if (20 < N & N % 2 ==0) {
			System.out.println("Not Weird");
			
		}
		else if(N % 2 != 0) {
			System.out.println("Weird");
		}
		
	}
	}
