package this_human;

public class HumanMain {

	public static void main(String[] args) {
		Human h1 = new Human("조승연", 31);
		h1.showInfo();
		
		Human h2 = new Human(30);
		h2.showInfo();
		
		Human h3 = new Human("홍길동");
		h3.showInfo();
	
	}

}
