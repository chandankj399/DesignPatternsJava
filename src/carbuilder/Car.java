package carbuilder;

public class Car {

	protected Chassis chassis;
	protected Wheel wheel;
	protected Body body;
	protected Paint paint;

	public Car() {

	}

	public Car build() {

		return this;
	}

	public String getChassis() {
		return chassis.getChassis();
	}

	public String getWheels() {
		return wheel.getWheel();
	}

	public String getBody() {
		return body.getBody();
	}

	public String getPaint() {
		return paint.getColor();
	}

	

}

