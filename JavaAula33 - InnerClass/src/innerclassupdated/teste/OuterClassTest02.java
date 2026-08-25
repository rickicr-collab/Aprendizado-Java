package innerclassupdated.teste;

public class OuterClassTest02 {
	private String name = "Ichigo Kurosaki";
	static class Nested{
		private String nameWife = "Orihime";
		void print() {
			System.out.println(new OuterClassTest02().name + " e " + nameWife);
		}
		
	}
	public static void main(String[] args) {
		titulo();
		new Nested().print();
		
	}
	
	public static void titulo() {
		System.out.println("-----------------------------------------");
		System.out.println("        <<< Static Inner Class >>>");
		System.out.println("-----------------------------------------");
	}

}
