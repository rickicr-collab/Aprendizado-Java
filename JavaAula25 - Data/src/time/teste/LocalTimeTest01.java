package time.teste;

import java.time.LocalTime;
import java.time.temporal.ChronoField;

public class LocalTimeTest01 {
    public static void main(String[] args) {
	tituloGerador();
	LocalTime hora = LocalTime.of(20, 30, 15);
	LocalTime horanow = LocalTime.now();
	System.out.println("Hora: " + hora);
	System.out.println("Resultado da Hora decorrida: " + horanow);
	System.out.println(" <<<<  Metodos Uteis na Classe LocalTime >>>>");
	System.out.println("Hora: " + hora.getHour());
	System.out.println("Minuto: " + hora.getMinute());
	System.out.println("Segundo: " + hora.getSecond());
	System.out.println("Hora Usando Método Chronofield: " + hora.get(ChronoField.HOUR_OF_DAY));
	System.out.println("Minuto Usando Método Chronofield: " + hora.get(ChronoField.MINUTE_OF_HOUR));
	System.out.println("Segundo Usando Método Chronofield: " + hora.get(ChronoField.SECOND_OF_MINUTE));
	System.out.println("Hora: [" + horanow.getHour() + ":" + horanow.getMinute() + "]");
	System.out.println("Modo Meia noite: " + LocalTime.MIDNIGHT);
	System.out.println("Modo de Hora Minimo: " + LocalTime.MIN);
	System.out.println("modo de Hora Máximo: " + LocalTime.MAX);
	
	
    }
    
    public static void tituloGerador() {
	System.out.println("-------------------------------------------");
	System.out.println("        Trabalhando com LocalTime          ");
	System.out.println("-------------------------------------------");
    }

}
