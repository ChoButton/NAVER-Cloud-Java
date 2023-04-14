package day05;

import java.util.Scanner;

public class ForStarQuiz3_1{

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		scan.close();
		 
		for(int i = 1; i <= N; i++) {
			for(int j = N-i; j >= 1; j--) {
				System.out.print(" ");
			}//내부 for문(j)
			for(int k = 1; k <= i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}// 외부 for문(i)
		
	} // 메인 닫기

} // 클래스 닫기
