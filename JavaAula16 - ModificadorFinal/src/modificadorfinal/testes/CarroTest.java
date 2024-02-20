package modificadorfinal.testes;

import modificadorfinal.classes.Carro;


public class CarroTest {

	public static void main(String[] args) {
		Carro c = new Carro();
		c.setNome("Corola");
		c.setMarca("Toyota");
		System.out.println("Imprimindo dados em tela");
		c.getComprador().setNome("Kuririm");
		c.getComprador().setMarca("Dragon Ball");
		System.out.println(c.getComprador());
		c.imprime();
		
		
		
		

	}

}
