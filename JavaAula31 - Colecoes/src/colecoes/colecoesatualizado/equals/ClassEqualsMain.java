package colecoes.colecoesatualizado.equals;

public class ClassEqualsMain {
	public static void main(String[] args) {
		titulo();
		Smartphone celular1 = new Smartphone("14BCQ", "Samsung");
		Smartphone celular2 = celular1;
		
		System.out.println("Resultado: " + celular1.equals(celular2));
		
	}
	
	public static void titulo() {
		System.out.println("-----------------------------------");
		System.out.println("      Coleções Classe Equals       ");
		System.out.println("-----------------------------------");
	}

}
