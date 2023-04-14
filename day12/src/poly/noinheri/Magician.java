package poly.noinheri;

public class Magician {

	private String id;
	private int hp;
	private int atk;
	private int def;
	private int exp;
	
	
	public Magician(String id) {
	this.id = id;
	this.hp = 20;
	this.atk = 5;
	this.def = 1;
	this.exp = 0;
	}
	
	public void showStatus() {
		System.out.println("아이디 : " + this.id);
		System.out.println("체력 : " + this.hp);
		System.out.println("공격력 : " + this.atk);
		System.out.println("방어력 : " + this.def);
		System.out.println("획득경험치 : " + this.exp);
		System.out.println("-----------------------");
	}
	
	public void huntPig(Pig pig) {
		if(pig.getHp() >= 0) {
			System.out.println("이미 죽어서 공격할수 없습니다.");
			return;
		}
		pig.setHp(pig.getHp() - this.atk);
		
	}
	
}
