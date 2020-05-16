package pizzapatterns;

public class Beer extends ToppingsDecorator {
	
	public Beer(Pizza pizza) {
		this.pizza = pizza;
		cost = 3.25;
	}

	public String getDescription() {
		return pizza.getDescription() + ", beer";
	}
	
}
