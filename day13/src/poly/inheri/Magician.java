package poly.inheri;

public class Magician {
		
		private String id;
		private int hp;
		private int atk;
		private int mp;
		private int def;
		private int exp;
		
		
		
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

		public int getMp() {
			return mp;
		}

		public void setMp(int mp) {
			this.mp = mp;
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

		public Magician(String id) {
			this.id = id;
			this.hp = 20;
			this.mp = 20;
			this.atk = 2;
			this.def = 0;
			this.exp = 0;
		}
		
		public void showInfo() {
			System.out.println("아이디 : " + this.id);
			System.out.println("체력 : " + this.hp);
			System.out.println("마력 : " + this.mp);
			System.out.println("공격력 : " + this.atk);
			System.out.println("방어력 : " + this.def);
			System.out.println("획득경험치 : " + this.exp);
			System.out.println("-----------------------");
		}

		public void basicAttack(Monster monster) {
			if(monster.isInactive()) {
				return;
			}
			if(monster.isInativeAfterNextAttacked(getAtk())) {
				monster.setAfterAttackedHp(getAtk());
				gainMonsterExp(monster.getExp());
				showMonsterNowDeadMessage(monster.getName());
			}else {
				monster.setAfterAttackedHp(getAtk());
				setHpAfterAttack(monster.getAtk());
				showMonsterCounterAttackMessage(monster.getName());
			}	
			
		}
		
		public void castFireBall(Monster monster) {
			if(monster.isInactive()) {
				return;
			}
			if(monster.isInativeAfterNextAttacked(getAtk())) {
				monster.setAfterAttackedHp(getAtk());
				gainMonsterExp(monster.getExp());
				showMonsterNowDeadMessage(monster.getName());
			}else {
				monster.setAfterAttackedHp(getAtk());
				setHpAfterAttack(monster.getAtk());
				showMonsterCounterAttackMessage(monster.getName());
			}	
			
		}
		
		
		
		public void gainMonsterExp(int monsterExp) {
			this.exp += monsterExp;
		} 
		public void setHpAfterAttack(int monsterAtk) {
			if(this.hp - (monsterAtk - this.def) > 0) {
				this.hp -= (monsterAtk - this.def);
			}else if(this.hp - (monsterAtk - this.def) < 0) {
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
