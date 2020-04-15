package builder;

public class LunchOrder {
	
	
	private final String bread;
	private final String condiments;
	private final String dressing;
	private final String meat;
	
	
	public LunchOrder(Builder builder) {
		this.bread = builder.getBread();
		this.condiments = builder.getCondiments();
		this.dressing = builder.getDressing();
		this.meat = builder.getMeat();
	}
	
	
	
	public String getBread() {
		return bread;
	}
	
	public String getCondiments() {
		return condiments;
	}
	public String getDressing() {
		return dressing;
	}
	public String getMeat() {
		return meat;
	}
	
	

}
