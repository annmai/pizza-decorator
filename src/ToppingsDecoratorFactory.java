package pizzapatterns;

public interface ToppingsDecoratorFactory {

	public Pizza createPepperoni(Pizza pizza);
	public Pizza createSausage(Pizza pizza);
	public Pizza createHamburger(Pizza pizza);
	public Pizza createCanadianBacon(Pizza pizza);
	public Pizza createExtraCheese(Pizza pizza);
	public Pizza createOnions(Pizza pizza);
	public Pizza createGreenPepper(Pizza pizza);
	public Pizza createBlackOlives(Pizza pizza);
	public Pizza createGreenOlives(Pizza pizza);
	public Pizza createMushrooms(Pizza pizza);
	public Pizza createAnchovies(Pizza pizza);
	public Pizza createBeer(Pizza pizza);

}
