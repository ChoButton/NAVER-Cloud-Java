package day03;

public class SwichExample2 {

	public static void main(String[] args) {
		// 앞서 배운 배열과 연동해서 코드를 작성해보겠습니다.
		
		String[] foods = {"돈까스", "바싹불고기", "치킨", "맥주", "초밥"};
		
		// 0 ~ 4범위 정수 난수를 얻도록 해 주세요
		int idx = (int)(Math.random() * 5);
		
		switch(foods[idx]) {
			case "돈까스":
				System.out.println("경양식 입니다.");
				break;
			case "바싹불고기":
				System.out.println("일식 입니다.");
				break;
			case "맥주":
				System.out.println("주류 입니다.");
				break;
			default:
				System.out.println("기타 요리입니다.");
			
		}
	}

}
