package pizzapatterns;

public class Onions extends ToppingsDecorator {
	
	public Onions(Pizza pizza) {
		this.pizza = pizza;
		cost = 1.50;
	}

	public String getDescription() {
		return pizza.getDescription() + ", onions";
	}
}
