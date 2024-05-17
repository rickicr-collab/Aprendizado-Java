package innerclass.test;


public class InnerClassTest {
		private String nome = "Ricardo Cunha";
		
		class Interna{
			public void verClasseExterna() {
				System.out.println("Resultado: " + nome);
				System.out.println("Resultado do this: " + this);
				System.out.println("Resultado correto do this: " + InnerClassTest.this.nome);
			}
		}


	public static void main(String[] args) {
		tituloGerador();
		System.out.println("<<<Primeira forma de trabalhar com classes internas>>>");
		InnerClassTest classeExterna = new InnerClassTest();
		InnerClassTest.Interna interna = classeExterna.new Interna();
		interna.verClasseExterna();
		System.out.println("----------------------------------------------------");
		System.out.println("<<<Segunda forma de trabalhar com classes internas>>>");
		InnerClassTest.Interna inter = new InnerClassTest().new Interna();
		inter.verClasseExterna();
		System.out.println("----------------------------------------------------");
		
		
	}
	
	public static void tituloGerador() {
		System.out.println("----------------------------------------------------");
		System.out.println("            Introdução a Classes Aninhadas          ");
		System.out.println("----------------------------------------------------");
	}

}


