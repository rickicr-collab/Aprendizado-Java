package associacao.exercicio;

public class Aluno {
	private String nome;
	private int idade;
	private Seminario seminario;
	
	//CONSTRUTORES E SOBRECARGAS
	public Aluno(String nome, int idade) {
		this.nome = nome;
		this.idade = idade;
	}
	
	public Aluno() {
		
	}
	
	//METODOS 
	public void imprimir() {
		System.out.println("------ Relatório do Alunos ----------" );
		System.out.println("O nome do Aluno: " + this.nome);
		System.out.println("A idade do Aluno: " + this.idade + " Anos de idade");
		if(seminario != null) {
			System.out.println("Seminário cadastrado: " + this.seminario.getTitulo());
		}else {
			System.out.println("Aluno não está cadastrado em seminários!!!");
		}
	}
	
	
	
	
	//METODOS GETTERS AND SETTERS
	
	public void setSeminario(Seminario seminario) {
		this.seminario = seminario;
	}
	
	public Seminario getSeminario() {
		return seminario;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public int getIdade() {
		return this.idade;
	}
	
}
