package dateupdate.teste;

import java.util.Calendar;
import java.util.Date;

public class CalendarTest01 {
    public static void main(String[] args) {
	tituloGerador();
	Calendar c = Calendar.getInstance();
	c.add(Calendar.HOUR_OF_DAY, 2);
	Date date = c.getTime();
	System.out.println(date);
	System.out.println("<<<< Métodos Uteis para classe Calendar >>>>");
	System.out.println("Método getFirstDayOfWeek:");
	if(c.getFirstDayOfWeek() == Calendar.SUNDAY) {
	    System.out.println("Este é o primeiro dia da semana");
	}
	System.out.println("------------------------------");
	System.out.println("Dia da Semana: " + c.get(Calendar.DAY_OF_WEEK));
	System.out.println("Dia do Mês: " + c.get(Calendar.DAY_OF_MONTH));
	System.out.println("Dia do Ano: " + c.get(Calendar.DAY_OF_YEAR));
	System.out.println("Dia da semana no Mês: " + c.get(Calendar.DAY_OF_WEEK_IN_MONTH));
	System.out.println("------------------------------");
	

    }

    public static void tituloGerador() {
	System.out.println("-----------------------------------------------------");
	System.out.println("              Introdução a Classe Calendar               ");
	System.out.println("-----------------------------------------------------");
    }

}
