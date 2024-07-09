package time.teste;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoField;

public class LocalDateTimeTest01 {
    public static void main(String[] args) {
	tituloGerador();
	LocalDateTime dateTime = LocalDateTime.now();
	System.out.println("Classe LocalDateTime: " + dateTime);
	System.out.println("Hora: " + dateTime.getHour() + ":" + dateTime.getMinute());
	System.out.println("-------------------------------");
	System.out.println("<<<<  Utilizando Método Parse da Hora e Data >>>>");
	LocalDate date = LocalDate.parse("2024-08-06");
	LocalTime time = LocalTime.parse("22:10:35");
	System.out.println("Data utilizando Função Parse: " + date);
	System.out.println("Hora Utilizando função Parse: " + time);
	
	System.out.println("<<<< Metodo de junção opcional da CLasse LocalDateTime >>>>");
	LocalDateTime ldt1 = date.atTime(time);
	LocalDateTime ldt2 = time.atDate(date);
	System.out.println("Utilizando LocalDateTime para Junção da Data - Hora: " + ldt1);
	System.out.println("Utilizando LocalDateTime para Junção da Hora - Data: " + ldt2);
	
	System.out.println("-------------------------------");
	System.out.println("<<<< Método Utilizados na Classe LocalDateYime >>>>");
	System.out.println("Hora: " + dateTime.getHour());
	System.out.println("Minuto: " + dateTime.getMinute());
	System.out.println("Segundo: " + dateTime.getSecond());
	System.out.println("Ano: " + dateTime.getYear());
	System.out.println("Mês: " + dateTime.getMonth());
	System.out.println("Dia do Mês: " + dateTime.getDayOfMonth());
	System.out.println("Dia do Ano: " + dateTime.getDayOfYear());
	System.out.println("Dia da Semana: " + dateTime.getDayOfWeek());
	System.out.println("[Data: " + dateTime.getDayOfMonth() + " de " + dateTime.getMonth() + " de " + dateTime.getYear() + "]" +
		           "\n[Hora: " + dateTime.get(ChronoField.HOUR_OF_DAY) + ":" +  dateTime.get(ChronoField.MINUTE_OF_HOUR) +"]");
	
	
	
    }

    public static void tituloGerador() {
	System.out.println("-------------------------------------------");
	System.out.println("        Trabalhando com LocalDateTime      ");
	System.out.println("-------------------------------------------");
    }

}
