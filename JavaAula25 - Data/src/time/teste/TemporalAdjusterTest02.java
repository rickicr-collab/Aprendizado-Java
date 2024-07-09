package time.teste;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;
import java.time.temporal.Temporal;
import java.time.temporal.TemporalAdjuster;

class obterProximoDiaUtil implements TemporalAdjuster {

    @Override
    public Temporal adjustInto(Temporal temporal) {
	DayOfWeek diaDaSemana = DayOfWeek.of(temporal.get(ChronoField.DAY_OF_WEEK));
	int addDays;
	switch (diaDaSemana) {
	case THURSDAY:
	    addDays = 4;
	    break;
	case FRIDAY:
	    addDays = 3;
	    break;
	case SATURDAY:
	    addDays = 2;
	    break;
	default:
	    addDays = 1;
	}
	return temporal.plus(addDays, ChronoUnit.DAYS);
    }

}

public class TemporalAdjusterTest02 {
    public static void main(String[] args) {
	LocalDate now = LocalDate.now();
	System.out.println("Data dde Hoje: " + now);
	System.out.println("Representando dia da Semana: " + now.getDayOfWeek());

	now = LocalDate.now().with(new obterProximoDiaUtil());
	System.out.println("Data dde Hoje: " + now);
	System.out.println("Representando dia da Semana: " + now.getDayOfWeek());
	
	now = LocalDate.now().withDayOfMonth(15);
	System.out.println("Data dde Hoje: " + now);
	System.out.println("Representando dia da Semana: " + now.getDayOfWeek());
	
	now = LocalDate.now().withDayOfMonth(19).with(new obterProximoDiaUtil());
	System.out.println("Data dde Hoje: " + now);
	System.out.println("Representando dia da Semana: " + now.getDayOfWeek());
	
	now = LocalDate.now().withDayOfMonth(20).with(new obterProximoDiaUtil());
	System.out.println("Data dde Hoje: " + now);
	System.out.println("Representando dia da Semana: " + now.getDayOfWeek());
	
	now = LocalDate.now().withDayOfMonth(21).with(new obterProximoDiaUtil());
	System.out.println("Data dde Hoje: " + now);
	System.out.println("Representando dia da Semana: " + now.getDayOfWeek());

    }

}
