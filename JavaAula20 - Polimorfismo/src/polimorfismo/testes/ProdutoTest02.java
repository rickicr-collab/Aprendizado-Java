package polimorfismo.testes;

import polimorfismo.dominio.Celular;
import polimorfismo.dominio.Computador;
import polimorfismo.dominio.Produto;
import polimorfismo.dominio.Televisao;
import polimorfismo.servico.CalculadoraImposto;

public class ProdutoTest02 {
    public static void main(String[] args) {
	Produto produto1 = new Computador("MacBook Air 2700", 12000);
	Produto produto2 = new Celular("Samsung Galaxy s24", 9500);
	Produto produto3 = new Televisao(" Televisão Philco", 5500);
	System.out.println("Nome: " + produto1.getNome());
	System.out.println("Valor: " + produto1.getValor());
	System.out.println("-----------------------------");
	System.out.println("Nome: " + produto2.getNome());
	System.out.println("Valor: " + produto2.getValor());
	System.out.println("-----------------------------");
	System.out.println("Nome: " + produto3.getNome());
	System.out.println("Valor: " + produto3.getValor());
	System.out.println("-----------------------------");
	CalculadoraImposto.calcularImposto(produto3);
	CalculadoraImposto.calcularImposto(produto1);
	CalculadoraImposto.calcularImposto(produto2);
	
    }

}
