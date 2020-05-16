package pizzapatterns;

public class Hamburger extends ToppingsDecorator {
	
	public Hamburger(Pizza pizza) {
		this.pizza = pizza;
		cost = 2.00;
	}

	public String getDescription() {
		return pizza.getDescription() + ", hamburger";
	}

}
