package pizzapatterns;

public abstract class Pizza {
	
	protected String description = "";
	protected double cost = 0.0;
	protected int count = 0;
	
	public String getDescription() {
		return description;
	}
	
	public double cost() {
		return cost;
	}
	
	public int count() {
		return count;
	}

}
