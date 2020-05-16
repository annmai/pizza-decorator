package pizzapatterns;

public class ExtraCheese extends ToppingsDecorator {
	
	public ExtraCheese(Pizza pizza) {
		this.pizza = pizza;
		cost = 1.85;
	}

	public String getDescription() {
		return pizza.getDescription() + ", extra cheese";
	}

}
