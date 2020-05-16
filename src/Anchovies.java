package pizzapatterns;

public class Anchovies extends ToppingsDecorator {
	
	public Anchovies(Pizza pizza) {
		this.pizza = pizza;
		cost = 0.00;
	}

	public String getDescription() {
		return pizza.getDescription() + ", anchovies";
	}

}
