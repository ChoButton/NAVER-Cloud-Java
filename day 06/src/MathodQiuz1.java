
/*
 * 임의로 실행문이 3줄 이상인 메서드를 만들기
 * 하나는 int를 하나 입력받는 메서드
 * 하나는 입력받는 자료가 없는 메서드
 * 하나는 string과 int를 하나씩 입력받는 메서드
 */




public class MathodQiuz1 {

	public static void B(int j, String k) {
		System.out.println(j + k);
	}
	public static void num(int i) {
		for(int n = 1; n <= i; n++) {
			for(int m = 1; m <= n; m++) {
				System.out.print("*");
			}System.out.println();
		}
	}
	public static void A() {
		System.out.println("감사합니다.");
	}
	public static void main(String[] args) {
	  B(5, "층 별탑입니다.");
	  num(5);
	  A();
	}
}
