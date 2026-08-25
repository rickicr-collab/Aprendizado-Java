package innerclassupdated.teste;

public class InnerClassTest01 {
	
	private String name = "Monkey D. Luffy;";
	
	class Inner{
		public String imprimirAtributoDaClasseExterna() {
			return name;
		}
	}
	
	public static void main(String[] args) {
		titulo();
		 InnerClassTest01 cl = new InnerClassTest01();
		 Inner inner = cl.new Inner();
		 System.out.println(inner.imprimirAtributoDaClasseExterna());
		 Inner inner2 = new InnerClassTest01().new Inner();
		 System.out.println(inner2.imprimirAtributoDaClasseExterna());

		
	}
	
	public static void titulo() {
		System.out.println("-----------------------------------------");
		System.out.println("         <<< Inner Class >>>");
		System.out.println("-----------------------------------------");
	}

}
