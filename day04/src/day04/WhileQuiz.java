package day04;

import java.util.Scanner;

public class WhileQuiz {

	public static void main(String[] args) {
		// 컴퓨터랑 스무고개 수 맞추기를 해보겠습니다.
		
		// 이 프로그램은 먼저 Math.random()을 이용해서 수를 하나 얻습니다.
		int comValue = (int)(Math.random() * 101); // 0 ~ 100 숫자 하나 선택됨
		
		//스캐너 생성
		Scanner scan = new Scanner(System.in);
		
		System.out.println("0 ~ 100 사이의 숫자를 입력해주세요.");
		//사용자에게 숫자를 입력받게 해 주세요
		int userValue = scan.nextInt();
		
		// 컴퓨터의 값과 유저의 값이 일치해야만 종료하므로, 불일치시엔 계속 진행하도록 처리
		while(comValue != userValue) {
			//불일치라면 먼저 업인지, 다운인지 알려주기
			if(comValue < userValue) {
				System.out.println("다운");
			}else {
				System.out.println("업");				
			}
			// 사용자한테 userValue를 다시 입력받기
			System.out.println("다시 입력해 주세요");
		userValue = scan.nextInt();
		}//와일 종료
		System.out.println("정답입니다.");

		/*
		 * 위 사항에 대한 개선과제
		 * 1. 0~100인 범위를 0~사용자가 입력한 값으로 설정할수 있게 코드를 고쳐주세요 (매쉬 랜덤 코드 * 뒤를 스캔으로)
		 * 2. 위에 적인 범위를 벗어나는 숫자가 들어오면 다시 입력받게 해주세요
		 * 3. 몇 번 시도끝에 맞췄는지 정답 확인시 알려주도록 해주세요.
		 */
		
	}

}
