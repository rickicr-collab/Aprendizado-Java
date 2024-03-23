package data.teste;

import java.util.Calendar;
import java.text.DateFormat;

/*
 * UTILIZANDO O DATE FORMAT:
 * 
 * USANDO O GET INSTANCE E O GET DATE INSTANCE É FPOSSIVEL FORMATAR A DATA DE FORMA BASICAE RAPIDA
 * PARA RESOLVER ALGUMS CASOS BASICOS QUE PODEM OCORRER DE ALGUNS PROJETOS EMBORA 
 * EXISTAM MAIS FORMAS COMPLETAS DE SE RESOLVER AS FORMATAÇÕES E DIÇÕES DE DATA NO JAVA.
 * 
 */

public class DateFormatTest {

	public static void main(String[] args) {
		Calendar c = Calendar.getInstance();
		DateFormat[] dfa = new DateFormat[6];
		System.out.println("<<<<Metodos abaixo>>>>");
		dfa[0] = DateFormat.getInstance();
		dfa[1] = DateFormat.getDateInstance();
		dfa[2] = DateFormat.getDateInstance(DateFormat.SHORT);
		dfa[3] = DateFormat.getDateInstance(DateFormat.MEDIUM);
		dfa[4] = DateFormat.getDateInstance(DateFormat.LONG);
		dfa[5] = DateFormat.getDateInstance(DateFormat.FULL);
		
		for(DateFormat df: dfa) {
			System.out.println("Forma de instancia do Dateformat: " + df.format(c.getTime()));
		}
		

	}

}
