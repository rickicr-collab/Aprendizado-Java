package genericsupdated.teste;

abstract class Animal{
	public abstract void consulta();
}

class Cachorro extends Animal{

	@Override
	public void consulta() {
		System.out.println("Consultando cachorro");	
	}
}

class Gato extends Animal{

	@Override
	public void consulta() {
		System.out.println("Consultando gato");
	}
}



public class WildCards01 {
	public static void main(String[] args) {
		titulo();
		Cachorro[] cachorros = {new Cachorro(), new Cachorro()};
		Gato[] gatos = {new Gato(), new Gato()};
		
		imprimirConsulta(cachorros);
		imprimirConsulta(gatos);
	}
	
	public static void imprimirConsulta(Animal[] animal) {
		
		for(Animal animais: animal) {
			animais.consulta();
		}
	}
	
	public static void titulo() {
		System.out.println("------------------------------------");
		System.out.println("   <<< Generics / WildCards >>>");
		System.out.println("------------------------------------");
	}

}
