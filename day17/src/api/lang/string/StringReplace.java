package api.lang.string;

public class StringReplace {

	public static void main(String[] args) {
		/*
		 * 자바는 15버전 부터 멀티라인 문자열을 지원합니다.
		 * 자바 문자열은 여닫는 "를 한 줄에 작성해야 합니다.
		 * String 문자열은 "를 한 줄에 작성해야 했습니다.
		 */
		String a = "가나다라"; // 허용
		//String a = "가나다라
		//		    마바사";(허용안함)
		
		// 여닫는 따옴표를 여러 줄에 걸쳐서 작성할 때는 """세 개를 이용합니다.
		// """ 다음줄 부터 작성해야 합니다.
		String notice = """ 
				공지사항 입니다.
				1. 파이썬 공부를 하세요
				2. 파이썬은 좋다
				3. 파이썬 이외의 언어는 기본기를 익히고 관심을 주세요.
				""";
		System.out.println(notice);
		// replace()는 String을 리턴하고, 첫 단어를 두번째 단어로 바꿔줍니다.
		String newNotice = notice.replace("파이썬", "자바");
		System.out.println(newNotice);
	}

}
