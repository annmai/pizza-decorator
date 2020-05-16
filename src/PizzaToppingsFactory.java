package pizzapatterns;

public class PizzaToppingsFactory {
	
	private PizzaToppingsDecoratorFactory factory;
	
	public PizzaToppingsFactory(PizzaToppingsDecoratorFactory factory) {
		this.factory = factory;
	}
	
	public Pizza createTopping(char ch, Pizza pizza) {
		
		if(ch == 'p')
			pizza = factory.createPepperoni(pizza);
		else if(ch == 's')
			pizza = factory.createSausage(pizza);
		else if(ch == 'h')
			pizza = factory.createHamburger(pizza);
		else if(ch == 'c')
			pizza = factory.createCanadianBacon(pizza);
		else if(ch == 'e')
			pizza = factory.createExtraCheese(pizza);
		else if(ch == 'o')
			pizza = factory.createOnions(pizza);
		else if(ch == 'g')
			pizza = factory.createGreenPepper(pizza);
		else if(ch == 'b')
			pizza = factory.createBlackOlives(pizza);
		else if(ch == 'n')
			pizza = factory.createGreenOlives(pizza);
		else if(ch == 'm')
			pizza = factory.createMushrooms(pizza);
		else if(ch == 'a')
			pizza = factory.createAnchovies(pizza);
		else if(ch == 'r')
			pizza = factory.createBeer(pizza);
		
		return pizza;
	}

}
