package switch_;

import java.util.Scanner;

public class Switch_case {
	public static void main(String...strings ) {
		
		System.out.println("Please enter a number of day: ");
		try (Scanner src = new Scanner(System.in)) {
			int n = src.nextInt();
			
			switch(n) {
			case 1:
				System.out.println("Sunday");
				break;
			case 2:
				System.out.println("Monday");
				break;
			case 3:
				System.out.println("Tuesday");
				break;
			case 4:
				System.out.println("Wednesday");
				break;
			case 5:
				System.out.println("Thrusday");
				break;
			case 6:
				System.out.println("Friday");
				break;
			case 7:
				System.out.println("Saturday");
				
					
			}
			
		}
	}
}
