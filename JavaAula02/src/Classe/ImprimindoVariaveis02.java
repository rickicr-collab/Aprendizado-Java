package Classe;

public class ImprimindoVariaveis02 {
	// TIPOS PRIMITIVOS PRINCIPAIS 
	public static void main(String[] args) {
		int idade = 10;
		double salarioDouble = 3000;
		float salarioFloat = 3.0f;
		byte idadeByte = 12;
		short idadeShort = 32767;
		boolean verdadeiro = true;
		boolean falso = false;
		long numeroGrande = 1000L;
		char caractere = 'c'; 	/*
									POSSUI ALOCAÇÃO DE APENAS 2BYTES
									PODENDO TAMBEM TRABALHAR COM VALORES 
									DA TABELA UNICODE 
		 						*/
		// IMPRIMINDO VARIAVEIS COM OS PRINCIPAIS TIPOS PRIMITIVOS COM CONCATENAÇÃO
		System.out.println(" ---- Imprimindo dados em tela ---- ");
		String nome = "Ricardo";
		System.out.println(nome + " de Idade " + idade);
		System.out.println("Imprimindo valor double : " + salarioDouble);
		System.out.println("Imprimindo valor float : " + salarioFloat);
		System.out.println("Imprimindo valor byte : " + idadeByte);
		System.out.println("Imprimindo valor Short : " + idadeShort);
		System.out.println("Imprimindo valor boolean : " + verdadeiro);
		System.out.println("imorimindo valor boolean : " + falso);
		System.out.println("Imprimindo valor Numero Longo : " + numeroGrande);
		System.out.println("Imprimindo valor caracterer : " + caractere);
		
		
		
		

	}

}
