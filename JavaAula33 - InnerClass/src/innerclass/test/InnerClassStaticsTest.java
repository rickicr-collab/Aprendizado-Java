package innerclass.test;



class Externa{
	private final static String nome = "Ricardo Rosendo";
	private final static String message = "Oi";
	static class Interna{
		public void imprimir() {
			System.out.println("Nome: " + nome);
			System.out.println("Mensagem: " + message);
		}
	}
}


public class InnerClassStaticsTest {
	public static void main(String[] args) {
		tituloGerador();
		System.out.println("Exemplo 01");
		Externa.Interna teste = new Externa.Interna();
		teste.imprimir();
		System.out.println("-----------------------");
		System.out.println("Exemplo 02");
		Interna2 teste2 = new Interna2();
		teste2.imprimir();

	}
	
	public static void tituloGerador() {
		System.out.println("----------------------------------------------------");
		System.out.println("       Trabalhando com Classes Estaticas            ");
		System.out.println("----------------------------------------------------");
	}
	
	static class Interna2{
		public void imprimir() {
			System.out.println("Oi dentro do Interna2  !!!!");
			System.out.println("Mensagem dentro do Interna2 !!!!");
		}
	}

}
