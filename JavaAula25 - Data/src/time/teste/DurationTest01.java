package time.teste;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class DurationTest01 {
    public static void main(String[] args) {
	tituloGerador();
	LocalDateTime now = LocalDateTime.now();
	LocalDateTime nowAfterTwoYears = LocalDateTime.now().plusYears(2);
	LocalDateTime nowAfterTwoYearsAndEigthMInuts = LocalDateTime.now().plusYears(2).plusMinutes(8);
	LocalTime timeNow = LocalTime.now();
	LocalTime timeMinus7Hours = LocalTime.now().minusHours(7);
	LocalDate nowLocalDate = LocalDate.now();
	LocalDate nowLocalDateAfterTwoDays = LocalDate.now().plusDays(2);

	System.out.println("LocalDateTime Normal: " + now);
	System.out.println("localDatetime com Acrescimo de 2 Anos: " + nowAfterTwoYears);
	System.out.println("LocalDateTime com Acrescimo de 2 Anos e 8 Minutos: " + nowAfterTwoYearsAndEigthMInuts);
	System.out.println("LocalTime Normal: " + timeNow);
	System.out.println("LocalTime com decrescimo de 7 Horas: " + timeMinus7Hours);
	System.out.println("LocalDate Normal: " + nowLocalDate);
	System.out.println("LocalDate com acrescimo de 2 Dias: " + nowLocalDateAfterTwoDays);
	System.out.println("---------------------------------------------------");
	System.out.println("<<<< Utilizando Classe Duration >>>>");
	Duration d1 = Duration.between(now, nowAfterTwoYears);
	Duration d2 = Duration.between(timeNow, timeMinus7Hours);
	Duration d3 = Duration.between(now, nowAfterTwoYearsAndEigthMInuts);
	Duration d4 = Duration.between(Instant.now(), Instant.now().plusSeconds(1000));
	Duration d5 = Duration.between(nowLocalDate, nowLocalDateAfterTwoDays);
	System.out.println("Duration função Between: " + d1);
	System.out.println("Duration função Between2: " + d2);
	System.out.println("Duration função Between3: " + d3);
	System.out.println("Duration função Between4: " + d4);
	System.out.println("Duration função Between5: " + d5);
	System.out.println("---------------------------------------------------");
	System.out.println(" <<<< Métodos Uteis para Classe Duration >>>>");
	System.out.println("Mostrando a representação de dias em horas: " + Duration.ofDays(20));
	System.out.println("Mostra a representação de um valor em minutos: " + Duration.ofMinutes(3));
	System.out.println("Mostra a representação de um valor em horas: " + Duration.ofHours(150));
	System.out.println("Utilizando Interfaces representando Dias em Horas: " + Duration.of(10, ChronoUnit.DAYS));
	System.out.println("Utilizando Interfaces temporais mostrando minutos: " + Duration.of(6, ChronoUnit.MINUTES));
	
	

    }

    private static void tituloGerador() {
	System.out.println("-------------------------------------------");
	System.out.println("     Trabalhando com Classe Duration       ");
	System.out.println("-------------------------------------------");
    }

}
