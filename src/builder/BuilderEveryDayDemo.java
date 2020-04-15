package builder;

public class BuilderEveryDayDemo {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		
		sb.append("This is an example");
		
		sb.append("of builder pattern");
		
		sb.append("It has methods to append almost anything to string");
		
		sb.append(true);
		
		sb.append(42);
		
		sb.append(BuilderEveryDayDemo.class);
		
		System.out.println(sb.toString());
	}

}
