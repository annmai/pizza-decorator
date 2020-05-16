package pizzapatterns;

public class PizzaFactory {
	
	public Pizza createPizza(int num) {
		
		Pizza pizza = null;
		
		if(num == 1)
			pizza = new SmallPizza();
		else if(num == 2)
			pizza = new MediumPizza();
		else if(num == 3)
			pizza = new LargePizza();
		else if(num == 4)
			pizza = new FamilyPizza();
		
		return pizza;
	}

}
