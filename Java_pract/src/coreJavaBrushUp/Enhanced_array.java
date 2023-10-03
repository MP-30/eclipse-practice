package coreJavaBrushUp;

public class Enhanced_array {
	public static void main(String...strings) {
		
		int[] arr = {1,5,4,8,7,3,9,5,8,};
		
		for(int i = 0; i<arr.length;i++) {
			if(arr[i]%2 ==0 ) {
				System.out.println(arr[i]+" is even");
				break; 
			}
			else if(arr[i]%2!=0) {
				System.out.println(arr[i]+" is odd ");
			}
		}
	}

}
