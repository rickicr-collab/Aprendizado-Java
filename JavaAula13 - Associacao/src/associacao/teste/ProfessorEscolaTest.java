package associacao.teste;

import associacao.classes.Escola;
import associacao.classes.Professor;

public class ProfessorEscolaTest {

	public static void main(String[] args) {
		Professor professor1 = new Professor("Jiraya - Sensei");
		Professor professor2 = new Professor("Kakashi - sensei");
		Professor[] professores = new Professor[] {professor1, professor2};
		Escola escola = new Escola("Konohagakure", professores);
		escola.imprime();

	}

}
