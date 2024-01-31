package classes;
	
	/*
	 * METODOS SET: ESTÃO DECLARANDO OS VALORES E ATRIBUINDO AS 
	 * VARIAVEIS DA CLASSE QUE ESTÃO PRIVADAPOR ISSO PRECISA DE 
	 * PARAMENTROS PARA RECEBER AO CHAMAR O MÉTODO 
	 * 
	 * METODOS GET: ESTÃO BUSCANDO UM VALOR QUE FOI ATRIBUIDO 
	 * PREVIAMENTE POR ISSO PRECISAM DE UM RETORNO.
	 */

public class Estudante {
	//ATRIBUIDO OS ATRIBUTOS 
	private String nome;
	private int idade;
	private double[] notas;
	private boolean situacao;
	
	//CRIANDO OS METODOS 
	public void imprimiDados() {
		System.out.println("----- Dados do Estudante -----");
		System.out.println("Nome do Aluno: " + this.nome);
		System.out.println("Idade do Aluno: " + this.idade + " Anos de idade.");
		if(this.notas != null) {
			for(double nota: this.notas) {
				System.out.println("Notas: " + nota);
			}
		}
	}
	
	public void mediaAluno() {
		if(this.notas == null) {
			System.out.println("O aluno não possue notas!!");
			return;
		}
		double media = 0;
		for(double nota: this.notas) {
			media += nota;
		}
		media = media / this.notas.length;
		System.out.println("A média do aluno é: " + media);
		if (media > 6) {
			this.situacao = true;
			System.out.println("Aluno Aprovado!!");
		}else if (media <= 6) {
			this.situacao = false;
			System.out.println("Reprovado!!");
		}
	}
	
	//METODOS GETTERS AND SETTERS 
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setIdade(int idade) {
		if(idade <= 0) {
			System.out.println("Erro! Ação indisponivel.");
			return;
		}
		this.idade = idade;
	}

	public void setNotas(double[] notas) {
		this.notas = notas;
	}
	
	
	
	public String getNome() {
		return this.nome;
	}
	
	public int getIdade() {
		return this.idade;
	}
	
	public double[] getNotas() {// QUANDO É ARRAY TEM QUE DECLARAR O ARRAY NO TIPO DE RETORNO
		return this.notas;
	}
	
	public boolean isSituacao() {
		return this.situacao;
	}
}
