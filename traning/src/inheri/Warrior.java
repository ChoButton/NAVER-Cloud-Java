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

	public void monsterHunt(Monster monster) {
		if(monster.monsterDie()) {
			monster.monsterDieMessage();
			return;
		}
		if(userDeadChack()){
			youDie();
			return;// 몬스터가 반격하는 코드
		}
		monster.monsterAttacks(getAkt());
		monster.monsterAttacksMessage();
		if(monster.attackNextMonsterCheck()) { // 공격후 몬스터의 상태 체크 
			gainExpMessage(monster.getName(), monster.getExp());
			gainExp(monster.getExp());
		}else {
			beHitMessage(monster.getName(), monster.getAtk());
			beHit(monster.getAtk());
		}
	}
	
	public boolean userDeadChack() {
		return this.hp <= 0 ? true : false;
	}
	
	public void gainExp(int monExp) {
		this.exp += monExp;
	}
	
	public void gainExpMessage(String monsterName, int monsterExp) {
		System.out.println(monsterName + "이(가) 죽었습니다.");
		System.out.println("경험치" + monsterExp + "을 획득했습니다.");
		System.out.println("-------------------------------");
	}
	
	public void beHit(int monsterAtk) {
		if((monsterAtk - this.def) >= 0) {
			this.hp -= (monsterAtk - this.def);
		}else if((monsterAtk - this.def) < 0) {
			this.hp -= 1;
		}else if((monsterAtk - this.def) == 0) {
			return;
		}
	}
	
	public void beHitMessage(String monsterName, int monsterAtk) {
		System.out.println(monsterName + "에게 피해 " + this.akt + "만큼을 줬습니다.");
		System.out.println(monsterName + "이(가) 반격합니다.");
		System.out.println("피해 " + (monsterAtk - this.def) + "만큼을 받았습니다.");
		System.out.println("-------------------------------");
	}

	public void youDie() {
		System.out.println("플레이어가 사망하였습니다.");
	}


}
