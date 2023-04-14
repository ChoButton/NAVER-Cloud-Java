package poly.noinheri;

public class Main2 {

	public static void main(String[] args) {
		// rabbit 인스턴스 2개, warrior 인스턴스 1개를 생성해주세요.
		Rabbit r1 = new Rabbit();
		Rabbit r2 = new Rabbit();
		
		Warrior w1 = new Warrior("전사1");
		w1.showStatus();
		System.out.println("---------------");
		w1.huntRabbit(r2);
		System.out.println("---------------");
		w1.showStatus();
		System.out.println("---------------");
		
	}

}
