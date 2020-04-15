package builder;

public  class Builder {
		public String getBread() {
		return bread;
	}

	
		private String bread;
		private String condiments;
		private String dressing;
		private String meat;
		
		public Builder() {
			
		}
		
		public LunchOrder build() {
			return new LunchOrder(this);
		}
		
		public Builder bread(String bread) {
			this.bread = bread;
			return this;
		}
		
		public Builder condiments(String condiments) {
			this.condiments = condiments;
			return this;
		}
		
		public Builder dressing(String dressing) {
			this.dressing = dressing;
			return this;
		}
		
		public Builder meat(String meat) {
			this.meat = meat;
			return this;
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