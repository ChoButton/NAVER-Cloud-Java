package poly.inheri;

public class Warrior {
	
	private String id;
	private int hp;
	private int atk;
	private int def;
	private int exp;
	
	public Warrior(String id) {
	this.id = id;
	this.hp = 20;
	this.atk = 3;
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
	
	// 파라미터로 모든 몬스터의 부모인 Moster를 선언하면
	// 다형성 원리에 의해서 상속받은 모든 몬스터가 대입 가능합니다.
	public void hunt(Monster monster) {
		// 죽은 몬스터는 교전 불가 및 종료
		if(monster.isInactive()) {
			showMonsterAlreadyDeadMessage(monster.getName());
			return;
		}
		// 죽은 몬스터가 다음공격에 죽으면 플레이어에게 경험치 부여
		if(monster.isInativeAfterNextAttacked(this.atk)) {
		// 몬스터가 다음공격에 죽으면 플레이어에게 경험치 부여
			monster.setAfterAttackedHp(this.atk);
			gainMonsterExp(monster.getExp());
			showMonsterNowDeadMessage(monster.getName());
		} else {
		// 몬스터가 다음 공격에 죽지는 않으면 반격해 플레이어 체력 차감
			monster.setAfterAttackedHp(this.atk);
			setHpAfterAttack(monster.getAtk());
			showMonsterCounterAttackMessage(monster.getName());
		}
		
		
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
	
	//그냥 Warrior 내부에서 적어도 되지만 코드 흐름을
	//메서드 호출로만 제어하기 위해 분리.
	public void gainMonsterExp(int monsterExp) {
		this.exp += monsterExp;
	}
	
	// 상단 Warrior 체력을 차감하는 로직을 메서드로 분리 및 재정의
	public void setHpAfterAttack(int monsterAtk) {
		if(monsterAtk - this.def > 0) {
			this.hp -= monsterAtk - this.def;
		}else if(monsterAtk - this.def < 0){
			this.hp -= 1;
		}else {
			return;
		}
	}
	public void showMonsterAlreadyDeadMessage(String monsterName) {
		System.out.println("죽은 " + monsterName + "은(는) 공격할수 없습니다.");
		System.out.println("---------------");
	}
	
	public void showMonsterNowDeadMessage(String monsterName) {
		System.out.println(monsterName +  "가 죽었습니다.");
	}
	
	public void showMonsterCounterAttackMessage(String monsterName) {
		System.out.println(monsterName + "가 반격했습니다.");
	}
	
}
