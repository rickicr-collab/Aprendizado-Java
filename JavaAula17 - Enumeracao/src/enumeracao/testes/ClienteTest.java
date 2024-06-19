package enumeracao.testes;

import enumeracao.classes.Cliente;
import enumeracao.classes.TipoCliente;
import enumeracao.classes.TipoPagamento;

public class ClienteTest {

	public static void main(String[] args) {
		Cliente cl1 = new Cliente("Ricardo", TipoCliente.PESSOA_FISICA, TipoPagamento.DEBITO);
		Cliente cl2 = new Cliente("Anna", TipoCliente.PESSOA_JURIDICA, TipoPagamento.CREDITO);
		System.out.println("testando GetID:" + TipoCliente.PESSOA_FISICA.getID());
		System.out.println("Testando GetID:" + TipoCliente.PESSOA_JURIDICA.getID());
		System.out.println(cl1);
		System.out.println(cl2);
		System.out.println("--------------------------------------------");
		cl1.getTipoPagamento().calcularDesconto(100, " Computador");
		cl2.getTipoPagamento().calcularDesconto(100, " Telescopio");
		System.out.println("--------------------------------------------");
		TipoCliente tipoCliente = TipoCliente.valueOf("PESSOA_FISICA");
		System.out.println(tipoCliente);
		System.out.println("--------------------------------------------");
		cl1.getTipo().setNomeRelatorio("Pessoa fisica");
		System.out.println(cl1);
		cl2.getTipo().setNomeRelatorio("Pessoa juridica");
		System.out.println(cl2);
		

	}

}