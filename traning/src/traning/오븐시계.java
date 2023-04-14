package traning;

import java.util.Scanner;

public class 오븐시계 {

	public static void main(String[] args) {
		//A = 시, B = 분, C = 조리시간
		//출력시 A B 로 출력되는데
		//B + C 의 결과값이 60을 넘어가면 A 에 1을 추가후 넘어간 값에서 60을 뺀 나머지 가 출력된다
		Scanner scan = new Scanner(System.in);
		int A = scan.nextInt();
		int B = scan.nextInt();
		int C = scan.nextInt();
		
		if(B + C >= 60) {
			A += (B + C) / 60;
			B = (B + C) % 60;
		}else {
			B = B + C;
		}
		if(A >= 24) {
			A = A - 24;
		}
			
	System.out.println(A + " " + B);		
	}

	

}
