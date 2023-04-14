package day03;

public class IfQuiz {

	public static void main(String[] args) {
		/*
		 * 정수를 입력했을때 음수라면 "음수입니다", 양수라면 "양수입니다."
		 * 0이라면 "0입니다" 라고 출력하는 구문을 만들어 주세요.
		 * 단, 양수인 경우는 짝수와 홀수를 구분해서
		 * 짝수라면 "짝수 양수입니다", 홀수라면 "홀수 양수입니다"
		 * 라고 출력되도록 구분해주세요(힌트 : 나머지 연산자를 사용해 구별할수 있습니다.)
		 */
		
		// 1안
		
		int number = 45;
		/*
		if(number < 0) {
			System.out.println("음수입니다.");
		}else if(number == 0) {
			System.out.println("0입니다.");
		}else if(number > 0 && (number % 2 == 0)) {
			System.out.println("짝수 양수입니다.");
		}else if(number > 0 && (number % 2 != 0))
			System.out.println("홀수 양수입니다.");
		*/

		// 2안
		if(number < 0) {
			System.out.println("음수 입니다.");
		}else if(number == 0) {
			System.out.println("0입니다.");
		}else {
			if(number % 2 == 0) {
				System.out.println("짝수 양수입니다.");
			}else if(number % 2 != 0) {
				System.out.println("홀수 양수입니다.");
			}
		}
		
 }
}