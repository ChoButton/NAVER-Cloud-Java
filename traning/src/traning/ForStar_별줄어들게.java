package traning;

import java.util.Scanner;

public class ForStar_별줄어들게 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		scan.close();
					
		for(int i = 1; i <= N; i++) {
			for(int j = 1; j <= N; j++) {
				if(i < j+1) {
					System.out.print("*");  
				}else {						
					System.out.print(" ");
				}
			}// forj
			System.out.println();
			}//for k
		}//for i
	}

