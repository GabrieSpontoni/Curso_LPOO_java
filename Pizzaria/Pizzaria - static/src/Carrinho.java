
public class Carrinho {
	//Variaveis estáticas para o preço total e auxiliar para identificar cada pizza respectivamente
	static int precototal;
	static int aux = 0;
	static int numPizzasCarrinho = Pizza.numPizzas ;
	static int numingredientesCarrinho = Pizza.numIngredientes_static ;
	//variavel para retirar warning da Main.java
	int nada = 0;
	
	public Carrinho (Pizza p) {
		aux += 1;
		precototal += p.getPrecoPizza();
		if (p.numIngredientes < 2) {
			System.out.println("pizza"+aux+" com menos de 2 sabores,logo, não é possivel adicionar ao carrinho");
			precototal -= p.getPrecoPizza();
			numPizzasCarrinho --;
			numingredientesCarrinho -= p.numIngredientes;
		}else
			System.out.println("Pizza"+aux+" no valor de "+p.getPrecoPizza()+" reais, adicionada ao carrinho com sucesso");
		
		System.out.println("Valor atual do carrinho = "+precototal);
		System.out.println("\n");
		
		
	}

}
