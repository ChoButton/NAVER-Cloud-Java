package this_.car;

public class Car {
	private String carName;
	private int currentSpeed;
	private int gas;
	private int brakePad;
	
	public final static int UP_SPEED = 10;
	public final static int DOWN_SPEED = 10;
	public final static int GAS_DWINDLE = 1;
	public final static int BRAKEPAD_DWINDLE = 1;
	
	public Car(String carName) {
		this.carName = carName;
		this.currentSpeed = 0;
		this.gas = 100;
		this.brakePad = 100;
	}
	
	public void pushAccel() {
		this.currentSpeed += UP_SPEED;
		this.gas -= GAS_DWINDLE;
	}
	
	public void pushBrake() {
		this.currentSpeed -= DOWN_SPEED;
		this.brakePad -= BRAKEPAD_DWINDLE;
	}
	
	public void showInfo() {
		System.out.println("차종 : " + this.carName);
		System.out.println("현재속도 : " + this.currentSpeed + "km/h");
		System.out.println("연료량 : " + this.gas + "%");
		System.out.println("브레이크 패드상태 : " + this.brakePad + "%");
	}
}
