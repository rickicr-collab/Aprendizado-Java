package associacao.teste;

import associacao.exercicio.Aluno;
import associacao.exercicio.Local;
import associacao.exercicio.Professor;
import associacao.exercicio.Seminario;

public class Exerciciotest {

	public static void main(String[] args) {
		Aluno aluno = new Aluno("Ricardo", 33);
		Aluno aluno2 = new Aluno("Joana", 25);
		Seminario sem = new Seminario("Como ser um programador");
		Professor prof = new Professor("Paulo", "Inteligencia Artificial");
		Local local = new Local(" Rua das Baraunas ", " Rio de Janeiro");
		
		aluno2.setSeminario(sem);
		aluno.setSeminario(sem);
		
		sem.setLocal(local);
		sem.setProfessor(prof);
		sem.setAlunos(new Aluno[]{aluno, aluno2});
		Seminario[] semArray = new Seminario[1];
		semArray[0] = sem;
		prof.setSeminario(semArray);
		
		sem.imprimir();
		prof.imprimir();
		aluno.imprimir();
		aluno2.imprimir();
		local.imprimir();
		
		
		
	
		
	}

}
