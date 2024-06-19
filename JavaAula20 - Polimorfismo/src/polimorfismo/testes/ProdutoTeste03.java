package polimorfismo.testes;

import polimorfismo.dominio.Celular;
import polimorfismo.dominio.Computador;
import polimorfismo.dominio.Produto;
import polimorfismo.dominio.Televisao;
import polimorfismo.servico.CalculadoraImposto;

public class ProdutoTeste03 {
    public static void main(String[] args) {
	Produto produto = new Computador("MacBook Air", 13000);
	Produto Televisao = new Televisao("TV Samsung 70", 8500);
	Celular celular = new Celular("Samsung Galaxy S24", 6500);
	celular.setDataFabricacao("15 / 10/ 2023");
	CalculadoraImposto.calcularImposto(celular);
	CalculadoraImposto.calcularImposto(produto);
	CalculadoraImposto.calcularImposto(Televisao);
	
    }

}
