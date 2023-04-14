package example.overload;

public class CatMain {

	public static void main(String[] args) {

		Cat c1 = new Cat();
		System.out.println(c1.name);
		System.out.println(c1.race);
		c1.call();
		System.out.println("------------------");
		Cat c2 = new Cat("코숏");
		System.out.println(c2.name);
		System.out.println(c2.race);
		c2.call("냥냥이");
		System.out.println("------------------");
		


		
		
	}

}
