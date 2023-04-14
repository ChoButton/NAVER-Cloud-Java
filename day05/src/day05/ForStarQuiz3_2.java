package day05;

public class ForStarQuiz3_2 {

	public static void main(String[] args) {
		//if문으로 3_1 작성하기
		for(int i = 1; i <= 5; i++) {
			for(int j = 1; j <= 5; j++) {
				if(i < 5-j)
					System.out.println(" ");
			}
		}
	}

}
