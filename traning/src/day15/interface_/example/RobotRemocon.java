package day15.interface_.example;

public class RobotRemocon implements Remocon {
	
	private String name;
	private int num;
	
	public RobotRemocon(String name, int num) {
		this.name = name;
		this.num = num;
	}
	
	@Override
	public void on() {
		System.out.println("로봇의 전원을 킵니다.");
	}

	@Override
	public void off() {
		System.out.println("로봇의 전원을 끕니다.");
	}

	@Override
	public void up() {
		System.out.println("로봇이 앞으로 이동합니다.");
	}

	@Override
	public void down() {
		System.out.println("로봇이 뒤로 이동합니다.");
	}

	@Override
	public void left() {
		System.out.println("로봇이 왼쪽으로 이동합니다.");
	}

	@Override
	public void right() {
		System.out.println("로봇이 오른쪽으로 이동합니다.");
	}

}
