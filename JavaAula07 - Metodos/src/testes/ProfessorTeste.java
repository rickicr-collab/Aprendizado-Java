package testes;

import classes.Professor;

public class ProfessorTeste {

	public static void main(String[] args) {
		
		//INSTANCIANDO UMNOVO OBJETO CHAMADO PROF DA CLASSE PROFESSOR
		Professor prof = new Professor();
		prof.nome = "Ricardo";
		prof.cpf = "222.222.222-22";
		prof.matricula = "1804";
		prof.rg = "12345-6";
		
	
		//INSTANCIANDO UM NOVO OBJETO CHAMADO PROF2 DA CLASSE PROFESSOR
		Professor prof2 = new Professor();
		prof2.nome = "Paulo";
		prof2.cpf = "333.333.333-33";
		prof2.matricula = "2004";
		prof2.rg = "99999-9";
		
		// CHAMANDO MÉTODO IMPRIMIR DA CLASSE PROFESSOR
		System.out.println(" --- Imprimindo dados em Tela --- ");
		prof.Imprimir();
		prof2.Imprimir();
		
	}

}
