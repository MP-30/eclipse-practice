package practice;

public class For_each {
	
	public static void main (String...strings ) {
		
		char viowels[] = {'a','e','i','o','u'};
		for(char item : viowels) {
			System.out.print(item+" ");
		}
	
		int numbers[] = {1,2,3,4,5,6,7,8,9};
		int sum =0;
		System.out.println();
		for (int items: numbers) {
			
			sum = sum+items;
			
			
		}System.out.println(sum);
		
	}
	
}
