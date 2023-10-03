package increment_decrement;

public class For_each {

	public static void main(String... agrs) {
		char viowels[] = {'a','e','i','o','u'};
		
		for(char item : viowels) {
			System.out.print(item+", "); 
		}
		
		int numbers[] = {10,20,30,40,50,60,70,80,90};
		int sum = 0;
		for(int items:numbers) {
			 sum = sum + items;  
			 System.out.println(sum);
		}
	}
}
