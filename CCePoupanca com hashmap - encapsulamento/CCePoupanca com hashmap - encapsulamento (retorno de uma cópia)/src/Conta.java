
public class Conta {
	private int numero;
	private String titular;
	private double saldo;
	
	
	
	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	
	
	
	public void sacar(float valor, double limite) {
		if (valor < saldo + limite){
			saldo -= valor;
			System.out.println("saque autorizado no valor de "+valor+ " . novo saldo disponivel = "+saldo);
			
		}
		else {
			System.out.println("operação de saque negado: saldo ou limite insuficientes");
		}
	}
	
	public void depositar(float valor) {
		saldo += valor;
		System.out.println("Deposito realizado com sucesso, novo saldo = "+saldo);
	}
	
	
	void exibe() {
		System.out.println("informações do cliente");
		System.out.println("numero da conta : "+getNumero());
		System.out.println("titular : "+getTitular());
		System.out.println("saldo : "+getSaldo());
		System.out.println("\n");
	}
	
	public void fimDoMes() {
		System.out.println("fim do mês: saldo = "+saldo);
		System.out.println("\n");
		
	}
	
	
	
}
