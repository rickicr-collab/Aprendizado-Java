package construtores.classes;
	
	/*
	 * ESTUDO DE CONSTRUTORES
	 * PARA CRIAÇÃO DE OBJETOS FAZ O USO DE CONSTRUTRORES
	 * REGRAS:
	 * 1.TODA CLASSE QUE VOCE UTILIZAR A PALAVRA NEW JUNTAMENTE
	 * COM O NOME DA CLASSE ENTRE PARENTESES FAZ O USO DE CONSTRUTOR
	 * 2.OS CONSTRUTORES SÃO ROTINAS DE INICIALIZAÇÃO 
	 * 3.CONSTRUTOR NUNCA TERÁ RETORNO
	 * 4.POSSUI MODIFICADOR DE ACESSO , NOME DA CLASSE SEGUIDO DE PARENTESES
	 * PONTO E VIRGULA
	 * 5.O MÉTODO CONSTRUTOR DENTRO DA CLASSE PODE SER USADO PARA CRIAR REGRAS DE COMPILAÇÃO
	 * PARA SEREM ATENCIDADAS DURANTE A EXECUÇÃO 
	 * 
	 */

public class Funcionario {
	private String nome;
	private String cpf;
	private double salario;
	private String rg;
	
	//CRIANDO UM CONSTRUTOR PARA A CLASSE FUNCIONÁRIO
	//CONSTRUTOR NÃO POSSUI VOID EM SUA COMPILAÇÃO
	public Funcionario(String nome, String cpf, double salario, String rg) {
		this.nome = nome;
		this.cpf = cpf;
		this.salario = salario;
		this.rg = rg;
	}
	
	/*CRIANDO UM CONSTRUTOS PARA SOBRECARGA SEM NENHUM PARAMENTRO
	 * PARA QUE UM NOVO OBJETO CRIADO NÃO GERE ERRO DE COMPILACAO AO SER INICIADO 
	 * SEM ARGUMENTOS 
	 */
	public Funcionario() {
	}
	
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
		System.out.println(" ------ Dados Funcionario ------ ");
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
