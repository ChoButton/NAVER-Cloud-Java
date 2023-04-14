package this_.cat;

public class Cat {
	private String name;
	private int age;
	private int fat;
	private String race;
	
	public Cat(String name, int age, int fat, String race) {
		this.name = name;
		this.age = age;
		this.fat = fat;
		this.race = race;
	}
	
	public void showInfo(){
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
		System.out.println("무게 : " + fat);
		System.out.println("품종 : " + race);
		
	}
	
}

