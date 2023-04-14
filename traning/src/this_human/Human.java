package this_human;

public class Human {
	public String name;
	public int age;
	
	public Human(String name, int age) {
		this.name = name;
		this.age = age;
	}	
	public Human(String name) {
		this(name, -1);
		}
	public Human(int age) {
		this("이름없음", age);
	}
	
	public void showInfo() {
		System.out.println("이름은 " + name + " 나이는 " + age);
	}
	
}
