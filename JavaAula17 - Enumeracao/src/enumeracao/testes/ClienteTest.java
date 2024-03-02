package enumeracao.testes;

import enumeracao.classes.Cliente;
import enumeracao.classes.TipoCliente;

public class ClienteTest {

	public static void main(String[] args) {
		Cliente cliente = new Cliente("Ricardo", TipoCliente.PESSOA_FISICA, Cliente.TipoPagamento.APRAZO);
		Cliente cliente2 = new Cliente("Anna", TipoCliente.PESSOA_JURIDICA, Cliente.TipoPagamento.AVISTA);
		System.out.println("testando GetID:" + TipoCliente.PESSOA_FISICA.getID());
		System.out.println("Testando GetID:" + TipoCliente.PESSOA_JURIDICA.getID());
		System.out.println(cliente);
		System.out.println(cliente2);

	}

}