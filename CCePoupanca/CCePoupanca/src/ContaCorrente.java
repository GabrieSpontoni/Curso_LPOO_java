
public class ContaCorrente extends Conta {
	private double limite;
	private double taxaJuros;
	
	
	
	public double getLimite() {
		return limite;
	}



	public void setLimite(double limite) {
		this.limite = limite;
	}



	public double getTaxaJuros() {
		return taxaJuros;
	}



	public void setTaxaJuros(double taxaJuros) {
		this.taxaJuros = taxaJuros;
	}


	void exibe() {
		System.out.println("informações do cliente");
		System.out.println("numero da conta : "+getNumero());
		System.out.println("titular : "+getTitular());
		System.out.println("saldo : "+getSaldo());
		System.out.println("limite : "+getLimite());
		System.out.println("Taxa de juros a ser cobrada na Conta Corrente: " +getTaxaJuros());
		System.out.println("\n");
	}
	

	public void fimDoMes() {
		if (getSaldo()  < 0  ) {
			System.out.println("fim do mes : saldo negativo, taxa de juros será cobrado no valor de "+taxaJuros +", novo saldo após cobrança de taxa no final do mês "+(getSaldo() + getSaldo() * taxaJuros));
			System.out.println("\n");
		}
		else {
			System.out.println("fim do mes: saldo positivo, sem taxas a serem cobradas");
			System.out.println("\n");
		}

	}


	
	
}
	