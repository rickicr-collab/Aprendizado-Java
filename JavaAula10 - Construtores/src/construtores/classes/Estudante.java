package construtores.classes;
	/*
	 * TRABALHANDO COM SOBRECARGA DE CONSTRUTORES 
	 * OBS1: O CONSTRUTOR PADRÃO DA CLASSE NÃO POSSUI VOID AO COLOCAR 
	 * O METODO DE RETORNO DA UM ERRO DE COMPILAÇÃO
	 * OBS2: PARA CHAMAR O CONSTRUTOR DA CLASSE ESTUDANTE 
	 * USASSE A PALAVRA RESERVADA USANDO ESSE EXEMPLO THIS();
	 * SE TIVER ARGUMENTOS DEVEM SER PASSADOS NÁ ORDEM QUE FOREM COLOCADOS 
	 * NA CLASSE ORIGINAL PARA DAR ERRO DE COMPILAÇÃO.
	 * OBS3: CONSTRUTORES SÓ PODEM SER CHAMADOR DENTRO DE OUTROS
	 * CONSTRUTORES SE FOREM USADOS DENTRO DE MÉTODOS SERÁ DADO
	 * ERRO DE COMPILAÇÃO
	 */

public class Estudante {
	private String matricula;
	private String nome;
	private double[] notas;
	private String dataMatricula;
	
	// CLASSE ESTUDANTE COM SOBRECARGA
	public Estudante(String nome, String matricula, double[] notas) {
		System.out.println("---- Dados Impressos na tela ----");
		this.nome = nome;
		this.matricula = matricula;
		this.notas = notas;
	}
	
	public Estudante(String nome, String matricula, double[] notas, String dataMatricula){
		this(nome, matricula, notas);
		this.dataMatricula = dataMatricula;
	}
	
	public void imprimir() {
		System.out.println("Nome do Estudante: " +  this.nome);
		System.out.println("Matricula do Estudante: " + this.matricula);
		for(double nota: notas) {
			System.out.println("Notas do Aluno: " + nota);
		}
		System.out.println("Data da Matricula: " + this.dataMatricula);
	}
	
	
	//METODOS GETTERS E SETTERS 
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double[] getNotas() {
		return notas;
	}
	public void setNotas(double[] notas) {
		this.notas = notas;
	}

	public String getDataMatricula() {
		return dataMatricula;
	}

	public void setDataMatricula(String dataMatricula) {
		this.dataMatricula = dataMatricula;
	}
	
	
	
	
	
	
	
	
	
	

	
	
	
}
