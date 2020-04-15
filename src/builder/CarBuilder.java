package builder;

public class CarBuilder {

	protected String chassis;
	protected String wheels;
	protected String body;
	protected String color;

	public CarBuilder() {

	}

	public CarBuilder build() {

		return this;
	}

	public String getChassis() {
		return chassis;
	}

	public String getWheels() {
		return wheels;
	}

	public String getBody() {
		return body;
	}

	public String getColor() {
		return color;
	}

	

}
