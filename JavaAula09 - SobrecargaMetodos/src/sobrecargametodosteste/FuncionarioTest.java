package sobrecargametodosteste;

import sobrecargametodos.classes.Funcionario;

public class FuncionarioTest {

	public static void main(String[] args) {
		Funcionario a = new Funcionario();
		
		//EXECUTANDO O METODO INIT PELA SOBRECARGA 
		System.out.println("Impimindo dados em Tela: ");
		a.init("Ricardo", "051132.574-60", 4500, "963287-6");
		a.imprimir();

	}

}
