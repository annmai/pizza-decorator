package pizzapatterns;

public class GreenPepper extends ToppingsDecorator {
	
	public GreenPepper(Pizza pizza) {
		this.pizza = pizza;
		cost = 1.50;
	}

	public String getDescription() {
		return pizza.getDescription() + ", green pepper";
	}

}
