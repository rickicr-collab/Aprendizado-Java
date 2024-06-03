package testes;

import classesmetodos.Estudante;
import classesmetodos.EstudanteNovo;


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
		
		System.out.println("------------------------------------------");
		
		EstudanteNovo estudante01 = new EstudanteNovo();
		EstudanteNovo estudante02 = new EstudanteNovo();
		
		estudante01.nome = "Midoryia";
		estudante01.idade = 25;
		estudante01.sexo = "Masculino";
		estudante01.imprime();
		estudante02.nome = "Sakura";
		estudante02.idade = 20;
		estudante02.sexo = "Feminino";
		estudante02.imprime();
	
		
	

	}

}
