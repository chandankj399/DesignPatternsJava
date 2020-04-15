package builder;

public class BuilderLunchOrderDemo {

	public static void main(String[] args) {
		
		Builder builder = new Builder();
		
		builder.bread("Wheat").condiments("Lettuce");
		
		LunchOrder lunchOrder = builder.build();
		System.out.println(lunchOrder.getBread());
	}

}
