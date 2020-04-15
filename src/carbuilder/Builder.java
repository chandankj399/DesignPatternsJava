package carbuilder;

public class Builder extends Car {

	public Builder() {
		super();
	}

	public Builder build(Chassis chassis) {
		super.chassis = chassis;
		return this;
	}
	
	public Builder build(Wheel wheel) {
		super.wheel = wheel;
		return this;
	}
	
	public Builder build(Body body) {
		super.body = body;
		return this;
	}
	
	public Builder build(Paint paint) {
		super.paint = paint;
		return this;
	}
	
	
	


}