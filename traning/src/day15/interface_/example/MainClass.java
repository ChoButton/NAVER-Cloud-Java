package day15.interface_.example;

public class MainClass {

	public static void main(String[] args) {
		Remocon re = new RobotRemocon("또봇", 11324);
		re.on();
		re.up();
		re.down();
		re.left();
		re.right();
		re.off();
		
		re = new TVRemocon("50인치");
		re.on();
		re.up();
		re.down();
		re.left();
		re.right();
		re.off();
		
		
	}

}
