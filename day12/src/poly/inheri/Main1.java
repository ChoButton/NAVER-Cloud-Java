package poly.inheri;

public class Main1 {

	public static void main(String[] args) {
		Warrior w1 = new Warrior("전사1");
		Monster ra = new Rabbit();
		Monster rat = new Rat();
		
		w1.showStatus();
		w1.hunt(ra);
		w1.hunt(ra);
		w1.hunt(ra);
		w1.hunt(ra);
		w1.hunt(ra);
		w1.showStatus();
		w1.hunt(rat);
		w1.hunt(rat);
		w1.hunt(rat);
		w1.showStatus();
		
	}

}
