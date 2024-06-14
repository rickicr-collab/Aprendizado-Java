package modificadorfinal.testes;

import modificadorfinal.classes.Carro;
import modificadorfinal.classes.Ferrari;


public class CarroTest {

	public static void main(String[] args) {
		Carro c = new Carro();
		c.setNome("Corola");
		c.setMarca("Toyota");
		System.out.println("Imprimindo dados em tela");
		c.getComprador().setNome("Kuririm");
		c.getComprador().setMarca("Dragon Ball");
		System.out.println(c.getComprador());
		c.imprimeAtributosCarros();
		System.out.println("---------------------------------------");
		Carro carro = new Carro();
		System.out.println(Carro.VELOCIDADE_FINAL);
		System.out.println(carro.COMPRADOR);
		carro.COMPRADOR.setNome("Kuririn");
		carro.COMPRADOR.setMarca("Toyota");
		System.out.println(carro.COMPRADOR);
		System.out.println("---------------------------");
		Ferrari ferrari = new Ferrari();
		ferrari.setNome("Ferrari-Tiger");
		ferrari.setMarca("Ferrari-italy");
		ferrari.setModelo("XMH");
		ferrari.setCor("Prata Frio");
		ferrari.setOpcionais("Aerofolio - MD5");
		ferrari.impressaoAtributosAdicionais();
		System.out.println("----------------------------");
		System.out.println(ferrari);
		
		
		
		

	}

}
