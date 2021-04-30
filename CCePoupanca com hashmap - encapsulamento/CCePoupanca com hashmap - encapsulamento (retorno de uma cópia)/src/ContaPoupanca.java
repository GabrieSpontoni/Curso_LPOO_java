
public class ContaPoupanca extends Conta {
	private double taxaRendimento ;
	
	public double getTaxaRendimento() {
		return taxaRendimento;
	}

	public void setTaxaRendimento(double taxaRendimento) {
		this.taxaRendimento = taxaRendimento;
	}
	
	void exibe() {
		System.out.println("**CONTA POUPANCA**");
		System.out.println("informa��es do cliente");
		System.out.println("numero da conta : "+getNumero());
		System.out.println("titular : "+getTitular());
		System.out.println("saldo : "+getSaldo());
		System.out.println("Taxa de Rendimento da Poupan�a : "+getTaxaRendimento());
		System.out.println("\n");
	}
	
	public void fimDoMes() {
		if (getSaldo() > 0) {
			System.out.println("fim do m�s: parabens voc� terminou positivado com uma taxa de rendimento = "+taxaRendimento+", novo saldo disponivel : "+ (getSaldo() + getSaldo() * taxaRendimento));
			System.out.println("\n");
		}
		else {
			System.out.println("fim do m�s: sem rendimentos esse m�s (saldo negativo ou nulo)");
			System.out.println("\n");
		}
		
	}
	

	
}
