package carbuilder;

public class CarBuilderDemo {

	public static void main(String[] args) {
		
		Builder builder = new Builder();
		
		
		
		builder.build(new Chassis("Frame")).build(new Body("Metallic")).build(new Wheel("Alloy")).build(new Paint("Black"));
		
		Car car = builder.build();
		
		System.out.println(car.getBody());
		
		
	}
}
