package data.teste;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Locale;

/*
 * TRABALHANDO COM INTERNALIZAÇÃO COM CLASSE LOCALE:
 * 
 * PARA TRABALHAR COM A CLAASE LOCAL VOCE TEM CHAMAR A CLASSE IMPORTANDO A BIBLIOTECA LOCALE NO JAVA.
 * OBS1: O CONSTRUTOR NEW PARA A CLASSE LOCALE FOI DESCONTINUADO.
 * OBS2: VOCE PODE UTILIZAR O GETDEFALT() AO INSTANCIAR UM NOVO OBJETO DA CLASSE LOCALE.
 * 
 * MÉTODOS DA CLASSE LOCALE:
 * METODO OF() → VOCÊ PODE UTILIZAR ESTE MÉTODO SE QUISER ESPECIFICAR UM LINGUAGEM ESPECIFICA 
 * PARA SE TRABALHAR.
 * MÉTODO GETDEFAULT() → ELE GERA A LINGUAGEM DEFAULT ESCOLHIDA PELA JVM E APLICA.
 * OBS3: OBJETO DE REFERENCIA E A PROPRIA LINGUAGEM A SER ESCOLHIDA
 * POR EXEMPLO → LOCAL.KOREAN ( ELE VAI MOSTRAR A FORMATAÇÃO DO LOCAL PARA LINGUAGEM KOREANA)
 * OBS4: PARA UTILIZAR AS FORMATAÇÕES DE MÉTODOS DA CLASSE LOCAL VOCE DEVE USAR A
 * PALAVRA LOCAL.METODO A SER UTILIZADO DEVIDO CONFIGURAÇÃO DO JAVA NÃO PERMITIR
 * PALAVRAS REPETIDAS PARA SER UTILIZAR OS MÉTODOS COMO POR EXEMPLO O PROPRIO NOME DA VARIAVEL.
 * METODO DYSPLAYLANGUAGE → MOSTRA A LINGUA USADA.
 * MÉTODO COUNTRY → MOSTRA O PAIS DE ORIGEM DA LINGUAGEM UTILIZADA.
 * 
 * 
 * 
 * 
 * 
 */

public class LocaleTest {

	public static void main(String[] args) {
		// CRIANDO VARIAVEIS DE REFERENCIA DA CLASSE LOCALE
		Locale localBrasileiro = Locale.of("PT");
		Locale localUniteState = Locale.of("US");
		Locale localChina = Locale.CHINESE;
		Locale localFrance = Locale.FRANCE;
		Locale localIndia = Locale.of("IN");
		// CRIANDO VARIAVEL DE REFERENCIA DA CLASSE CALENDAR
		Calendar c = Calendar.getInstance();
		c.set(2024, Calendar.MARCH, 20);
		// TRABALHANDO COM DATEFORMAT
		DateFormat df = DateFormat.getDateInstance(DateFormat.FULL, localBrasileiro);
		DateFormat df2 = DateFormat.getDateInstance(DateFormat.FULL, localUniteState);
		DateFormat df3 = DateFormat.getDateInstance(DateFormat.FULL, localChina);
		DateFormat df4 = DateFormat.getDateInstance(DateFormat.FULL, localFrance);
		DateFormat df5 = DateFormat.getDateInstance(DateFormat.FULL, localIndia);
		
		System.out.println("<<<<<Dados impressos em tela>>>>>.");
		System.out.println("Locale 01 Brasileiro : " + df.format(c.getTime()));
		System.out.println("Locale 02 Ingles Americano : " + df2.format(c.getTime()));
		System.out.println("Locale 03 Chinês: " + df3.format(c.getTime()));
		System.out.println("Locale França: " + df4.format(c.getTime()));
		System.out.println("Locale India: " + df5.format(c.getTime()));
		
		System.out.println("------------------------------------------------");
		
		System.out.println("<<<<<Outras funcoes da Classe Locale - DisplayLanguagem>>>>>");
		System.out.println(localBrasileiro.getDisplayLanguage());
		System.out.println(localUniteState.getDisplayLanguage());
		System.out.println(localChina.getDisplayLanguage());
		System.out.println(localFrance.getDisplayLanguage());
		System.out.println(localIndia.getDisplayLanguage());
		
		System.out.println("-------------------------------------------------");
		System.out.println("<<<<<Outras funções da Classe Locale - Country>>>>");
		System.out.println("Pais: " + localBrasileiro.getDisplayCountry(localBrasileiro));
		System.out.println("Pais: " + localUniteState.getDisplayCountry(localUniteState));
		System.out.println("Pais: " + localChina.getDisplayCountry(localChina));
		System.out.println("Pais: " + localFrance.getDisplayCountry(localFrance));
		System.out.println("Pais: " + localIndia.getDisplayCountry(localIndia));
		

	}

}
