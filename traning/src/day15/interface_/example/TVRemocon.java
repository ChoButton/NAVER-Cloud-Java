package day15.interface_.example;

public class TVRemocon implements Remocon{
	
	private String inch;
	private int ch;
	private int vul;
	
	public TVRemocon(String inch) {
		this.inch = inch;
		this.ch = 0;
		this.vul = 0;
	}
	
	@Override
	public void on() {
		System.out.println("티비 전원을 킵니다.");		
	}

	@Override
	public void off() {
		System.out.println("티비 전원을 끕니다.");
	}

	@Override
	public void up() {
		if(this.ch <= 100) {
			this.ch++;
		}else if(this.ch > 100) {
			this.ch = 0;
		}
		System.out.println("채널을 올립니다.");
	}

	@Override
	public void down() {
		if(this.ch > 0) {
			this.ch--;
		}else if(this.ch <= 0) {
			this.ch = 100;
		}
		System.out.println("채널을 내립니다.");
	}

	@Override
	public void left() {
		if(this.vul > 0) {
			this.vul--;
			System.out.println("볼륨을 내립니다.");
		}else {
			System.out.println("볼륨이 최소치 입니다.");
		}
	}

	@Override
	public void right() {
		if(this.vul < 50) {
			this.vul++;
			System.out.println("볼륨을 올립니다.");
		}else {
			System.out.println("볼륨이 최대치 입니다.");
		}
	}
	

}
