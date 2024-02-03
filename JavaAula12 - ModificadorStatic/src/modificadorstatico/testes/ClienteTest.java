package modificadorstatico.testes;

import modificadorstatico.classes.Cliente;

public class ClienteTest {

	public static void main(String[] args) {
		Cliente c = new Cliente();
		Cliente c1 = new Cliente();
		Cliente c2 = new Cliente();
	
		System.out.println("mostrando parcelas  possiveis:");
		System.out.println("tamanho: " + Cliente.getParcelas().length);
		System.out.println();
		
	}
	

} 
