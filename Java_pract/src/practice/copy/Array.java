package practice.copy;

public class Array {

	public static void main(String [] args) {
		
		int h[] = {5,8,6,9,7,4,2};
		
		int i[][]= {{5,6,8},
				{0,8,7},
				{6,8,9},
				{6,8,1,},
				{2,4,8}
				};
		System.out.println("the number of rows are:" + i.length);
		System.out.println("the number of coloums are:"+ i[0].length);
		
		for(int j=0; j<i.length;j++) {
			for(int k = 0; k<i[j].length;k++) {
				
				System.out.print(i[j][k]+" ");
			}
			System.out.println(" ");
		}
		
		String str[][]= new String[3][4];
		str[0][0] = "Java";
		str[0][1] = "Java1";
		str[0][2] = "Java2";
		str[0][3] = "Java3";
		str[1][0] = "Python";
		str[1][1] = "Python1";
		str[1][2] = "Python2";
		str[1][3] = "Python3";
		str[2][0] = "Ruby";
		str[2][1] = "Ruby1";
		str[2][2] = "Ruby2";
		str[2][3] = "Ruby3";
		
		for(int a=0;a<str.length;a++) {
			for(int b=0; b<str[a].length;b++) {
				System.out.print(str[a][b]+" ");
			}
			System.out.println(" ");
		}
		
	}
}
