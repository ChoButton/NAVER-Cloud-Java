package overload;

public class Human {
	public String name;
	public int age;
	public int phon;
	
	public Human() {
		name = "이름을 입력하지 않았습니다";
		age = -1;
		phon = -1;
	}
	public Human(String n, int a, int p) {
		name = n;
		age = a;
		phon = p;
	}
	public Human(String n, int a) {
		name = n;
		age = a;
		phon = -1;
	}
	public Human(int a, int p) {
		name = "이름을 입력하지 않았습니다.";
		age = a;
		phon = p;
	}
}
