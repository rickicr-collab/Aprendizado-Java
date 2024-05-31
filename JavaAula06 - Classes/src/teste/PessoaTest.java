package teste;

import classes.dominio.Pessoa;

public class PessoaTest {

	public static void main(String[] args) {
		tituloGerador();
		Pessoa p = new Pessoa();
		p.nome = "Ricardo";
		p.idade = 33;
		p.sexo = "Masculino";
		System.out.println("A pessoa de nome: [" + p.nome + "]\nTem idade de: [" + p.idade + " anos]\nSexo: [" + p.sexo + "]");
		System.out.println("--------------------------------------");
		 
		
	

	}
	
	public static void tituloGerador() {
		System.out.println("------------------------------------------------------");
		System.out.println("      Introdução a Classe (orientação a objetos)      ");
		System.out.println("------------------------------------------------------");
	}

}
