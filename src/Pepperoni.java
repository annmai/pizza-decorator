package pizzapatterns;

public class Pepperoni extends ToppingsDecorator {
	
	public Pepperoni(Pizza pizza) {
		this.pizza = pizza;
		cost = 2.00;
	}

	public String getDescription() {
		return pizza.getDescription() + ", pepperoni";
	}

}
