package inheri;

public class Monster {
	private String name;
	private int hp;
	private int atk;
	private int def;
	private int exp;
	public Monster(String name, int hp, int atk, int def, int exp) {
		this.name = name;
		this.hp = hp;
		this.atk = atk;
		this.def = def;
		this.exp = exp;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getHp() {
		return hp;
	}
	public void setHp(int hp) {
		this.hp = hp;
	}
	public int getAtk() {
		return atk;
	}
	public void setAtk(int atk) {
		this.atk = atk;
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

	public boolean monsterDie() {
		return this.hp < 0 ? true : false;
	}//몬스터가 생존여부 체크
	
	public void monsterDieMessage() {
		System.out.println(this.name + "이(가) 죽어서 공격할수 없습니다.");
		System.out.println("-------------------------------");
	}
	
	public void monsterAttacks(int userAkt) {
		this.hp -= userAkt - this.def;
	}//몬스터 공격
	
	public void monsterAttacksMessage() {
		System.out.println(this.name + "을(를) 공격하였습니다.");
		System.out.println("-------------------------------");
	}
	
	public boolean userAttackNextStatus() {
		return this.hp <= 0 ? true : false;
	}
	
	public boolean attackNextMonsterCheck() {
		if(this.hp <= 0) {
			return true;
		}else {
			return false;
		}
	}
	
	
	
}
