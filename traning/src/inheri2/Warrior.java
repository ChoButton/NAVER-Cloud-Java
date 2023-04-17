package inheri2;

public class Warrior {
	private String name;
	private int hp;
	private int atk;
	private int def;
	private int exp;
	
	public Warrior(String name) {
		this.name = name;
		this.hp = 100;
		this.atk = 10;
		this.def = 1;
		this.exp = 0;
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
	
	
	
}
