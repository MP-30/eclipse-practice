package increment_decrement;

public class while_outer_and_for_inner {
	public static void main(String[] f456) {
		int i = 1;
		while (i<=10) {
			System.out.println(i);
//			i++;
			for (int j = 1; j<=10;j++) {
				 System.out.println("i="+i+":j="+j);
			}
		}
		
	}
}
