package day05;

import java.util.Scanner;

public class ForStarQuiz1 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("별찍기 층수를 적어주세요.");
		// 별이 점차 증가하는 가산 포문
		int num = scan.nextInt();
		//첫번째 포문은 총 층수를 계산
		//가산이기 때문에 i 는 1부터 시작(감산은 총층수 부터 시작)
		//num 값은 원하는 층수를 입력
		//해석 : i는 1이다, i가 num값보다 작거나 같을때 아래를 실행하고 1을 더한다
		//첫번째 포문은 안쪽의 포문이 실행된후 마지막의 프린트를 실행후 다시 시작된다
		for(int i = 1; i <= num; i++) {
		// 안쪽의 포문은 각 층별 별을 찍는 포문
		// 해석 : j는 0이다, j가 i보다 작을때 아래 문항을 실행하고 1을 더한다
			for(int j = 0; j < i; j++) {
				System.out.print("*");
			}//내부 for문(j)
			System.out.println();
		}// 외부 for문(i)

	} // 메인 닫기

} // 클래스 닫기
