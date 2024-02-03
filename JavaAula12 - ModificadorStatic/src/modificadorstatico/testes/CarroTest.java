package modificadorstatico.testes;

import modificadorstatico.classes.Carro;

public class CarroTest {
	

	public static void main(String[] args) {		
		Carro a = new Carro("Fusca", 280);
		Carro b = new Carro("Ferrari", 275);
		Carro c =  new Carro("Chevrolet", 290);
		
		a.imprimir();
		b.imprimir();
		c.imprimir();
		
		
		System.out.println("#######################");
		
		//ALTERANDO O VALOR DA VARIAVEL VELOCIDADE LIMITE USANDO MÉTODO SET
		Carro.setVelocidadeLimite(220);
		
		a.imprimir();
		b.imprimir();
		c.imprimir();

	}

}
