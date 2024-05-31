package teste;

import classes.dominio.Pessoa;

public class PessoaTest {

	public static void main(String[] args) {
		tituloGerador();
		Pessoa p = new Pessoa();
		p.nome = "Ricardo";
		p.idade = 33;
		p.sexo = "Masculino";
		
		System.out.println(" A pessoa de nome: [" + p.nome + "]\n Tem idade de: [" + p.idade + " anos]\n do sexo: [" + p.sexo + "]");

	}
	
	public static void tituloGerador() {
		System.out.println("------------------------------------------------------");
		System.out.println("      Introdução a Classe (orientação a objetos)      ");
		System.out.println("------------------------------------------------------");
	}

}
