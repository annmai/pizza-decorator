package pizzapatterns;

import java.awt.Font;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class PizzaPatterns extends JFrame {
	
	private static final long serialVersionUID = 1L;
	
	private ArrayList<Character> validToppingCodes;
	private PizzaFactory factory;
	private PizzaToppingsFactory toppingsFactory;
	
	public PizzaPatterns(PizzaFactory factory, PizzaToppingsFactory toppingsFactory) {
		
		this.factory = factory;
		this.toppingsFactory = toppingsFactory;
		
		validToppingCodes = new ArrayList<Character>();
		validToppingCodes.add('p');
		validToppingCodes.add('s');
		validToppingCodes.add('h');
		validToppingCodes.add('c');
		validToppingCodes.add('e');
		validToppingCodes.add('o');
		validToppingCodes.add('g');
		validToppingCodes.add('b');
		validToppingCodes.add('n');
		validToppingCodes.add('m');
		validToppingCodes.add('a');
		validToppingCodes.add('r');
	}
	
	public Pizza orderPizza(String order) {
		
		Pizza pizza = null;
		char ch = order.charAt(0);
		
		if(!Character.isDigit(ch))
			return null;
		else {
			
			int base = Integer.valueOf(Character.toString(ch));
			pizza = factory.createPizza(base); 
			
			if(pizza == null)
				return null;		
		}
			
		for(int i = 1; i < order.length(); ++i) {
			
			ch = order.charAt(i);
			ch = Character.toLowerCase(ch);
			
			if(!validToppingCodes.contains(ch))
				return null;
			
			pizza = toppingsFactory.createTopping(ch, pizza);
		
		}
		
		return pizza;
	}

	public static void main(String[] args) {
		
		
		PizzaFactory pizzaFactory = new PizzaFactory();
		PizzaToppingsDecoratorFactory decoratorFactory = new PizzaToppingsDecoratorFactory();
		PizzaToppingsFactory toppingsFactory = new PizzaToppingsFactory(decoratorFactory);
			
		PizzaPatterns pizzaShop = new PizzaPatterns(pizzaFactory, toppingsFactory);
		
		JFrame frame = new JFrame("Menu");
		frame.setSize(500,700);
		
		JPanel panel = new JPanel();
		
		String content = "       ======== Pizza Pattern ========\n"
				+ "       1. Small, $8.00\n"
				+ "       2. Medium, $10.00\n"
				+ "       3. Large, $12.00\n"
				+ "       4. Family, $16.00\n\n"
				+ "       (P)epperoni, $2.00\r\n" + 
				"       (S)ausage, $2.00\r\n" + 
				"       (H)amburger, $2.00\r\n" + 
				"       (C)anadian Bacon, $2.75\r\n" + 
				"       (E)xtra cheese, $1.85\r\n" + 
				"       (O)nions, $1.50\r\n" + 
				"       (G)reen Pepper, $1.50\r\n" + 
				"       (B)lack olives, $1.50\r\n" + 
				"       Gree(n) olives, $1.35\r\n" + 
				"       (M)ushrooms, $1.75\r\n" + 
				"       (A)nchovies, Free!\r\n" + 
				"       Bee(r), $3.25\r\n" + 
				"       ==============================\r\n";
		
		JTextArea contentTextArea = new JTextArea(12, 25);
		Font arial = new Font("Arial", Font.BOLD, 20);
		contentTextArea.setFont(arial);
		contentTextArea.setText(content);
		contentTextArea.setEditable(false);
		
		JLabel enterOrderLabel = new JLabel("Enter Order: ");
		enterOrderLabel.setLocation(5, 400);
		
		JTextArea inputTextArea = new JTextArea (8, 40);
		inputTextArea.setEditable(true);
		inputTextArea.setLineWrap(true);
		inputTextArea.setWrapStyleWord(true);
		
		JScrollPane scroll = new JScrollPane (inputTextArea, 
				   JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
		
		panel.add(contentTextArea);
		panel.add(enterOrderLabel);
		panel.add(scroll);
		frame.add(panel);
		frame.setVisible(true);
		
		inputTextArea.addKeyListener(new KeyListener() {

			public void keyPressed(KeyEvent event) {
				
				if(event.getExtendedKeyCode() == KeyEvent.VK_ESCAPE) {
					JOptionPane.showMessageDialog(null, "Order has been cancelled.");	
					inputTextArea.selectAll();
					inputTextArea.setText("");
				}
				
				else if(event.getExtendedKeyCode() == KeyEvent.VK_ENTER) {
						
					String order = inputTextArea.getText();
						Pizza pizza = pizzaShop.orderPizza(order);
						
						if(pizza == null) {
							JOptionPane.showMessageDialog(null, "Invalid Order. Try Again.");
							inputTextArea.selectAll();
							inputTextArea.setText("");
							inputTextArea.setCaretPosition(0);
							event.consume();
						}
						else {
							int numIngredients = pizza.count();
							String description = pizza.getDescription();
							
							if(numIngredients > 0) {
								int index = description.indexOf(',');
								String firstPart = description.substring(0, index);
								String lastPart = description.substring(index+1, description.length());
								firstPart += " with";
								firstPart += lastPart;
								description = firstPart;
							}
							
							
							NumberFormat formatter = new DecimalFormat("#0.00"); 
							inputTextArea.setText("Order: " + description + " - $" + 
							formatter.format(pizza.cost()) + "\n     " + numIngredients + " Ingredients\nEnd order");
						}
							
					}
			}

			public void keyReleased(KeyEvent event) {}
			public void keyTyped(KeyEvent event) {}

			
		});
		
	}

}
