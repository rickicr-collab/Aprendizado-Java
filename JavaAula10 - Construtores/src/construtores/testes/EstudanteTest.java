package construtores.testes;

import construtores.classes.Estudante;

public class EstudanteTest {

	public static void main(String[] args) {
		Estudante estudante = new Estudante("Ricardo", "1804", new double[]{5, 4, 3}, "18.04.1991");
		estudante.imprimir();
		
	}
}