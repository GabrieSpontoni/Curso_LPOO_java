
public class Pizza{
	//criando numIngredientes e preco para manipular ao longo da classe, obs: todas essas var�aveis a seguir s�o de instancia, ou seja cada objeto acessa essas var�veis resetadas.
	
	int numIngredientes;
	int preco;
	public Pizza(int qtIngredientes) {
		numIngredientes = qtIngredientes;
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
		
		