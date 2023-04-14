package poly.inheri;

public class MainClass1 {

	public static void main(String[] args) {
		Warrior w1 = new Warrior("전사");
		Monster ra = new Rabbit();
		Monster rat = new Rat();
		
		w1.showStatus();
		w1.hunt(ra);
		w1.hunt(ra);
		w1.hunt(ra);
		w1.hunt(ra);
		w1.showStatus();
		w1.hunt(rat);
		w1.hunt(rat);
		w1.hunt(rat);
		w1.hunt(rat);
		w1.hunt(rat);
		w1.hunt(rat);
		w1.showStatus();
	}

}
