package day04;

import java.util.Scanner;

public class WhileQuiz2 {

	public static void main(String[] args) {
		// 컴퓨터랑 스무고개 수 맞추기를 해보겠습니다.
		int count = -1;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("최대 범위가 될 숫자를 입력해주세요");
		int maxValue = scan.nextInt() + 1;

		int comValue = (int)(Math.random() * maxValue); // 0 ~ maxValue -1 숫자 하나 선택됨
		
		
		
		System.out.println("0 ~ "+ (maxValue-1) +" 사이의 숫자를 입력해주세요.");
		//사용자에게 숫자를 입력받게 해 주세요
		//자바에서는 연속해서 변수를 선언하는것이 불가능하므로
		//반복문 바깥에서 선언해주고, 반복문 내부에서는 선언된 변수 값을 바꿔넣기만 한다.
		int userValue = -1;
		
		do {
			userValue = scan.nextInt();
		}while(userValue > (maxValue - 1)||userValue < 0);
		
		// 컴퓨터의 값과 유저의 값이 일치해야만 종료하므로, 불일치시엔 계속 진행하도록 처리
		while(comValue != userValue) {
			//불일치라면 먼저 업인지, 다운인지 알려주기
			//comValue와 userValue의 비교를 통해 업/다운을 판단할수 있다.
			if(comValue < userValue) {
				System.out.println("다운");
			}else {
				System.out.println("업");				
			}
			System.out.println("다시 입력해 주세요");
			do {
				userValue = scan.nextInt();
			}while(userValue > (maxValue - 1) || userValue < 0);
		}//와일 종료
		System.out.println("정답입니다.");
		System.out.println("시도 횟수 : " + count);

		/*
		 * 위 사항에 대한 개선과제
		 * 1. 0~100인 범위를 0~사용자가 입력한 값으로 설정할수 있게 코드를 고쳐주세요 (매쉬 랜덤 코드 * 뒤를 스캔으로)
		 * 2. 위에 적인 범위를 벗어나는 숫자가 들어오면 다시 입력받게 해주세요
		 * 3. 몇 번 시도끝에 맞췄는지 정답 확인시 알려주도록 해주세요.
		 */
		
	}

}
