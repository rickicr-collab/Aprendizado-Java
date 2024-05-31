package Controledefluxo.atualizado;

public class StructureOfCondictions02 {

	public static void main(String[] args) {
		tituloGerador();
		calcularCategoria(16, "Ricardo");
		calcularCategoria(25, "Priscila");
		calcularCategoria(13, "Marcos");

	}
	
	
	
	
	
	public static void tituloGerador() {
		System.out.println("--------------------------------------------------");
		System.out.println("         Estruturas de Condição                   ");
		System.out.println("--------------------------------------------------");
		System.out.println("<<< Estruturas multicondicionais - else if");
	}
	
	public static void calcularCategoria(int idade, String nome) {
		System.out.println("<<< Resultado de Análise de Categorias >>>");
		String informacao= "";
		if(idade <= 15) {
			informacao = "O jogador: " + nome + " Pertence a → Categoria Infantil";
		}else if(idade >= 15 && idade < 18) {
			informacao = "O jogador: " + nome + " Pertence a → Categoria Juvenil";
		}else {
			informacao = "O jogador: " + nome + " Pertence a → Categoria Adulto";
		}
		System.out.println(informacao);
	}

}
