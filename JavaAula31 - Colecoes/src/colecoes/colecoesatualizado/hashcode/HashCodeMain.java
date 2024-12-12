package colecoes.colecoesatualizado.hashcode;

public class HashCodeMain {
	public static void main(String[] args) {
		titulo();
		Smartphone celular1 = new Smartphone("14BAQ", "Samsung");
		Smartphone celular2 = new  Smartphone("14BCQ", "Apple");
		System.out.println("Verificando hashcode celular1: [" + celular1.hashCode() + "] → " + celular1.getSerialNumber());
		System.out.println("Verificando hashcode celular2: [" + celular2.hashCode() + "] → " + celular2.getSerialNumber() );
	}
	
	public static void titulo() {
		System.out.println("------------------------------------------");
		System.out.println("        Coleções Metodo Hashcode          ");
		System.out.println("------------------------------------------");
	}

}
