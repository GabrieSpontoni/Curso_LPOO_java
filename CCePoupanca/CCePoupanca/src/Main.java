
public class Main {

	public static void main(String[] args) {

		//ContaCorrente
		ContaCorrente cc = new ContaCorrente();
		cc.setTitular("Gabriel Spontoni");
		cc.setNumero(1);
		cc.setSaldo(1000);
		cc.setLimite(100);
		cc.setTaxaJuros(0.1);
		
		cc.exibe();
		
		cc.depositar(200);
		cc.sacar(1250,cc.getLimite());
		cc.fimDoMes();
		
		
		System.out.println("------------------------------------------------------------------------");
		//Poupança
		int semLimite = 0; 
		ContaPoupanca cp = new ContaPoupanca();
		cp.setTitular("Paulo Cesar");
		cp.setNumero(2);
		cp.setSaldo(-1000);
		cp.setTaxaRendimento(0.2);
		
		cp.exibe();
		
		cp.depositar(1500);
		cp.sacar(2000,semLimite);
		cp.fimDoMes();
		
		
		
		

	}

}


