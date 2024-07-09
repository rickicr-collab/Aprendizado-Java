package time.teste;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.ChronoField;
import java.time.temporal.TemporalAdjusters;

public class TemporalAdjusterTest01 {
    public static void main(String[] args) {
	tituloGerador();
	System.out.println("<<<< Exemplo 01 Métodos da classe LocalDAte >>>>");
	LocalDate now = LocalDate.now();
	now = now.withDayOfMonth(20);
	System.out.println("Data Impressa: " + now);
	System.out.println("Data da semana: " + now.getDayOfWeek());
	System.out.println("-----------------------------------------");
	System.out.println("<<<< Exemplo 02 utilizando interface ChronoFiled >>>>>");
	LocalDate now2 = LocalDate.now();
	now2 = now2.with(ChronoField.DAY_OF_MONTH, 20);
	System.out.println("Data impressa: " + now2);
	System.out.println("Data representado dia da semana: " + now2.getDayOfWeek());
	System.out.println("-----------------------------------------");
	System.out.println("<<<< Utilizando Temporal Adjusters >>>>");
	System.out.println("**Método nextOrSame**");
	LocalDate now3 = LocalDate.now();
	now3 = now3.with(TemporalAdjusters.nextOrSame(DayOfWeek.MONDAY));
	System.out.println("Data impressa: " + now3);
	System.out.println("Data representado dia da semana: " + now3.getDayOfWeek());
	
	System.out.println("**Método next**");
	now3 = now3.with(TemporalAdjusters.next(DayOfWeek.MONDAY));
	System.out.println("Data impressa: " + now3);
	System.out.println("Data representado dia da semana: " + now3.getDayOfWeek());
	
	System.out.println("**Método Previous**");
	now3 = now3.with(TemporalAdjusters.previous(DayOfWeek.SUNDAY));
	System.out.println("Data impressa: " + now3);
	System.out.println("Data representado dia da semana: " + now3.getDayOfWeek());
	System.out.println("**Método PreviousOrSame**");
	
	now3 = now3.with(TemporalAdjusters.previousOrSame(DayOfWeek.SUNDAY));
	System.out.println("Data impressa: " + now3);
	System.out.println("Data representado dia da semana: " + now3.getDayOfWeek());
	System.out.println("------------------------------------------");
	System.out.println("Outros métodos uteis:");
	now3 = now3.with(TemporalAdjusters.firstDayOfMonth());
	System.out.println("Data impressa do Primeiro dia do Mês: " + now3);
	System.out.println("Data representado dia da semana: " + now3.getDayOfWeek());
	
	now3 = now3.with(TemporalAdjusters.lastDayOfMonth());
	System.out.println("Data impressa do ultimo dia do Mês: " + now3);
	System.out.println("Data representado dia da semana: " + now3.getDayOfWeek());
	
	now3 = now3.with(TemporalAdjusters.firstDayOfNextYear());
	System.out.println("Data impressa do primeiro dia do proximo Ano: " + now3);
	System.out.println("Data representado dia da semana: " + now3.getDayOfWeek());

	now3 = now3.with(TemporalAdjusters.firstDayOfNextMonth());
	System.out.println("Data impressa do primeiro dia do proximo Mês: " + now3);
	System.out.println("Data representado dia da semana: " + now3.getDayOfWeek());
    }

    public static void tituloGerador() {
	System.out.println("------------------------------------------------");
	System.out.println("   Trabalhando com Interface TemporalAdjusters  ");
	System.out.println("------------------------------------------------");
    }

}
