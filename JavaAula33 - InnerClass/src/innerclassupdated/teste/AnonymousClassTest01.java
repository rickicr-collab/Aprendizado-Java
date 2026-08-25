package innerclassupdated.teste;

class Animal {
	public void walk() {
		System.out.println("Animal Walking.....");
	}
}




public class AnonymousClassTest01 {
	public static void main(String[] args) {
		titulo();
		Animal animal = new Animal() {
			@Override
			public void walk() {
				System.out.println("Walking in the shadows....");
			}
		};
		animal.walk();
		
		
		
	}
	
	public static void titulo() {
		System.out.println("-----------------------------------------");
		System.out.println("        <<< Anonymous Class >>>");
		System.out.println("-----------------------------------------");
	}

}
