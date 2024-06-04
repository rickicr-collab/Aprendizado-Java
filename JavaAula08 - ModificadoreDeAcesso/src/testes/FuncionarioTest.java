package testes;

import classes.Funcionario;

public class FuncionarioTest {

	public static void main(String[] args) {
		tituloGerador();
		Funcionario f = new Funcionario();
		f.setNome("Ricardo Cunha Rosendo");
		f.setIdade(33);
		f.setSalario(new double[] {1975, 1600.50, 2500});
		f.imprime();

	}
	
	private static void tituloGerador() {
		System.out.println("-----------------------------------------------------");
		System.out.println("            Modificadores de Acesso"                  );
		System.out.println("-----------------------------------------------------");
	}

}
