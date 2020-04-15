package builder;

public class LunchOrder {

	protected String bread;
	protected String condiments;
	protected String dressing;
	protected String meat;

	public LunchOrder() {

	}

	public LunchOrder build() {

		return this;
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
