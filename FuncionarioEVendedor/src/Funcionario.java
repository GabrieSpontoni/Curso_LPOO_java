
public class Funcionario {
	public String nome;
	public double salMes;
	
	public Funcionario(String nome) {
		this.nome = nome;
	}
	
	double getSalario() {
		System.out.println("chamada getSalario Funcionário valor = "+salMes);
		System.out.println("\n");
		return salMes;
	}
	void exibe() {
		System.out.println("nome Funcionario(a): "+nome);
		System.out.println("salario mensal: "+salMes);
		System.out.println("\n");
		
	}
	
}
