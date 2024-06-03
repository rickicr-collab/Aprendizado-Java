package testes;

import classesmetodos.Funcionario;

public class FuncionarioTeste {

	public static void main(String[] args) {
		tituloGerador();
		Funcionario f = new Funcionario();
		f.nome = "Ricardo";
		f.idade = 33;
		f.salario = new double[] {987.56, 1500, 1300};
		f.imprime();
		
		
		
	}
	
	public static void tituloGerador() {
		System.out.println("------------------------------------------");
		System.out.println("           Exercicio - Métodos            ");
		System.out.println("------------------------------------------");
	}

}