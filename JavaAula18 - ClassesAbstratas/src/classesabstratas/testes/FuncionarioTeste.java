package classesabstratas.testes;


import classesabstratas.classes.Gerente;
import classesabstratas.classes.Vendedor;

public class FuncionarioTeste {

	public static void main(String[] args) {
		Gerente g = new Gerente(" priscila", " 6657-2", 4000);
		Vendedor v = new Vendedor(" Ricardo", " 7558-3", 2000, 5000);
		g.calcularSalario();
		v.calcularSalario();
		System.out.println("<<<<<Imprimindo dados em Tela>>>>>");
		System.out.println(v);
		System.out.println(g);

	}

}
