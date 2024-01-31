package testes;

import classes.Estudante;
	/*
	 * OBS: NÃO É POSSSIVEL FAZER DECLARAÇÃO DE ARRAYS
	 * FORA DA LINHA PORQUE PARA O JAVA PODE HAVER TIPOS DE AMBIGUIDADE
	 * DE ALGUNS OBJETOS DE TIPOS PRIMITIVOS DIFERENTES POR EXEMPLO
	 * WNTÃO ELE DEIXA UM FORMATO MAIS FLEXIVEL PARA INICIALIZAR UM ARRAYS INSTANCIADO
	 * EXEMPLO: A.NOTAS = NEW DOUBLE[]{1,2,3};
	 * DESSA FORMA ELE INICIALIZA E NÃO HAVERA CONFLITO DE TIPOS DIDFERENTE POIS 
	 * ESTÁRA SENDO DECLARADA COMO UM NOVO OBJETO NA LINHA 
	 * 
	 */

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
