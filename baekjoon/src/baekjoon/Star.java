package baekjoon;

import java.util.Scanner;

public class Star {

	public static void main(String[] args) {
		//  초기값    조건식   증감값
     	for(int i = 1; i < 6; i++) {
     		for(int j = 0; j < i; j++) {
     			System.out.print("*");
     		}
     		System.out.println(); //sum에 0, 1, 2, 3, 4를 순차적으로 누적해 더함
	}//포 닫기
	
		
	}//메인 닫기

}//클래스 닫기
