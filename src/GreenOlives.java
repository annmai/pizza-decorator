package pizzapatterns;

public class GreenOlives extends ToppingsDecorator {
	
	public GreenOlives(Pizza pizza) {
		this.pizza = pizza;
		cost = 1.35;
	}

	public String getDescription() {
		return pizza.getDescription() + ", green olives";
	}
	
}
