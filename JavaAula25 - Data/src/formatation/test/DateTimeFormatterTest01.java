package formatation.test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class DateTimeFormatterTest01 {
    public static void main(String[] args) {
	tituloGerador();
	LocalDate date = LocalDate.now();
	String s1 = date.format(DateTimeFormatter.BASIC_ISO_DATE);
	String s2 = date.format(DateTimeFormatter.ISO_DATE);
	String s3 = date.format(DateTimeFormatter.ISO_LOCAL_DATE);
	System.out.println("Primeira forma DateTimeFormatter: " + s1);
	System.out.println("Segunda forma DateTimeFormatter: " + s2);
	System.out.println("Terceira Forma DateTimeFormatter: " + s3);
	
	System.out.println("---- <<<< Utilizando Método Parse >>>> ----");
	LocalDate parse1 = LocalDate.parse("20210219", DateTimeFormatter.BASIC_ISO_DATE);
	LocalDate parse2 = LocalDate.parse("2021-02-19+05:00", DateTimeFormatter.ISO_DATE);
	LocalDate parse3 = LocalDate.parse("2021-02-19", DateTimeFormatter.ISO_LOCAL_DATE);
	System.out.println("Parse1: " + parse1);
	System.out.println("Parse2: " + parse2);
	System.out.println("parse3: " + parse3);

	System.out.println("---- <<<< LocaLDateTime >>>> ----");
	LocalDateTime now = LocalDateTime.now();
	String timeNowFormat = now.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME);
	System.out.println("LocalDatetime Formatado: " + timeNowFormat);
	
	LocalDateTime parse4 = LocalDateTime.parse("2024-07-09T12:14:39.7470157");
	System.out.println("Parse4: " + parse4);
	
	System.out.println("---- <<<< DateTimeFormatter >>>> ----");
	DateTimeFormatter formatDateBR = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	String formatBr = LocalDate.now().format(formatDateBR);
	System.out.println("Data formatada para padrão Brasileiro: " + formatBr);
	
	LocalDate parse5 = LocalDate.parse("09/07/2024", formatDateBR);
	System.out.println("Parse5: " + parse5);
	
	DateTimeFormatter formatterIt = DateTimeFormatter.ofPattern("dd.MMMM.yyyy", Locale.ITALY);
	String formatIT = LocalDate.now().format(formatterIt);
	System.out.println("Data formatada para padrão Italiano: " + formatIT);
	
	LocalDate parse6 = LocalDate.parse("09.luglio.2024", formatterIt);
	System.out.println("Parse6: " + parse6);
	
	
	
	
    }
    
    public static void tituloGerador() {
	System.out.println("---------------------------------------------");
	System.out.println("      Trabalhando com DateTimeFormatter      ");
	System.out.println("---------------------------------------------");
    }

}
