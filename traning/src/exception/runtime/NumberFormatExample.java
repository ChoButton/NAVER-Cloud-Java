package exception.runtime;

public class NumberFormatExample {

	public static void main(String[] args) {
		String a = "10";
		String b = "20";
		System.out.println(a + b);
		
		int c = Integer.parseInt(a);
		int d = Integer.parseInt(b);
		System.out.println(c + d);
		
		String s = "안녕";
		System.out.println(Integer.parseInt(s));
		
	}

}
