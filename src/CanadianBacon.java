package pizzapatterns;

public class CanadianBacon extends ToppingsDecorator {
	
	public CanadianBacon(Pizza pizza) {
		this.pizza = pizza;
		cost = 2.75;
	}

	public String getDescription() {
		return pizza.getDescription() + ", canadian bacon";
	}

}
