
public class Main {

	public static void main(String[] args) {
		ContaCorrente conta1 = new ContaCorrente();
		//informações inicias da conta1 (podem ser alterados os valores para test)
		conta1.saldo = 300;
		conta1.numero = 4;
		conta1.titular = "Gabriel Spontoni";
		conta1.limite = 3000;
		
		//chamada dos métodos para a conta1 (podem ser alterados os valores para test)
		conta1.sacar(100);
		//conta1.depositar(5000);
		//conta1.exibir();
	}

}
