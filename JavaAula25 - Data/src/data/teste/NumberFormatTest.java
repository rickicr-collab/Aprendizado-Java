package data.teste;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

/*
 * TRABALHANDO COM A CLASSE NUMBER FORMAT:
 * 
 * NA MESMA FORMA COMO A CLASSE DATEFORMAT A CLASSE NUMBERFORMAT TAMBEM ESTÁ NO PACOTE DO JAVA
 * E TAMBEM É UMA CLASSE ABSTRATA POR ISSO VOCÊ DEVE UTILIZAR MÉTODOS PARECIDOS COM A CLASSE 
 * DATE FORMAT.
 * 
 * ALGUMAS FORMAS DE SE TRABALHAR SÃO BEM PARECIDAS COM A CLASSE DATEFORMAT.
 * OBS: PARA CADA PAIS A UM TRATAMENTO  DE MOEDAS COM VALOR DO TIPO FLUTUANTE / FLOAT PARA ALGUNS PAISES 
 * SEUS NUMEROS SÃO DIVIDIDOS USANDO VIRGULA E PARA OUTROS USANDO PONTO.
 * 
 * FUNÇÕES DO NUMBERFORMAT:
 * GETMAXIMUNFRACTIONDIGITS() → MOSTRA OS QUANTIDADE DE VALORES SEPARADOS NAS CASAS DECIMAIS PELA VIRGULA
 * SETMAXIMUNFRACTIONDIGITS() → ALTERA A QUANTIDADE DE VALORES A SER SEPARADOS PELA VIRGULA OU PONTO.
 * SETPARSEINTEGERONLY(BOOLEAN) → 
 * 
 *  
 * 
 * 
 * 
 */

public class NumberFormatTest {

	public static void main(String[] args) {
		float valor = 123.4567f;
		Locale localJapao = Locale.JAPAN;
		Locale localFranca = Locale.FRANCE;
		Locale localItalia = Locale.ITALY;
		NumberFormat[] nfa = new NumberFormat[4];
		NumberFormat[] nfa2 = new NumberFormat[4];
		NumberFormat[] nfa3 = new NumberFormat[4];
		
		nfa[0] = NumberFormat.getInstance();
		nfa[1] = NumberFormat.getInstance(localJapao);
		nfa[2] = NumberFormat.getCurrencyInstance();
		nfa[3] = NumberFormat.getCurrencyInstance(localJapao);
		nfa2[0] = NumberFormat.getInstance();
		nfa2[1] = NumberFormat.getInstance(localFranca);
		nfa2[2] = NumberFormat.getCurrencyInstance();
		nfa2[3] = NumberFormat.getCurrencyInstance(localFranca);
		nfa3[0] = NumberFormat.getInstance();
		nfa3[1] = NumberFormat.getInstance(localItalia);
		nfa3[2] = NumberFormat.getCurrencyInstance();
		nfa3[3] = NumberFormat.getCurrencyInstance(localItalia);
		
		System.out.println("<<<<<<Dados impressos em tela>>>>>>");
		for (NumberFormat nf: nfa) {
			System.out.println(" 1º exemplo Formas de tratamento NumberFormat para Japão: " + nf.format(valor));
			
		}
		System.out.println("-------------------------------------");
		
		for (NumberFormat n: nfa2) {
			System.out.println("2º exemplo Formas de Tratamento de NumberForm para França: " + n.format(valor));
		}
		System.out.println("-------------------------------------");
	
		for (NumberFormat num: nfa3) {
			System.out.println("3º exemplo de Tratamento de NUmberForm para Italia: " + num.format(valor));
		}
		System.out.println("-------------------------------------");
		
		System.out.println("<<<<<outros métodos do number format>>>>>");
		
		NumberFormat nf = NumberFormat.getInstance();
		NumberFormat n = NumberFormat.getInstance();
		NumberFormat num = NumberFormat.getInstance();
		
		System.out.println(nf.getMaximumFractionDigits());
		System.out.println(n.getMaximumFractionDigits());
		System.out.println(num.getMaximumFractionDigits());
		
		nf.setMaximumFractionDigits(1);
		System.out.println("Valoralterado: " + nf.format(valor));
		String stringValor = "123.4567";
		try {
			System.out.println("Numero Convertido para Inteiro: " + nf.parse(stringValor));
			nf.setParseIntegerOnly(true);
			System.out.println("Numero Convertido usando ParseIntegerOnly: " + nf.parse(stringValor));
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		
	}

}
