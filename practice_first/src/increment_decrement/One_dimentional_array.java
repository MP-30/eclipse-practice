package increment_decrement;

public class One_dimentional_array {

	public static void main(String[] args) {
	
		String str1[] = {"hello", "world", "machine"};

		String str[] = new String[3];
		str[0]= "Tiger";
		str[1]= "Lion";
		str[2]= "Giraffe"; 
		
		System.out.println(str1.length);
		System.out.println(str.length);
		
		for (int j = 0; j<str.length; j++) {
			
			System.out.println(str[j]+" ");
		}
		
		int k[] = new int[5];
		k[0]= 1;
		k[1]=2;
		k[2]=3;
		k[3]=4;
		k[4]=5;
		System.out.println("the size of integer array"+k.length);
		
		for (int l = k.length-1;l>=0;l--) {
			System.out.println(k[l]+" ");
		}
		
	}

}
