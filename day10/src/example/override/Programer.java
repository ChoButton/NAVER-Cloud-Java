package example.override;

public class Programer extends Human{
		
		public String programLang;
		public String origin;
		public String tier;
		
		@Override
		public void 자기소개하기() {
			System.out.println("이름 : " + name);
			System.out.println("나이 : " + age);
			System.out.println("사용프로그램언어 : " + programLang);
			System.out.println("출신 : " + origin);
		}
		@Override
		public void 코딩하기() {
			System.out.println("코딩이 가능합니다. 코딩실력은");
			System.out.println("백준티어 : " + tier + "입니다.");
		}

}
