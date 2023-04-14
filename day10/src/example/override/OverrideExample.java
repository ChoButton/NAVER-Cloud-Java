package example.override;

public class OverrideExample {

	public static void main(String[] args) {
		// 학생 클래스의 인스턴스를 생성해 주세요
		Programer p1 = new Programer();
		
		p1.name = "김자바";
		p1.age = 21;
		p1.programLang = "JAVA";
		p1.origin = "국비학원";
		p1.tier = "골드";
		
		p1.자기소개하기();
		p1.코딩하기();
		
		Student s1 = new Student();
		
		s1.name = "김자바";
		s1.age = 21;
		s1.major = "국문학과";
		s1.자기소개하기();
	}

}
