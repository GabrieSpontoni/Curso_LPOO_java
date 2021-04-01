
public class Main {

	public static void main(String[] args) {
		// Funcionários
		Funcionario gabriel = new Funcionario("Gabriel Spontoni");
		Funcionario antenor = new Funcionario("Antenor Sebastião");
		Funcionario maria = new Funcionario("Maria Henriqueta");
		
		gabriel.salMes = 1500;
		gabriel.exibe();
		//gabriel.getSalario();
		
		antenor.salMes = 4000;
		antenor.exibe();
		//antenor.getSalario();

		maria.salMes = 3400;
		maria.exibe();
		//antenor.getSalario();
		//maria.exibe();
		
		//Vendedores
		Vendedor filomena = new Vendedor("Filomena Tinuca");
		Vendedor tunico = new Vendedor("Tunico Alvarenga");
		Vendedor um = new Vendedor("Um Dois Tres da Silva Quatro");
		
		filomena.salMes = 2000;
		filomena.txComissao = 0.5;
		filomena.valAlcancado = 1000;
		filomena.SalComissionado();
		filomena.exibe();
		//filomena.getSalario();
		
		
		tunico.salMes = 5000;
		tunico.txComissao = 0.2;
		tunico.valAlcancado = 2500;
		tunico.SalComissionado();
		tunico.exibe();
		//filomena.getSalario();
		
		um.salMes = 3000;
		um.txComissao = 0.7;
		um.valAlcancado = 1000;
		um.SalComissionado();
		um.exibe();
		//filomena.getSalario();



	}

}
