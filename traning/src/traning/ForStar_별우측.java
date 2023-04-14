package traning;

import java.util.Scanner;

public class ForStar_별우측 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		scan.close();
		
		for(int i = 1; i <= n; i++) {
			for(int j = i; j >= 1; j--) {
				System.out.print("0");
			}
			for(int k = 1; k <= i; k++) {
				System.out.print("*");
			}
			System.out.println();	
		}
		
		
		
	}

}
