package polimorfismo.testes;

import polimorfismo.classes.Gerente;
import polimorfismo.classes.RelatorioPagamento;
import polimorfismo.classes.Vendedor;

public class PolimorfismoTeste {

	public static void main(String[] args) {
		// CRIADO E INSTANCIADO OBJETOS DE CLASSE
		Gerente g = new Gerente("Ricardo", 5000, "Gerente", "9432", 2000);
		Vendedor v = new Vendedor("Fabiana", 2500, "Atendente", "3325", 20000);
		RelatorioPagamento relatorio = new RelatorioPagamento();
		// GERANDO OS DADOS DE RELATOIRO EM TELA DAS SUBCLASSES 
		System.out.println("<<<< Dados impressos ná tela!>>>>");
		relatorio.relatorioPagamentoGenerico(v);
		relatorio.relatorioPagamentoGenerico(g);;
		System.out.println("#########################");
		
		
		
	
		
		
		
		
		
		

	}

}
