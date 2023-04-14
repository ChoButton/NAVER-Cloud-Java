package traning;

public class ForStarQuiz3_2 {

	public static void main(String[] args) {
		for(int i = 1; i <= 5; i++) {
			for(int n = 1; n <= 5; n++) {
				if(n <= 5-i) {
					System.out.print("0");
				}else {
					System.out.print("*");
				}
			}System.out.println();
		}
	}

}
