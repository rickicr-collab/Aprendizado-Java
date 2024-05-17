package innerclass.test;

public class LocalClassTest {
	private String nome = "Ricardo ";
	public void fazAlgumaCoisa() {
	   class Interna  {
	    	private String sobreNome = "Rosendo";
			public void imprimiNomeExterno() {
				System.out.println("Imprimindo Nome: " + LocalClassTest.this.nome);
				System.out.println("Imprimindo Sobrenome: " + this.sobreNome);
			}
		}
		Interna in = new Interna();
		in.imprimiNomeExterno();
	}
	public static void main(String[] args) {
		tituloGerador();
		LocalClassTest externa = new LocalClassTest();
		externa.fazAlgumaCoisa();
		
		

	}
	
	public static void tituloGerador() {
		System.out.println("-----------------------------------------------------");
		System.out.println(" Trabalhando com classes internas dentro de metodos  ");
		System.out.println("-----------------------------------------------------");
	}

}
