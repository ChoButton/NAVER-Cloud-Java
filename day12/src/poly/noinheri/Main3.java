package poly.noinheri;

public class Main3 {

	public static void main(String[] args) {
		Rat r1 = new Rat();
		Rat r2 = new Rat();
		
		Warrior w1 = new Warrior("전사1");
		w1.showStatus();
		System.out.println("---------------");
		w1.huntRat(r2);
		System.out.println("---------------");
		w1.showStatus();
		System.out.println("---------------");
		w1.huntRat(r2);
		System.out.println("---------------");
		w1.showStatus();
		System.out.println("---------------");
		w1.huntRat(r2);
		System.out.println("---------------");
		w1.showStatus();
		System.out.println("---------------");
	}

}
