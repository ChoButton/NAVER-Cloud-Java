package day08;

public class Cat {

	
	public String name;
	public int age;
	public String race;
	public String color;
	
	public Cat(String na, int ag, String ra, String co) {
		name = na;
		age = ag;
		race = ra;
		color = co;
	}
	
	//설계 클래스 내부에 선언하는 메서드는 static을 쓰지 않습니다.
	public void showInfo() {
		System.out.println(name);
		System.out.println(age);
		System.out.println(race);
		System.out.println(color);
	}
}
