package Classes;

public class Exemplo02 {
	// EXEMPLO DE USOS PARA OPERADOR TERNÁRIO ( MAIS NÃO É RECOMENDADO)

	public static void main(String[] args) {
		int idade = 17;
		String status;
		
		//APLICANDO OPERADORES TERNARIOS ANINHANDOS A OUTROS OPERADORES TERNÁRIOS 
		System.out.println(" ---- Imprimindo dados em Tela ----- ");
		System.out.println("Exemplo de Operacoes de contrrole de fluxo Ternário ");
		status = idade < 15? "Status: Infantil": idade >= 15 && idade < 18 ? "Status : Juvenil": "Status: Adulto";
		System.out.println(status);
	}

}
