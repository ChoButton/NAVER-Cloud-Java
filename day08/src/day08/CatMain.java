package day08;

public class CatMain {
	
	
	public static void main(String[] args) {
		
		Cat c1 = new Cat("네로", 1, "코숏", "턱시도");
		
		/*
		c1.name = "네로";
		c1.age = 1;
		c1.race = "코숏";
		c1.color = "턱시도";
		*/	
						
		Cat c2 = new Cat("단추", 3, "푸들", "화이트");
		
		/*
		c2.name = "단추";
		c2.age = 3;
		c2.race = "푸들";
		c2.color = "화이트";
		*/
		
		c1.showInfo(); //c1 이 갖고 있는 번지수의 showCatInfo 를 해주세요 라는 뜻
		c2.showInfo(); //cat 클래스에서 showCatInfo를 갖고 있기 때문
		
	}

}
