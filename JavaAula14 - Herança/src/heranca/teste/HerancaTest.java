package heranca.teste;

import heranca.classes.Endereco;
import heranca.classes.Funcionario;
import heranca.classes.Pessoa;

public class HerancaTest {

	public static void main(String[] args) {
		Pessoa pessoa = new Pessoa("Ricardo");
		Endereco end = new Endereco();
		pessoa.setCpf("051.132.574-60");
		pessoa.setRg("963287-6");
		end.setRua("Rua Primeira");
		end.setBairro("Rio de Janeito");
		pessoa.setEndereco(end);
		pessoa.imprimir();
		System.out.println("------------------------------------");
		Funcionario f = new Funcionario("Joana", 15000);
		f.setCpf("055.333.222-10");
		f.setEndereco(end);
		f.imprimir();
		
		

		

	}

}
