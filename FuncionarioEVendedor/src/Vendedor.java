
public class Vendedor extends Funcionario{
	public double valAlcancado;
	public double txComissao;
	double SalComissionado;
	
	public Vendedor(String nome) {
		super(nome);
	}
	
	
	double SalComissionado(){
	    SalComissionado = salMes + valAlcancado * txComissao;
		return SalComissionado;
		
	}
	
	
	
	double getSalario() {
		salMes = SalComissionado;
		System.out.println("chamada getSalario Vendedor valor = "+salMes);
	    System.out.println("\n");
		return salMes;
	}
	void exibe() {
		System.out.println("nome Vendedor(a): "+nome +", Salario mensal (sem comissão): "+salMes);
		System.out.println("taxa de comissão em porcentagem (%): "+txComissao*100+ ", Valor alcançado em vendas:"+valAlcancado);
		System.out.println("salario mensal comissionado: "+SalComissionado);
		System.out.println("\n");
		
	}
	
}
