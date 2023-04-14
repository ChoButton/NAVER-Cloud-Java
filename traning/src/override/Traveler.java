package override;

public class Traveler extends Human {
	public String nationality;
	
	@Override
	public void 자기소개() {
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
		System.out.println("국적 : " + nationality);
	}
	
}
