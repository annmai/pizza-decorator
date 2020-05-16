package pizzapatterns;

public class BlackOlives extends ToppingsDecorator {
	
	public BlackOlives(Pizza pizza) {
		this.pizza = pizza;
		cost = 1.50;
	}

	public String getDescription() {
		return pizza.getDescription() + ", black olives";
	}

}
