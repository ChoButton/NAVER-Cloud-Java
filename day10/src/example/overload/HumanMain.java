package example.overload;

public class HumanMain {

	public static void main(String[] args) {
		// Human을 생성하시되
		// 하나는 void생성자를 이용해주시고
		
		// 다른 하나는 (String, int) 생성자를 이용해 주세요
		Human h1 = new Human();
		
		Human h2 = new Human("조승연", 31);
		
		System.out.println(h1.name);
		System.out.println(h1.age);
		System.out.println(h2.name);
		System.out.println(h2.age);
		
	}

}
