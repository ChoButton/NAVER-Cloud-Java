package day08;

public class BasketballPlayer {
	
	public String name; //농구선수의 이름
	public int height; // 키
	public int age; // 나이
	public int salary; // 연봉
	
	public BasketballPlayer(String nam, int hei, int ag, int sala) {
		name = nam;
		height = hei;
		age = ag;
		salary = sala;
	}
	
	//showInfo를 만들어 주세요.
	//호출시 위 4가지 요소를 콘솔에 찍어줍니다.

	public void showInfo() {
		System.out.println("농구선수의 이름 : " + name);
		System.out.println("농구선수의 키 : " + height);
		System.out.println("농구선수의 나이 : " + age);
		System.out.println("농구선수의 연봉 : " + salary);
	}
	
	public void dunkShoot() {// 덩크슛하기 기능
		if(height > 190) {
			System.out.println("덩크슛 성공!");
		}else {
			System.out.println("골대에 안닿음");
		}
	}
}
