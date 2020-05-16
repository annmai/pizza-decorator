package pizzapatterns;

public class Mushrooms extends ToppingsDecorator {
	
	public Mushrooms(Pizza pizza) {
		this.pizza = pizza;
		cost = 1.75;
	}

	public String getDescription() {
		return pizza.getDescription() + ", mushrooms";
	}
}
