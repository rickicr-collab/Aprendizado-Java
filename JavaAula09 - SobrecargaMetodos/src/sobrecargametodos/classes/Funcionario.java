package sobrecargametodos.classes;
	
	/*
	 * TRABALHANDO COM SOBRECARGA DE MÉTODOS 
	 * O MODIFICADOR PODE SER A SEU CRITERIO.
	 * O RETORNO PODE SER AO SEU CRITERIO. 
	 * O MÉTODO PRECISA TER O MESMO NOME DO MÉTODO ORIGINAL.
	 * MAIS OS PARAMENTROS PRECISAM SER OS MESMO DO MÉTODO ORIGINAL
	 * APENAS ACRESCENTANDO AQUELES QUE PRECISAM SER ACRESCENTADOS 
	 */

public class Funcionario {
	private String nome;
	private String cpf;
	private double salario;
	private String rg;
	
	//MÉTODO INIT
	public void init(String nome, String cpf, double salario) {
		this.nome = nome;
		this.cpf = cpf;
		this.salario = salario;
	}
	//REALIZANDO SOBRECARGA DE MÉTODOS 
	public void init(String nome, String cpf, double salario, String rg) {
		init(nome, cpf, salario);
		this.rg = rg;
	}
	
	//MÉTODO IMPRIMIR
	public void imprimir() {
		System.out.println("O nome do funcionário é: " + this.nome);
		System.out.println("O cpf do funcionário é: " + this.cpf);
		System.out.println("O sálario do Funcionário é: " + this.salario + " (R$)");
		System.out.println("O RG do Funcionário é: " + this.rg);
	}
	
	//MÉTODOS GETTERS AND SETTERS
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	public void setRG(String rg) {
		this.rg = rg;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public String getCpf() {
		return this.cpf;
	}
	
	public double getSalario() {
		return this.salario;
	}
	
	public String getRg() {
		return this.rg;
	}

}
