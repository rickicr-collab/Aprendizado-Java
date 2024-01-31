package testes;

import classes.Estudante;

public class EstudanteTeste {

	public static void main(String[] args) {
		//PRIMEIRO ESTUDANTE
		Estudante a = new Estudante();
		a.nome = "Ricardo";
		a.idade = 33;
		a.notas = new double[]{5, 5, 7.2};
		
		//SEGUNDO ESTUDANTE
		Estudante b = new Estudante();
		b.nome = "Priscila";
		b.idade = 28;
		b.notas = new double[]{8, 9, 9.2};
		
		
		//CHAMDNO OS MÉTODOS
		a.imprimiDados();
		a.mediaAluno();
		b.imprimiDados();
		b.mediaAluno();
		
	

	}

}
