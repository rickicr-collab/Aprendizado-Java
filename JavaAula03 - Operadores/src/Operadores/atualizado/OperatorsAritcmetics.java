package Operadores.atualizado;

public class OperatorsAritcmetics {

	public static void main(String[] args) {
		tituloGerador();
		System.out.println("Operadores - 01 ( operadores Aritmeticos )");
		int numero1 = 100;
		int numero2 = 300;
		operadoresAritmeticos(numero1, numero2);
		System.out.println("------------------------------------");
		System.out.println("Operadores - 02 (Operador de resto)");
		int resto = 20 % 2;
		System.out.println("Resultado do resto: " + resto);
		System.out.println("------------------------------------");
		System.out.println("Operadores - 03 (operadores de Comparação)");
		int num1 = 10;
		int num2 = 200;
		operadoresDeComparacao(num1, num2);
		System.out.println("--------------------------------------");
		System.out.println("Operadores - 04 ( Operadores Lógicos) ");
		System.out.println("<<<Exemplo 01>>>");
		int idade = 35;
		float salario = 3500F;
		boolean isDentroDaLei = idade > 30 && salario > 4612;
		boolean isDentroDalei2 = idade > 30 || salario > 4612;
		System.out.println("isDentroDaLei: " + isDentroDaLei);
		System.out.println("isDentroDaLei2: "+ isDentroDalei2);
		System.out.println("<<<Exemplo 02>>>");
		double valorTotalContaCorrente = 200;
		double valorTotalContaPoupanca = 10000;
		float valorPlaystationCinco = 5000F;
		boolean isPlaystationCincoCompravel = valorTotalContaCorrente > valorPlaystationCinco || valorTotalContaPoupanca > valorPlaystationCinco;
		System.out.println( "É possivel comprar um playstation cinco: " + isPlaystationCincoCompravel);
		System.out.println("-----------------------------------------");
		System.out.println("Operadores - 05 (Operdaores de atribuição)");
		System.out.println("<<<Exemplo 01>>>");
		double bonus = 1800;
		double bonusRetirado = bonus-=300; 
		double bonusSoma = bonus += 1000;
		System.out.println("Bonus somado: " + bonusSoma);
		System.out.println("Bonus retirado: " + bonusRetirado);
		System.out.println("<<<Exemplo 02>>>");
		int contador = 1;
		contador++;
		--contador;
		System.out.println("Contador Atualizado: " + contador);
		
		
	
		
		

	}
	public static void tituloGerador() {
		System.out.println("------------------------------------------------------");
		System.out.println("          Trabalhando com Operadores                  ");
		System.out.println("------------------------------------------------------");
	}
	
	public static void operadoresAritmeticos(int num01 , int num02) {
		System.out.println("<<<< Resultado das operações aritumeticas dos valores>>>>");
		double resultadoSoma = num01 + num02;
		double resultadoSubtracao = num01 - num02;
		double resultadoMultiplicacao = num01 * num02;
		double resultadoDivisao = num01 / (double) num02;
		System.out.println("Resultado Soma: " + resultadoSoma);
		System.out.println("Resultado Subtração: " + resultadoSubtracao);
		System.out.println("Resultado Multiplicação: " + resultadoMultiplicacao);
		System.out.println("Resultado Divisão: " + resultadoDivisao);
	}
	
	public static void operadoresDeComparacao(int num01, int num02) {
		boolean isDezMaiorQueVinte = num01 > num02;
		boolean isDezMenorQueVinte = num01 < num02;
		boolean isDezIgualVinte = num01 == num02;
		boolean isDezDiferenteVinte = num01 != num02;
		System.out.println("isDezMaiorQueVinte: " + isDezMaiorQueVinte);
		System.out.println("isDezMenorQueVInte: " + isDezMenorQueVinte);
		System.out.println("isDezIgualVinte: " + isDezIgualVinte);
		System.out.println("isDezDiferenteVinte: " + isDezDiferenteVinte);
	}


}
