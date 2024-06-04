package testes;

import classesmetodos.Pessoa;

public class PessoaTest {

	public static void main(String[] args) {
		tituloGerador();
		Pessoa p1 = new Pessoa();
		p1.setNome("ricardo");
		p1.setIdade(33);
		p1.imprime();

	}
	
	private static void tituloGerador() {
		System.out.println("--------------------------------------------------------");
		System.out.println("          Introdução a Modificadores de Acesso          ");
		System.out.println("--------------------------------------------------------");
	}

}
