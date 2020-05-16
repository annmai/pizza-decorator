package pizzapatterns;

public abstract class ToppingsDecorator extends Pizza {
	
	protected Pizza pizza = null;
	protected int count = 1;
	
	public abstract String getDescription();
	
	public double cost() {
		
		if(pizza != null)
			return pizza.cost() + cost;
		else
			return cost;
	}
	
	public int count() {
		if(pizza != null)
			return pizza.count() + 1;
		else
			return 1;
	}
}
