package override;

public class SalaryMan extends Human {
	public int salary;
	public String post;
	public String rank;
	
	@Override
	public void 자기소개() {
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
		System.out.println("연봉 : " + salary);
		System.out.println("부서 : " + post);
		System.out.println("직급 : " + rank);
	}
	
}
