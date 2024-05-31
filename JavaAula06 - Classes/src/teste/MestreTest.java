package teste;

import classes.dominio.Mestre;

public class MestreTest {

	public static void main(String[] args) {
		Mestre m =new Mestre();
		m.nome = "Tal-pai pai";
		m.idade = 40;
		m.sexo = "masculino";
		
		System.out.println("O Mestre: [" + m.nome + "]\nIdade: [" + m.idade+ "]\nSexo: [" +m.sexo+ "]");
		

	}

}
