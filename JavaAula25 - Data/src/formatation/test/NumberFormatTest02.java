package formatation.test;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class NumberFormatTest02 {
    public static void main(String[] args) {
	tituloGerador();
	Locale localPortugues = Locale.of("pt", "BR");
	Locale localJapao = Locale.JAPAN;
	Locale localItaly = Locale.ITALY;
	Locale localEnglish = Locale.of("en", "US");
	Locale localChina = Locale.CHINA;

	NumberFormat[] nfa = new NumberFormat[5];
	nfa[0] = NumberFormat.getCurrencyInstance(localPortugues);
	nfa[1] = NumberFormat.getCurrencyInstance(localJapao);
	nfa[2] = NumberFormat.getCurrencyInstance(localItaly);
	nfa[3] = NumberFormat.getCurrencyInstance(localEnglish);
	nfa[4] = NumberFormat.getCurrencyInstance(localChina);

	double valor = 5500.50;

	for (NumberFormat number : nfa) {
	    System.out.println("Numeros maximos de fracionados: " + number.getMaximumFractionDigits());
	    System.out.println("Currency da localidade: " + number.getCurrency() + " / Valor Monetário dos Paises: ["
		    + number.format(valor) + " ]");
	    System.out.println();
	}

	System.out.println("------------------------------------------");
	System.out.println("<<<< Conversão de String  >>>>");
	String valorStringDefault = "R$ 5.500,50";
	String valorStringJapao = "￥5,500";
	String valorStringItaly = "5.500,50 €";
	String valorStringUS = "$5,500.50";
	String valorStringChina = "¥5,500.50";

	try {
	    System.out.println("Valor Convertido Default: " + nfa[0].parse(valorStringDefault).intValue());
	    System.out.println("Valor Convertido para o Japão: " + nfa[1].parse(valorStringJapao).doubleValue());
	    System.out.println("valor Convertido para a Italy: " + nfa[2].parse(valorStringItaly).floatValue());
	    System.out.println("Valor Convertido para o Estados Unidos: " + nfa[3].parse(valorStringUS).intValue());
	    System.out.println("Valor Convertido para a China: " + nfa[4].parse(valorStringChina).floatValue());
	} catch (ParseException e) {
	    e.printStackTrace();
	}

    }

    public static void tituloGerador() {
	System.out.println("---------------------------------------------");
	System.out.println("      Introdução Classe NumberFormat         ");
	System.out.println("---------------------------------------------");
    }

}
