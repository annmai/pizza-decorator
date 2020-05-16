package pizzapatterns;

public class Sausage extends ToppingsDecorator {
	
	public Sausage(Pizza pizza) {
		this.pizza = pizza;
		cost = 2.00;
	}

	public String getDescription() {
		return pizza.getDescription() + ", sausage";
	}
}
