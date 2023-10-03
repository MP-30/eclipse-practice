package practice.copy;

public class Object_array {
	
	static public void main(String... fsjbki) {
		
		 Object ob[] = {123, "dnfjk", 23.36, "kdh", true};
		 
		 Object obj[][] = new Object[3][4];
		 
		 obj[0][0] = "Aditya0";
		 obj[0][1] = "Aditya1";
		 obj[0][2] = "Aditya2";
		 obj[0][3] = "Aditya3";
		 
		 obj[1][0] = "Rohit0";
		 obj[1][1] = "Rohit1";
		 obj[1][2] = "Rohit2";
		 obj[1][3] = "Rohit3";
		 
		 obj[2][0] = "Vivek0";
		 obj[2][1] = "Vivek1";
		 obj[2][2] = "Vivek2";
		 obj[2][3] = "Vivek3";
		 
		 for(int i=0;i<obj.length; i++) {
			 
			 for(int j = 0; j<obj[i].length; j++) {
				 System.out.print(obj[i][j]+ ", ");
			 }
			 
			 System.out.println(" ");
		 }
		 
	}

}
