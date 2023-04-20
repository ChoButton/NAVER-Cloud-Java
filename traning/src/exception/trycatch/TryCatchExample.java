package exception.trycatch;

public class TryCatchExample {

	public static void main(String[] args) {
		int a = 10;
		int b = 0;
		
		try {
			System.out.println(a / b);
			System.out.println("예외 발생 안됨");
		}catch(Exception e) {
			System.out.println("예외가 발생하였습니다.");
			System.out.println("0으로 나눠서 예외가 발생했습니다.");
			
		}System.out.println("잘 마무리 됬습니다.");
		
		
	}

}
