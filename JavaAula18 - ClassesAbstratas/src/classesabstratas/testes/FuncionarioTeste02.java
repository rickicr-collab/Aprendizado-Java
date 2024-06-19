package classesabstratas.testes;

import classeabstratas.dominio.Desenvolvedor;
import classeabstratas.dominio.Funcionario;
import classeabstratas.dominio.Gerente;

public class FuncionarioTeste02 {
    public static void main(String[] args) {
	Gerente g1 = new Gerente("Priscila", 5000);
	Desenvolvedor d1 = new Desenvolvedor("Marcelo", 6000);
	Funcionario funcionario1;
	System.out.println("----------------------------");
	System.out.println(g1);
	System.out.println(d1);
	System.out.println("----------------------------");
	g1.imprime();
	d1.imprime();
	

    }
    
    
}
