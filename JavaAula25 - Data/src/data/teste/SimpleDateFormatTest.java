package data.teste;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;


/*
 * TRABALHANDO COM SIMPLEDATEFORMAT:
 * 
 * OBS1: QUANDO CRIAMOS VARIAVEIS QUE RECEBEM VALOR STRING CADA MODELO QUE POSSUIR 'AT' ENTRE ASPAS SIMPLES
 * DENTRO DO PADRÃO JAVA ELE VAI ADICIONAR A LETRA A EM INGLES AT NA EXPRESSÃO DA EDIÇÃO DA DATA 
 * PERSONALIZADA.
 * 
 * CASO NÃO POSSUA ASPAS SIMPLES SERÁ APLICADA A FUNCÃO AM / PM DA .
 * 
 * 
 */

public class SimpleDateFormatTest {

	public static void main(String[] args) {
		Calendar calendario = Calendar.getInstance();
		String mascara = "'Prazeres,' dd 'de' MMM 'de' YYYY z";
		SimpleDateFormat formataData = new SimpleDateFormat(mascara);
		
		System.out.println("Usando SimpleDateFormat: " + formataData.format(calendario.getTime()));
		
		

	}

}
