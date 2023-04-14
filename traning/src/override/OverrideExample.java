package override;

public class OverrideExample {

	public static void main(String[] args) {
		
		SalaryMan s1 = new SalaryMan();
		s1.name = "조승연";
		s1.age = 31;
		s1.salary = 40000000;
		s1.post = "시스템 개발부서";
		s1.rank = "대리";
		
	    s1.자기소개();
	    
	    Traveler t1 = new Traveler();
	    t1.name = "jon";
	    t1.age = 40;
	    t1.nationality = "미국";
	    
	    t1.자기소개();
		
	}

}
