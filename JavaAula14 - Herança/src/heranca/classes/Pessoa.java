package heranca.classes;
/*
 * TRABALHANDO COM HERANÇA E SUAS PROPRIEDADES
 * A PARTIR DO MOMENTO QUE VOCE UTILIZA A PALAVRA RESERVADA
 * EXTENDS PAA DENTRO DA CLASSE QUE HERDARÁ INFORMAÇÕES DA SUPER CLASSE
 * TODOS OS ATRIBUTOS E MÉTODOS PODERAM SÉR USADAS PELA SUBCLASSE
 * OBS: NÃO EXISTE HERANÇA MULTIPLA NO JAVA APENAS UM UNICA CLASSE 
 * PODE SER ATRIBUIDA A HERANÇA CASO ISSO OCORRA DARA ERRO DE COMPILAÇAO  
 * E EXECUÇÃO.
 * OBS1: UTILIZANDO O MODIFICADOR DE ATRIBUTO PROTECTED VOCE CONSEGUE ACESSAR O ATRIBUTO EM CLASSES 
 * DO MESMO PACOTE E FORA DO PACOTE APENAS COM CLASSES FILHA DA SUPER CLASSE 
 * OBS2: CLASSE FUNCIONARIO 2  POR EXEMPLO EM OUTRO PACOTE CRIADA COM INTUITO DE MOSTRA QUE É POSSIVEL ACESSAR 
 * OS ATRIBUTOS DA SUOER CLASSE MESMO QUE A CLASSE ESTEJA EM OUTRO PACOTE 
 * NO ENTANTO A CLASSE TEM QUE SER FILHA DA SUPER CLASSE 
 * 
 * OBS3: CONSTRUTORES UTILIZANDO HERANÇA CADA ARGUMENTO DE ATRIBUTO QUE VOCE PASSAR 
 * NA SUPER CLASSE AO CONSTRUIR O CONSTRUTOR SE´RA NECESSARIO PASSAR O MESMO ARGUMENTO
 * NA CLASSE FILHA QUE SE ESTÁ EXTENDENDO A HERANÇA CASO CONTRARIO IRÁ GERAR UM ERRO DE COMPILAÇÃO E EXECUÇÃO
 * 
 */

public class Pessoa {
	protected String nome;
	protected String cpf;
	protected String rg;
	protected Endereco endereco;
	
	
	
	public Pessoa(String nome) {
		System.out.println("Dentro do construtor Pessoa");
		this.nome = nome;
	}
	
	static{
		System.out.println("Bloco de Inicialização Estático de Pessoa");
	}
	
	{
		System.out.println("Bloco de Inicialização 1 ");
	}
	{
		System.out.println("Bloco de Inicialização 2 ");
	}
	

	
	public void imprimir() {
		System.out.println("----------------------------");
		System.out.println("O nome do Funcionário é: " + this.nome );
		System.out.println("O cpf do Funcionário e: " + this.cpf);
		System.out.println("O rg do Funcionário e: " + this.rg);
		System.out.println("Endereço do Funcionário: " + this.endereco.getRua() + "\nBairro: " + this.endereco.getBairro());
		
	}
	

	//METODOS GETTERS AND SETTERS
	public String getNome() {
		return nome;
	}
	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	
	

}
