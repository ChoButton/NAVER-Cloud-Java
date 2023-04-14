package day05;

import java.util.Scanner;

public class BreakQuiz1 {

	public static void main(String[] args) {

		

		// 1. 난수 2개를 발생시켜 주세요. 단, 단수는 1 ~ 10범위로 두 개 만들어 주세요.
		int A = (int)(Math.random() * 10) + 1;
		int B = (int)(Math.random() * 10) + 1;	
		System.out.println(a + "*" + b "의 답은?");	
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		
		// 2. while문을 무한루프로 만들어주시고, 위에서 발생된 난수 2개를
		//   a * b 의 답은? 이라고 질문해서 문제를 출제하게 해 주세요.
			while(true) {
				if(a+b != num) {
				System.out.println("오답입니다.");
				System.out.println("다시 정답을 입력해 주세요");
				break;
			}else()
			}
		// 3. if문으로 비교해 정답시 break로 루프문을 빠져나오고
		//    오답인경우 "오답입니다" 라는 멘트와 함께 답을 재입력 받도록 해주세요.
		
	}

}
