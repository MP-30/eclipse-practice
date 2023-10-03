package java_Oops;


class Computer
{
	public void playMusic() {
		System.out.println("Music playing: ");
	}
	
	public String getMeAPen(int cost) {
		if (cost >10)
		 return "Pen";
		else
			return"Nothing";
	}
}


public class Opps_2 {
	public static void main(String[]ko) {
		Computer com = new Computer();
		com.playMusic();
		String str = com.getMeAPen(9);
		System.out.println(str);
	}

}
