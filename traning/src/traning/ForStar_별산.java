package traning;

import java.util.Scanner;

public class ForStar_별산 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		scan.close();
		
		for(int i = 1; i <= N; i++) {
			for(int j = N-1; j >= i; j--) {
				System.out.print(" ");
			}
			for(int k = 1; k <= i; k++) {
				System.out.print("*");
			}
			for(int a = 1; a <= i-1; a++) {
				System.out.print("*");
			}System.out.println();
		}
	}
}