package increment_decrement;

public class Method_or_function {

	static public void main(String[] sfkf) {

		Method_or_function obj_new =  new Method_or_function();
		String str1 = obj_new.hello();
		int int1 = obj_new.namaskar();
		boolean bool = obj_new.validation();
		System.out.println(str1);
		System.out.println(int1);
		System.out.println(bool);
	}
	
	public String hello() {
		String str_2 = "hello";
		
		return str_2;
	}
	public int namaskar() {
		int p = 798465;
		return p;
	}
	private boolean validation() {
		boolean b1 = 12>20;
		return b1;
	}
	
}

