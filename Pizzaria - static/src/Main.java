
public class Main {

	public static void main(String[] args) {
		//informações inicias das pizzas podem ser alterados os valores para teste e criadas quantas pizzas o usuario quiser
		Pizza pizza1 = new Pizza(1);
		Pizza pizza2 = new Pizza(2);
		Pizza pizza3 = new Pizza(2);
		Pizza pizza4 = new Pizza(2);
		Pizza pizza5 = new Pizza(2);
		
		//Chamando o metodo para verificar e adicionar cada pizza ao carrinho
		Carrinho c1 = new Carrinho(pizza1);
		Carrinho c2 = new Carrinho(pizza2);
		Carrinho c3 = new Carrinho(pizza3);
		Carrinho c4 = new Carrinho(pizza4);
		Carrinho c5 = new Carrinho(pizza5);
		
		
		System.out.println("numero de pizzas criadas ao total = "+Pizza.numPizzas);
		System.out.println("numero de ingredientes totais criados = "+Pizza.numIngredientes_static);
		System.out.println("numero de pizzas inseridas no carrinho = "+Carrinho.numPizzasCarrinho);
		System.out.println("numero de ingredientes totais no carrinho = "+Carrinho.numingredientesCarrinho);
		
		pizza1.preco = pizza2.preco = pizza3.preco = pizza4.preco = pizza5.preco  =  0;
		c1.nada = c2.nada = c3.nada = c4.nada = c5.nada = 1;
		
	}

}
