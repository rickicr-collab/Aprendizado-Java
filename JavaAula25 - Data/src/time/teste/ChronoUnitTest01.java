package time.teste;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class ChronoUnitTest01 {
    public static void main(String[] args) {
	tituloGerador();
	LocalDateTime now = LocalDateTime.now();
	LocalDateTime aniversario = LocalDateTime.of(1991, 4, 18, 12, 0);
	System.out.println(" <<< Métodos da Enumaeração ChronoUnit >>> ");
	long ct = ChronoUnit.DAYS.between(aniversario, now);
	long ct2 = ChronoUnit.MONTHS.between(aniversario, now);
	long ct3 = ChronoUnit.YEARS.between(aniversario, now);
	long ct4 = ChronoUnit.WEEKS.between(aniversario, now);
	System.out.println("ChronoUnit Função Between: " + ct + " Dias");
	System.out.println("ChronoUnit Função Between: " + ct2 + " Meses");
	System.out.println("ChronoUnit Função Between: " + ct3 + " Anos");
	System.out.println("ChronoUnit Função Between: " + ct4 + " Semanas");
	
	
    }
    
    public static void tituloGerador() {
	System.out.println("-------------------------------------------------");
	System.out.println("        Trabalhando com Interface ChronoUnit     ");
	System.out.println("-------------------------------------------------");
    }

}
