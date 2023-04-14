package day08;

public class BasketballPlayerMain {

	public static void main(String[] args) {
		// 농구선수를 둘 만들어주세요
		// 하나는 덩크슛에 성공하게, 하나는 실패하게 만들어 주세요
		
		BasketballPlayer p1 = new BasketballPlayer("조승연", 31, 191, 10000000);
		
		/*
		p1.name = "조승연";
		p1.age = 31;
		p1.height = 191;
		p1.salary = 100000000;
		*/
		
		BasketballPlayer p2 = new BasketballPlayer("홍길동", 25, 188, 80000000);
		
		/*
		p2.name = "홍길동";
		p2.age = 25;
		p2.height = 188;
		p2.salary = 80000000;
		*/
		
		p1.showInfo();
		p1.dunkShoot();
		p2.showInfo();
		p2.dunkShoot();
		
	}

}
