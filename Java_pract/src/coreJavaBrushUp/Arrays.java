package coreJavaBrushUp;

public class Arrays {

	public static void main(String...strings) {
		 String[] Ar = new String[9];
		 Ar[0] = "8";
		 Ar[1] = "2.p";
		 Ar[2] = "8.52";
		 Ar[3] = "HKJ";
		 Ar[4] = "GBH6";
		 Ar[5] = "";
		 Ar[6] = "sd";
		 Ar[7]= "89j";
		 
		 Ar[8] = "sgg";
		 String[] name = {"sfds","aswe","tryt","jhk"};
		 
		 for(int i=0; i<=Ar.length-1; i++) {
			 System.out.println(Ar[i]);
		 }
		 System.out.println("");
		 for(String s: name) {
			 System.out.println(s);
		 }
		 
		 }
	}
