package 문자자료형;

public class 문자열내장메서드 {

	public static void main(String[] args) {
		String a = "hello";
		String b = "java";
		String c = "hello";
		String d = "hello java";
		String e = "A:B:C:D";
		System.out.println(a.equals(b));
		System.out.println(a.equals(a));
		System.out.println(d.indexOf("java"));
		System.out.println(d.contains("java"));
		System.out.println(d.charAt(6));
		System.out.println(d.replaceAll("java", "world"));
		System.out.println(d.substring(0, 5));
		System.out.println(d.toUpperCase());
		String[] result = e.split(":");
		
		//문자열 포매팅
		//숫자를 대입시 %d, 문자를 대입시 %s 부분에 대입됨
		System.out.println(String.format("오늘은 %d 일", 21));
		System.out.println(String.format("오늘은 %s 일", "금요"));
		//변수도 대입 가능하며, 숫자를 나타내는 변수의 경우 숫자랑 똑같이 %d
		int number = 30;
		System.out.println(String.format("오늘은 %d 일", number));
		//2개 이상값 넣기
		String str = "끝";
		System.out.println(String.format("오늘은 %d일로 이번달의 %s이다", number, str));
		
		/*
		 * 문자열 포맷코드들
		 * %s = 문자열
		 * %c = 문자 1개
		 * %d = 정수
		 * %f = 부동소수
		 * %o = 8진수
		 * %x = 16진수
		 * %% = Literal%(문자 % 자체)
		 */
		
		//문자열 포매팅의 정렬과 공백
		//% s 사이의 숫자만큼 공백 생성후 우측으로 정렬
		System.out.println(String.format("%10s", "hi"));
		
		//% s 사이에 - 와 함께 숫자를 입력할 경우 대입값을 오른쪽 정렬후 10칸을 띄우라는 뜻
		System.out.println(String.format("%-10sjane", "hi"));
		
		
		
		
	}

}
