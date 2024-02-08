package heranca.classes;

public class Funcionario extends Pessoa {
	
	private double salario;
	
	{
		System.out.println("Dentro do Bloco de Inicialização de Funcionarios 1");
	}
	{
		System.out.println("Dentro do Bloco de Inicialização de Funcionarios 2");
	}
	static{
		System.out.println("Dentro do Bloco de Inicialização Estático de Funcionários ");
	}
	
	public Funcionario(String nome, double salario) {
		super(nome);
		this.salario = salario;
		System.out.println("Dentro do construtor de Funcionário ");
	}
	
	public void imprimir() {
		super.imprimir();
		System.out.println("O sálario do funcionario é: " + this.salario);
		imprimirReciboPagamento();
	}
	
	public void imprimirReciboPagamento() {
		System.out.println("Eu " + super.nome + " Recebi o pagamento de : " + this.salario + " R($)");
	}
	

	//MÉTODOS GETTERS AND SETTERS
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	

}
