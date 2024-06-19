package polimorfismo.classes;



public abstract class Funcionario  {
	protected String nome;
	protected double salario;
	protected String cargo;
	protected String matricula;
	
	
	
	
	// CONSTRUTOR
	public Funcionario(String nome, double salario, String cargo, String matricula) {
		this.nome = nome;
		this.salario = salario;
		this.cargo = cargo;
		this.matricula = matricula;
	}
	

	
	//MÉTODOS E SOBRECARGAS 
	@Override
	public String toString() {
		return "Funcionario [nome=" + nome + ", salario=" + salario + ", cargo=" + cargo + ", matricula=" + matricula
				+ "]";
	}


	public abstract void calcularPagamento();
	
	// MÉTODOS GETTERS AND SETTERS 
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}


	public String getCargo() {
		return cargo;
	}


	public void setCargo(String cargo) {
		this.cargo = cargo;
	}


	public String getMatricula() {
		return matricula;
	}


	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	
	

}
