package polimorfismo.servico;

import polimorfismo.dominio.Celular;
import polimorfismo.dominio.Produto;

public class CalculadoraImposto {

    public static void calcularImposto(Produto produto) {
	System.out.println(" <<< Relatório Produto >>>");
	double imposto = produto.calcularImposto();
	System.out.println("Produto nome: " + produto.getNome());
	System.out.println("Produto valor: [R$ " + produto.getValor() + "]");
	System.out.println("Produto Imposto: " + imposto);
	if(produto instanceof Celular) {
	    System.out.println("Produto Data de Fabricação: " + ((Celular) produto).getDataFabricacao());
	}
	System.out.println("---------------------------------");
    }

}
