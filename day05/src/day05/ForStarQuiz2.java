package day05;

import java.util.Scanner;

public class ForStarQuiz2{

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		scan.close();
		
		for(int i = N; i >= 1; i--) {
			for(int j = 0; j < i; j++) {
				System.out.print("*");
			}//내부 for문(j)
			System.out.println();
		}// 외부 for문(i)

	} // 메인 닫기

} // 클래스 닫기
