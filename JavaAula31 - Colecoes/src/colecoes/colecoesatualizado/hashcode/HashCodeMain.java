package colecoes.colecoesatualizado.hashcode;

public class HashCodeMain {
	public static void main(String[] args) {
		titulo();
		SmartPhone celular1 = new SmartPhone("14BAQ", "Samsung");
		SmartPhone celular2 = new  SmartPhone("14BCQ", "Apple");
		System.out.println("Verificando hashcode celular1: [" + celular1.hashCode() + "] → " + celular1.getSerialNumber());
		System.out.println("Verificando hashcode celular2: [" + celular2.hashCode() + "] → " + celular2.getSerialNumber() );
	}
	
	public static void titulo() {
		System.out.println("------------------------------------------");
		System.out.println("        Coleções Metodo Hashcode          ");
		System.out.println("------------------------------------------");
	}

}
