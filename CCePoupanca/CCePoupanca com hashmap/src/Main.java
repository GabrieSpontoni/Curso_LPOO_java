
public class Main {

	public static void main(String[] args) {
		//Conta
		Conta c = new Conta();
		c.setTitular("Joao Pedro");
		c.setNumero(1);
		c.setSaldo(1000);
		
		Conta c2 = new Conta();
		c2.setTitular("Teresa Nami");
		c2.setNumero(2);
		c2.setSaldo(1000);
		

		//ContaCorrente
		ContaCorrente cc = new ContaCorrente();
		cc.setTitular("Gabriel Spontoni");
		cc.setNumero(3);
		cc.setSaldo(1000);
		cc.setLimite(100);
		cc.setTaxaJuros(0.1);
		
		
		
		ContaCorrente cc2 = new ContaCorrente();
		cc2.setTitular("Antoni Vitor");
		cc2.setNumero(4);
		cc2.setSaldo(1000);
		cc2.setLimite(100);
		cc2.setTaxaJuros(0.1);
		
		
		
		//Poupança
		ContaPoupanca cp = new ContaPoupanca();
		cp.setTitular("Paulo Cesar");
		cp.setNumero(6);
		cp.setSaldo(-1000);
		cp.setTaxaRendimento(0.2);
		
		//conta teste com chave igual a conta anterior
		ContaPoupanca cp2 = new ContaPoupanca();
		cp2.setTitular("Fernanda Silva");
		cp2.setNumero(6);
		cp2.setSaldo(5000);
		cp2.setTaxaRendimento(0.2);
		
	
		//banco	
		Banco bradesco = new Banco();
		
		bradesco.insere(c);
		bradesco.insere(c2);
		
		bradesco.insere(cc);
		bradesco.insere(cc2);
		
		
		
		bradesco.insere(cp);
		bradesco.insere(cp2);
		
		//*******EXIBIR DADOS CADASTRAIS OU DADOS DO FIM DO MES******************
		bradesco.exibe();
		//bradesco.fimDoMes();
		
		
		
		

	}

}


