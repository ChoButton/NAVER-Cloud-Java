package poly.inheri;

public class MainClass2 {

	public static void main(String[] args) {
		Magician m1 = new Magician("마법사");
		Monster ra = new Rabbit();
		Monster rat = new Rat();
		
		m1.basicAttack(rat);
		m1.basicAttack(ra);
		
	}

}
