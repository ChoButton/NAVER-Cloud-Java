package overload;

public class HumanMain {

	public static void main(String[] args) {
		Human h1 = new Human();
		System.out.println(h1.age);
		System.out.println(h1.name);
		System.out.println(h1.phon);
		
		Human h2 = new Human("조승연", 31, 95631281);
		System.out.println(h2.age);
		System.out.println(h2.name);
		System.out.println(h2.phon);
		
		Human h3 = new Human(20, 12345678);
		System.out.println(h3.age);
		System.out.println(h3.name);
		System.out.println(h3.phon);
		
		Human h4 = new Human("홍길동", 40);
		System.out.println(h4.age);
		System.out.println(h4.name);
		System.out.println(h4.phon);
	}

}
