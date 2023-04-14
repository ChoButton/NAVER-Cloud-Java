package inheri;

public class Main {

	public static void main(String[] args) {
		Warrior w1 = new Warrior("전사1");
		Monster rab = new Rabbit();
		Monster ra = new Rat();
		Monster ok = new Oke();
		
		w1.showInfo();
		w1.attackMonster(ra);
		w1.showInfo();
		w1.attackMonster(ra);
		w1.attackMonster(ra);
		w1.attackMonster(rab);
		w1.attackMonster(rab);
		w1.showInfo();
		w1.attackMonster(ok);
		w1.attackMonster(ok);
		w1.attackMonster(ok);
		w1.attackMonster(ok);
		w1.attackMonster(ok);
		w1.attackMonster(ok);
		w1.attackMonster(ok);
		w1.attackMonster(ok);
		w1.attackMonster(ok);
		w1.attackMonster(ok);
		w1.attackMonster(ok);
		w1.attackMonster(ok);
		w1.attackMonster(ok);
		w1.showInfo();
	}

}
