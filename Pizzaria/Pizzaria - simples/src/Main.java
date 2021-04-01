
public class Main {

	public static void main(String[] args) {
		//informações inicias das pizzas (podem ser alterados os valores para test)
		Pizza pizza1 = new Pizza(4);
		Pizza pizza2 = new Pizza(3);
		Pizza pizza3 = new Pizza(1);
		
		//Chamando o metodo do carrinho (exclusivamente 3 pizzas)
		Carrinho c = new Carrinho(pizza1,pizza2,pizza3);
		c.precototal = 0;
		
		
		
		
	}

}
