package blocodeinicializacao.testes;

import blocodeinicializacao.classes.Cliente;

public class ClienteTest {

	public static void main(String[] args) {
		Cliente c = new Cliente();
		System.out.println("mostrando parcelas  possiveis:");
		for(int parc: c.getParcelas()) {
			System.out.println("Parcela: " + parc + " ");
		}
	}

}
