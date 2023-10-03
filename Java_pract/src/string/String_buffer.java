package string;

public class String_buffer {

	public static void main(String...strings) {
	StringBuffer sb = new StringBuffer("Navin");
	System.out.println(sb.capacity());
	System.out.println(sb.length());
	sb.append(" Singh");
	System.out.println(sb);
	System.out.println(sb.capacity());
	String str = sb.toString();
	
	sb.deleteCharAt(2);
	System.out.println(sb);
	sb.setLength(30);
	System.out.println(sb);
}
}