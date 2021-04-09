
public class ContaPoupanca extends Conta {
	private double taxaRendimento ;
	
	public double getTaxaRendimento() {
		return taxaRendimento;
	}

	public void setTaxaRendimento(double taxaRendimento) {
		this.taxaRendimento = taxaRendimento;
	}
	
	void exibe() {
		System.out.println("informações do cliente");
		System.out.println("numero da conta : "+getNumero());
		System.out.println("titular : "+getTitular());
		System.out.println("saldo : "+getSaldo());
		System.out.println("Taxa de Rendimento da Poupança : "+getTaxaRendimento());
		System.out.println("\n");
	}
	
	public void fimDoMes() {
		if (getSaldo() > 0) {
			System.out.println("parabens você terminou positivado com uma taxa de rendimento = "+taxaRendimento+", novo saldo disponivel : "+ (getSaldo() + getSaldo() * taxaRendimento));
			System.out.println("\n");
		}
		else {
			System.out.println("sem rendimentos esse mês (saldo negativo ou nulo)");
			System.out.println("\n");
		}
		
	}

	
}
