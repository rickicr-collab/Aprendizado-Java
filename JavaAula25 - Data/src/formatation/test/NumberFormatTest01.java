package formatation.test;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class NumberFormatTest01 {
    public static void main(String[] args) {
	tituloGerador();
	Locale localPortugues = Locale.of("pt", "BR");
	Locale localJapao = Locale.JAPAN;
	Locale localItaly = Locale.ITALY;
	Locale localUniteState = Locale.ENGLISH;
	
	NumberFormat[] nfa = new NumberFormat[4];
	nfa[0] = NumberFormat.getNumberInstance(localPortugues);
	nfa[1] = NumberFormat.getNumberInstance(localJapao);
	nfa[2] = NumberFormat.getNumberInstance(localItaly);
	nfa[3] = NumberFormat.getNumberInstance(localUniteState);
	
	double valor = 10_000.2130;
	
	for(NumberFormat number: nfa) {
	    System.out.println("Valor máximo de Digitos: " + number.getMaximumFractionDigits());
	    System.out.println("Numero Formatado para Valor Monetário: " + number.format(valor));
	}
	System.out.println("<<<< Conversão de String para Inteiro >>>>");
	String valorString = "1000,213";
	try {
	    System.out.println("Valor Convertido: " + nfa[0].parse(valorString).doubleValue());
	} catch (ParseException e) {
	    e.printStackTrace();
	}
	
    }
    
    public static void tituloGerador() {
	System.out.println("-----------------------------------------------------");
	System.out.println("             Classe NumberFormat para Moedas         ");
	System.out.println("-----------------------------------------------------");
    }

}
