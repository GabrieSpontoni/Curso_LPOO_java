
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
		System.out.println("nome Vendedor(a): "+nome +", Salario mensal (sem comiss�o): "+salMes);
		System.out.println("taxa de comiss�o em porcentagem (%): "+txComissao*100+ ", Valor alcan�ado em vendas:"+valAlcancado);
		System.out.println("salario mensal comissionado: "+SalComissionado);
		System.out.println("\n");
		
	}
	
}
