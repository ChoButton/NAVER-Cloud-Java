package example.overload;

public class Cat {
	
	public String name;
	public String race;
	
	public Cat() { // void생성자 : 파라미터에 입력된 자료가 없는경우
		name = "이름이 없습니다.";
		race = "품종은 코리안 숏테일 입니다.";
	}
	public Cat(String n) {
		name = n;
		race = "품종은 코리안 숏테일 입니다.";
		System.out.println("지금부터 이 아이의 이름은 " + n + "입니다.");
	}
	public void call() {
		System.out.println("야옹아 이리와");
	}
	public void call(String n) {
		System.out.println(n + "아 이리와");
	}
	
}

