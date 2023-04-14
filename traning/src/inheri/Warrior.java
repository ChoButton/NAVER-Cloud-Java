package inheri;

public class Warrior {
	private String id;
	private int hp;
	private int akt;
	private int def;
	private int exp;
	
	public Warrior(String id) {
		this.id = id;
		this.hp = 100;
		this.akt = 10;
		this.def = 5;
		this.exp = 0;
	}
	
 	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public int getHp() {
		return hp;
	}
	public void setHp(int hp) {
		this.hp = hp;
	}
	public int getAkt() {
		return akt;
	}
	public void setAkt(int akt) {
		this.akt = akt;
	}
	public int getDef() {
		return def;
	}
	public void setDef(int def) {
		this.def = def;
	}
	public int getExp() {
		return exp;
	}
	public void setExp(int exp) {
		this.exp = exp;
	}
	public void showInfo() {
		System.out.println("아이디 : " + this.id);
		System.out.println("생명력 : " + this.hp);
		System.out.println("공격력 : " + this.akt);
		System.out.println("방어력 : " + this.def);
		System.out.println("경험치 : " + this.exp);
		System.out.println("-------------------------------");
	}

	public void attackMonster(Monster monster) {
		if(monster.checkStatus()) {
			System.out.println(monster.getName() + "이(가) 죽어서 공격할수 없습니다.");
			System.out.println("-------------------------------");
			return;
		}
		if(userDeadChack()){
			System.out.println("플레이어가 사망하였습니다.");
			return;// 몬스터가 반격하는 코드
		}
		monster.attackMonster(getAkt());
		System.out.println(monster.getName() + "을(를) 공격하였습니다.");
		System.out.println("-------------------------------");
		if(monster.getHp() <= 0) { // 공격후 몬스터의 상태 체크 
			System.out.println(monster.getName() + "이(가) 죽었습니다.");
			System.out.println("경험치" + monster.getExp() + "을 획득했습니다.");
			System.out.println("-------------------------------");
			this.exp += monster.getExp();
		}else if(monster.getHp() > 0) {
			System.out.println(monster.getName() + "에게 피해 " + this.akt + "만큼을 줬습니다.");
			System.out.println(monster.getName() + "이(가) 반격합니다.");
			System.out.println("피해 " + (monster.getAtk() - this.def) + "만큼을 받았습니다.");
			System.out.println("-------------------------------");
			if((monster.getAtk() - this.def) >= 0) {
				this.hp -= (monster.getAtk() - this.def);
			}else if((monster.getAtk() - this.def) < 0) {
				this.hp -= 1;
			}else if((monster.getAtk() - this.def) == 0) {
				return;
			}
		}
	}
	
	public boolean userDeadChack() {
		return this.hp <= 0 ? true : false;
	}
	
	
}
