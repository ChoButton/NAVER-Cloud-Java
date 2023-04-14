package example.overload;

public class Human {
	
	public String name;
	public int phonenumber;
	public int age;
	
	// 생성자 오버로딩은, 생성자를 여러 유형으로 만드는것
	// 파라미터() -> viod 파라미터
	//      (String, int)
	// 두 유형으로 만들어 보겠습니다.
	
	public Human() { //void 파라미터, 초기값이 입력된 생성자
		name = "이름을 입력하지 않았습니다.";
		age = 19;
	}
	public Human(String n, int a) { //입력 받는 생성자
		name = n;
		age = a;
	}
}

