
public class Carrinho {
	int precototal;
	
	public Carrinho (Pizza p1,Pizza p2, Pizza p3) {
		precototal = p1.getPrecoPizza() + p2.getPrecoPizza() + p3.getPrecoPizza();
		if (p1.numIngredientes < 2) {
			System.out.println("pizza1 com menos de 2 sabores não é possivel colocar no carrinho");
			precototal -= p1.getPrecoPizza();
		}
		if (p2.numIngredientes < 2) {
			System.out.println("pizza2 com menos de 2 sabores não é possivel colocar no carrinho");
			precototal -= p2.getPrecoPizza();
		}
		if (p3.numIngredientes < 2) {
			System.out.println("pizza3 com menos de 2 sabores não é possivel colocar no carrinho");
			precototal -= p3.getPrecoPizza();
		}
		System.out.println("Valor total da(s) pizza(s) = "+precototal);
		
	}

}
