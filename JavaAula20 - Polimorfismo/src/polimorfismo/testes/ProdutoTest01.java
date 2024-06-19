package polimorfismo.testes;

import polimorfismo.dominio.Celular;
import polimorfismo.dominio.Computador;
import polimorfismo.dominio.Televisao;
import polimorfismo.servico.CalculadoraImposto;

public class ProdutoTest01 {
    public static void main(String[] args) {
	Computador computador = new Computador("Computador DELL Aspiron", 3500);
	Celular celular = new Celular("Apple Iphone 17", 6500);
	Televisao tv = new Televisao("Televisão Samsung 50", 5500);
	CalculadoraImposto.calcularImposto(celular);
	CalculadoraImposto.calcularImposto(computador);
	CalculadoraImposto.calcularImposto(tv);
	
    }

}
