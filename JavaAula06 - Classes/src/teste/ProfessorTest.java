package teste;

import classes.Professor;

public class ProfessorTest {
	public static void main(String[] args) {
		Professor p = new Professor();
		
		//OBJETO P
		p.nome = "Ricardo";
		p.matricula = "1804";
		p.rg = 123456;
		p.cpf = "123456789-10";
		
		// OBJETO CHAMADO P2
		Professor p2 = new Professor();
		
		p2.nome = "Priscila";
		p2.matricula = "2511";
		p2.rg = 654321;
		p2.cpf = "987654321-01";
		
		
		
		//IMPRIMINDO OS DADOS DOS OBJETOS EM TELA 
		System.out.println("Imprimindo dados na tela");
		System.out.println("-----------");
		System.out.println("Dados p:");
		System.out.println("Nome do Professo: " + p.nome);
		System.out.println("Matricula do Professor: " + p.matricula);
		System.out.println("Rg do Professor: " + p.rg);
		System.out.println("CPF dos Professor: " + p.cpf);
		System.out.println("-----------");
		System.out.println("Dados p2:");
		System.out.println("Nome do Professo: " + p2.nome);
		System.out.println("Matricula do Professor: " + p2.matricula);
		System.out.println("Rg do Professor: " + p2.rg);
		System.out.println("CPF dos Professor: " + p2.cpf);
	}

}
