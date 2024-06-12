package modificadorstatico.testes;

import modificadorestatico.domain.CarroLimitador;

public class CarroLimitadorTest {

	public static void main(String[] args) {
		tituloGerador();
		CarroLimitador c1 = new CarroLimitador("Porshe", 280);
		CarroLimitador c2 = new CarroLimitador("BMW", 275);
		CarroLimitador c3 = new CarroLimitador("Skyline", 320);
		CarroLimitador.setVelocidadeLimite(180);
		c1.imprime();
		c2.imprime();
		c3.imprime();

	}
	
	public static void tituloGerador() {
		System.out.println("-----------------------------------------------------");
		System.out.println("              Modificador Estatico                   ");
		System.out.println("-----------------------------------------------------");
	}

}
