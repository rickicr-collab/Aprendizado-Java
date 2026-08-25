package innerclassupdated.teste;

public class OuterClassTest01 {
	
	private String name = "Uzumaki Naruto";
	
	void print() {
		class LocalClass{
			public String printarNome() {
				System.out.println("Nome: " + name);
				return name;
			}
		}
		new LocalClass().printarNome();
	}
	public static void main(String[] args) {
		titulo();
		OuterClassTest01 outerClass = new OuterClassTest01();
		outerClass.print();
		
		
	}
	
	public static void titulo() {
		System.out.println("-----------------------------------------");
		System.out.println("         <<< Outer Class >>>");
		System.out.println("-----------------------------------------");
	}

}
