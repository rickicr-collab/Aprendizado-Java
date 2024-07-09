package time.teste;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class PeriodTest01 {
    public static void main(String[] args) {
	tituloGerador();
	LocalDate ldt = LocalDate.now();
	LocalDate ldtAfterTwoYears = LocalDate.now().plusYears(2).plusDays(10);
	Period periodo = Period.between(ldt, ldtAfterTwoYears);
	System.out.println("Period com função Between: " + periodo);
	System.out.println("---------------------------------");
	System.out.println(" <<<< Métodos Class Period >>>>");
	System.out.println("Funções da Classe Periodo");
	Period p1 = Period.ofDays(10);
	Period p2 = Period.ofWeeks(58);
	Period p3 = Period.ofMonths(3);
	Period p4 = Period.ofYears(3);
	System.out.println("Period Function ofDays: " + p1);
	System.out.println("Perido Function ofWeeks: " + p2);
	System.out.println("Period Function ofMonths: " + p3);
	System.out.println("Period Function ofYears: " + p4);
	System.out.println("Teste: " + Period.between(ldt, ldt.plusDays(p2.getDays())).getMonths());
	System.out.println("Teste 2: " + ldt.until(ldt.plusDays(p2.getDays()), ChronoUnit.MONTHS));
	
	
	
    }
    
    public static void tituloGerador() {
	System.out.println("-------------------------------------------------");
	System.out.println("        Trabalhando com a Classe Period          ");
	System.out.println("-------------------------------------------------");
    }

}
