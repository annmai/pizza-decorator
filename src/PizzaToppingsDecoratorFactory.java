package pizzapatterns;

public class PizzaToppingsDecoratorFactory implements ToppingsDecoratorFactory {

	public Pizza createPepperoni(Pizza pizza) {
		return new Pepperoni(pizza);
	}

	public Pizza createSausage(Pizza pizza) {
		return new Sausage(pizza);
	}

	public Pizza createHamburger(Pizza pizza) {
		return new Hamburger(pizza);
	}

	public Pizza createCanadianBacon(Pizza pizza) {
		return new CanadianBacon(pizza);
	}

	public Pizza createExtraCheese(Pizza pizza) {
		return new ExtraCheese(pizza);
	}

	public Pizza createOnions(Pizza pizza) {
		return new Onions(pizza);
	}

	public Pizza createGreenPepper(Pizza pizza) {
		return new GreenPepper(pizza);
	}

	public Pizza createBlackOlives(Pizza pizza) {
		return new BlackOlives(pizza);
	}

	public Pizza createGreenOlives(Pizza pizza) {
		return new GreenOlives(pizza);
	}

	public Pizza createMushrooms(Pizza pizza) {
		return new Mushrooms(pizza);
	}

	public Pizza createAnchovies(Pizza pizza) {
		return new Anchovies(pizza);
	}

	public Pizza createBeer(Pizza pizza) {
		return new Beer(pizza);
	}


}
