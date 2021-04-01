
public class ContaCorrente {
	float saldo,limite;
	int numero;
	String titular;
	
	//construtor 1 (sacar)
	public void sacar(float valor) {
		if (valor < saldo || valor <=limite){
			saldo -= valor;
			System.out.println("saque autorizado no valor de "+valor+ " . novo saldo disponivel = "+saldo);
			
		}
		else {
			System.out.println("saldo ou limite insuficientes");
		}
	}
	
	//construtor 2 (depositar)
	public void depositar(float valor) {
		saldo += valor;
		System.out.println("Deposito realizado com sucesso, novo saldo = "+saldo);
	}
	
	//construtor 3 (Exibir)
	public void exibir() {
		System.out.println("Informações");
		System.out.println("identificador numérico da conta = "+numero);
		System.out.println("nome do titular = "+titular);
		System.out.println("saldo atual = "+saldo);
		System.out.println("limite = "+limite);
	}
	
}
