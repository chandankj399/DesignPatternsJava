package builder;

public class Builder extends LunchOrder {

	public Builder() {
		super();
	}

	public Builder bread(String bread) {
		super.bread = bread;
		return this;
	}

	public Builder condiments(String condiments) {
		super.condiments = condiments;
		return this;
	}

	public Builder dressing(String dressing) {
		super.dressing = dressing;
		return this;
	}

	public Builder meat(String meat) {
		super.meat = meat;
		return this;
	}
	


}