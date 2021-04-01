
public class Pizza{
	//criando numIngredientes e preco para manipular ao longo da classe, obs: static são variáveis que não resetam em cada objeto criado, ou seja, os objetos acessam a mesma variável (global)
	static int numPizzas;
	static int numIngredientes_static;
	int numIngredientes;
	int preco;
	public Pizza(int qtIngredientes) {
		numIngredientes = qtIngredientes;
		numIngredientes_static += numIngredientes;
		numPizzas += 1;
	}
	int getNumIngrediente() {
		return numIngredientes;
	}
	int getPrecoPizza() {
		if (numIngredientes <= 2) {
			preco = 15;
		}
		else if (numIngredientes > 2 && numIngredientes <=5)
			preco = 20;
		else
			preco = 23;
		return preco;
	}
	
	
}
		
		