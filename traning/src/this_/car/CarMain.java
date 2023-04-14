package this_.car;

public class CarMain {

	public static void main(String[] args) {
		Car c = new Car("sm6");
		
		c.pushAccel();
		c.pushAccel();
		c.pushBrake();
		c.pushAccel();
		c.pushBrake();
		c.pushAccel();
		c.pushAccel();
		c.pushAccel();
		c.pushBrake();
		c.pushBrake();
		c.showInfo();
	}

}
