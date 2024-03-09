package polimorfismo.classes;

/*
 * TRABALHANDO COM POLIMORFISMO 
 * PART 01
 * NO POLIMORFISMO PODEMOS CRIAR VARIAVEIS DE INSTANCIA DE SUPER CLASSE ONDE 
 * A MESMAS PODEM REFERENCIAR UM OBJETO DE UMA SUB CLASSE 
 * PARA QUE OS MÉTODOS E ATRIBUTOS DAS MESMAS POSSAM SEM ACESSADOS 
 * ATRAVES DA SUPERCLASSE ATRAVES DOS OBJETOS INSTACIADOS DAS SUBCLASSES
 * ACESSANDO DIRETAMENTE OS ATRIBUTOS É MÉTODOS CONTINDO NAS SUBCLASSSE 
 * HERDADAS.
 * 
 * PART 02
 * SE TEM A OPÇÃO DE USAR A FUNCÇÃO RESERVADA INSTANCEOF 
 * QUE INSTANCIA UM CLASSE A OUTRA CASO OS VALORES SEJAM ACEITAVEIS NA CONDIÇÃO PROPOSTA. 
 * DEVIDO A FUNÇÃO INSTANCE OF VC TRABALHA COM PARAMETROS POLIMORFICOS 
 * 
 * PART 03
 * OBS1: OUTRA VANTAGEM DO POLIMORFISMO É USO PARA CLASSES ORIENTADAS A INTERFACE.
 * OBS2: PODE SE USAR EM CLASSES INTERFACES DAO(DATA ACESS OBJECT
 * 
 * 
 */

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
