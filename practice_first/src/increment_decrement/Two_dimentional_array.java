package increment_decrement;

public class Two_dimentional_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i [] [] = { 
					{6,9,5,7,4,6}, 
					{3,6,6,8,7},
					{8,9,9,4,8,7,5}
					};
		System.out.println("the number of rows are :"+ i.length);
		System.out.println("the number of column are: "+ i[1].length);
	
		for (int j = 0; j<i.length;j++) {
			System.out.println(""); 
			
			for(int k=0;k<i[j].length;k++) {
				System.out.print(i[j][k]+" ");
			}
					
		}
	System.out.println("");
	
	String str[][]= new String[3][4];
	str[0][0] = "Java";
	str[0][1] = "Hello";
	str[0][2] = "Namaste";
	str[0][3] = "dofsddo";
	str[1][0] = "lolo";
	str[1][1] = "koko";
	str[1][2] = "Jojo";
	str[1][3] = "45dofsddo";
	str[2][0] = "hoho";
	str[2][1] = "dodo";
	str[2][2] = "dokodo";
	str[2][3] = "pldofsddo";
	
	System.out.println("the number of rows in string array: "+str.length);
	System.out.println("the number of colomn in string array is: "+ str[1].length);
	
	int rows = str.length;
	int cols = str[0].length;
	
	for (int a = 0; a < rows; a++) {
		System.out.println("");
		for(int b = 0; b < cols; b++) {
			System.out.print(str[a][b]+"   ");
		}
	}
	}

}
