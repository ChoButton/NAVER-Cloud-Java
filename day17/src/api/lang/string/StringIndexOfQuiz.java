package api.lang.string;

import java.util.Scanner;

public class StringIndexOfQuiz {

	public static void main(String[] args) {
		// 1. 특정 문장을 스캐너로 입력받으세요
		// 2. 1에서 입력받은 문장에서 조회할 단어를 적으세요.
		// 3. 단어가 몇 개 있는지 카운팅하고, 몇 번 인덱스에 각각 있는지
		//    콘솔에 찍어주세요.
		
		Scanner scan = new Scanner(System.in);
		System.out.println("전체 문장을 입력해 주세요");
		String a = scan.nextLine();// 문장 tomatoe
		System.out.println("찾고싶은 단어를 입력해 주세요");
		String b = scan.next();// 단어 to
		
		int count = 0; // 감지횟수
		int nextSearchIdx = 0; // 다음 조회시 시작지점으로 삼을 인덱스
		int lastSearchIdx = 0; // 조회 결과 인덱스
		boolean flag = true; // 반복 조회 실행 여부
		System.out.println(a + "에서" + b + "를 찾습니다.");
		
		while(flag) {
			// 타겟 단어를 마지막으로 감지된 번호로 조회
			lastSearchIdx = a.indexOf(b,nextSearchIdx);
			if(lastSearchIdx == -1) {//단어 조회 결과 인덱스가 -1이면
				System.out.println("단어 찾기가 종료되었습니다.");
				flag = false;//탈출 조건으로 바꿔줌
			}else {
				System.out.println("단어 감지 인덱스 : " + lastSearchIdx);
				nextSearchIdx = (lastSearchIdx + 1);//결과 인덱스 다음 번호부터 다시 조회
				count += 1;//감지된 단어 갯수 반영하기
			}
		}
		System.out.println(b + "의 개수는" + count + "개 입니다.");
		
	}

}
