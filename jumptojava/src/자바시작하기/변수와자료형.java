package 자바시작하기;

public class 변수와자료형 {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("안녕");
		System.out.println(sb);
		sb.append("하세요");
		sb.append(" ");
		sb.append("제 이름은");
		sb.append(" 조승연입니다.");
		System.out.println(sb);
		
		sb.insert(0, "감사합니다.");
		System.out.println(sb);
		
		System.out.println(sb.substring(0, 5)); 
		
		String[] weeks = new String[7];
		weeks[0] = "월";
		weeks[1] = "화";
		weeks[2] = "수";
		
		
	}

}
