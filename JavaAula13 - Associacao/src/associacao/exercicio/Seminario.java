package associacao.exercicio;

public class Seminario {
	
	private String titulo;
	private Aluno[] alunos;
	private Professor professor;
	private Local local;
	
	
	//CONSTRUTOR E SOBRECARGA DE MÉTODOS 
	public Seminario(String titulo) {
		this.titulo = titulo;	
	}
	
	public Seminario() {
		
	}
	
	//METODOS
	public void imprimir() {
		System.out.println("------ Relatório do Seminário ----------" );
		System.out.println("Titulo: " + this.titulo);
		System.out.println("Palestrante: " + this.professor.getNome());
		if(this.local != null) {
			System.out.println("Local:" + local.getRua() + " Bairro:"+ local.getBairro());
		}else {
			System.out.println("Nenhum local Cadastrado em Seminários! ");
		}
		
		if(alunos != null && alunos.length != 0) {
			System.out.println("#Lista de Alunos#");
			for(Aluno aluno: alunos) {
				System.out.println(aluno.getNome() + ": ");
			}
			return;
		}
		System.out.println("Nenhum Aluno cadastrado!!");
	}
	
	// MÉTODOS GETTERS AND SETTERS 
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	public Professor getProfessor() {
		return professor;
	}

	public void setProfessor(Professor professor) {
		this.professor = professor;
	}

	public Local getLocal() {
		return local;
	}

	public void setLocal(Local local) {
		this.local = local;
	}

	public String getTitulo() {
		return titulo;
	}
	public Aluno[] getAlunos() {
		return alunos;
	}
	public void setAlunos(Aluno[] alunos) {
		this.alunos = alunos;
	}
}
