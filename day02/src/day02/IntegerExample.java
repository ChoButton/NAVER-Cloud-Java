package day02;

public class IntegerExample {

	public static void main(String[] args) {
		
		int maxInt = 2147483647;
		// 011111111 11111111 11111111 11111111
		// 000000000 00000000 00000000 00001010
		
		System.out.println(maxInt + 1);
		
		int minInt = -2147483648;
		
		System.out.println(minInt - 1);
		
	}

}
