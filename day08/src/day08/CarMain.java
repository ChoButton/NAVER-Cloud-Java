package day08; // 생성자 함수의 활용

public class CarMain {

	public static void main(String[] args) {
		// 자동차를 한대 생성해주시고
		// 값은 연료 100, 속도0, 나머지 요소는 알아서 자율적으로 초기화
		// 엑셀 3번 밟고, 계기판 조회, 브레이크 2번 밟고 계기판 조회하는 코드를
		// 아래에 작성해주세요.
		Car c1 = new Car("sm6", 5,"조승연"); //Car라는 클래스의 생성자를 호출한것 / 생성자 : public Car()
		
		/*
		c1.modelName = "sm6";
		c1.maxPassengers = 5;
		c1.currentSpeed = 0;
		c1.gas = 100;
		c1.owner = "조승연";
		
		*/
		
		//반복문으로 작성해도 무방함
		c1.accelerat();
		c1.accelerat();
		c1.accelerat();
		
		c1.showStatus();
		System.out.println();
		
		c1.break_();
		c1.break_();
		
		c1.showStatus();
		System.out.println();
		
	}

}
