package Variaveis.atualizado;

public class TiposPrimitivosExercicios {

	public static void main(String[] args) {
		tituloGerador();
		System.out.println("Exercicio - 01");
		// variable
		String  nome = "Ricardo";
		String endereco = "Rua ABC";
		double salario = 2000;
		String dataRecebimento = "29/05/2024";
		
		System.out.println("Eu " + nome + " que moro no endereço " + endereco + 
		" Recebi o salário de valor: " + salario +  ", na data de " + dataRecebimento);

	}
	
	public static void tituloGerador() {
		System.out.println("---------------------------------------------------");
		System.out.println("          Exercicio - Tipos Primitivos             ");
		System.out.println("---------------------------------------------------");
	}

}
