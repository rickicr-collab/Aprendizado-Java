package formatation.test;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Locale;

public class LocaleTest01 {
    public static void main(String[] args) {
	tituloGerador();
	Locale localeItaly = Locale.of("it", "IT");
	Locale localeCH = Locale.of("it", "CH");
	Locale localIndia = Locale.of("hi", "IN");
	Locale localJapao = Locale.of("ja", "JP");
	Locale localHolanda = Locale.of("nl", "NL");
	Locale localPadrao = Locale.getDefault();
	Calendar calendario = Calendar.getInstance();
	DateFormat df = DateFormat.getDateInstance(DateFormat.FULL, localeItaly);
	DateFormat df2 = DateFormat.getDateInstance(DateFormat.FULL, localeCH);
	DateFormat df3 = DateFormat.getDateInstance(DateFormat.FULL, localIndia);
	DateFormat df4 = DateFormat.getDateInstance(DateFormat.FULL, localJapao);
	DateFormat df5 = DateFormat.getDateInstance(DateFormat.FULL, localHolanda);
	DateFormat df6 = DateFormat.getDateInstance(DateFormat.FULL, localPadrao);
	
	System.out.println("<<<< Tipos de Datas Formatadas Utilizando a Classe Locale >>>> ");
	System.out.println("Localização Formatada com Locale Italiano: " + df.format(calendario.getTime()));
	System.out.println("Localização Formatada com Locale Suiça: " + df2.format(calendario.getTime()));
	System.out.println("Localização Formatada com Locale India: " + df3.format(calendario.getTime()));
	System.out.println("Localização Formatada com Locale Japão: " + df4.format(calendario.getTime()));
	System.out.println("Localização Formatada com Locale Holanda: " + df5.format(calendario.getTime()));
	System.out.println("Localização Formatada com Locale Default: " + df6.format(calendario.getTime()));
	System.out.println("-----------------------------------------");
	System.out.println("<<<< Localizando a localidade das Datas Formatadas >>>> ");
	System.out.println("Localidade Italy: " + localeItaly.getDisplayCountry());
	System.out.println("Localidade Suiça: " + localeCH.getDisplayCountry());
	System.out.println("Localidade India: " + localIndia.getDisplayCountry());
	System.out.println("Localidade Japão: " + localJapao.getDisplayCountry());
	System.out.println("Localidade Holanda: " + localHolanda.getDisplayCountry());
	System.out.println("Localidade Default: " + localPadrao.getDisplayCountry());
	
    }

    public static void tituloGerador() {
	System.out.println("-----------------------------------------------------");
	System.out.println("            Introdução a Classe Locale               ");
	System.out.println("-----------------------------------------------------");
    }

}
