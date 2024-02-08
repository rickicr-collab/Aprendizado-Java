package sobrescrita.testes;

import sobrescrita.classes.Pessoa;

public class SobrescritaTest {

	public static void main(String[] args) {
		Pessoa pessoa = new Pessoa();
		
		pessoa.setNome("Ricardo");
		pessoa.setIdade(33);
		
		System.out.println("A Pessoa de nome: " + pessoa.getNome() + " com idade: " + pessoa.getIdade());
		System.out.println(pessoa);
		pessoa.toString();
	}

}
