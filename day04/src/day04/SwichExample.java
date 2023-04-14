package day04;

import java.util.Scanner;

public class SwichExample {

	public static void main(String[] args) {
		/*
		 * 직급을 입력하세요
		 * [사원, 대리, 과장, 부장] -> 200만원, 300만원, 400만원, 500만원, 600만원
		 * >
		 * 대리의 급여는 300만원 입니다.
		 * or
		 * 사워은(는) 없는 직급 입니다.
		 * 직급을 다시 입력해 주세요
		 */
		// 스캐너를 생성해서 직급을 입력받을수 있게 해주세요
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("직급을 입력하세요");
		System.out.println("[사원, 대리, 과장, 차장, 부장]");
		String rank = scan.next();
		switch(rank) {
			case "부장" :
				System.out.println("월급은 600만원 입니다,");
				break;
			case "차장" :
				System.out.println("월급은 500만원 입니다.");
				break;
			case "과장" :
				System.out.println("월급은 400만원 입니다.");
				break;
			case "대리" :
				System.out.println("월급은 300만원 입니다.");
				break;
			case "사원" :
				System.out.println("월급은 200만원 입니다.");
				break;
			default:
				System.out.println(rank + "은(는) 없는 직급입니다.");
				System.out.println("직급을 다시 입력해 주십시오");
		}//swich ~ case문 닫는 부분 (이렇게 하면 중괄호가 많을때 가독성에 도움됨)

	} // main method 닫는 부분

} // 클래스 닫는부분
