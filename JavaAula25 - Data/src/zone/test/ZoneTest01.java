package zone.test;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.time.chrono.JapaneseDate;
import java.util.Map;

public class ZoneTest01 {
    public static void main(String[] args) {
	tituloGerador();
	Map<String, String> listIDs = ZoneId.SHORT_IDS;
	System.out.println(listIDs);
	ZoneId tokyoZona = ZoneId.of("Asia/Tokyo");
	System.out.println("Zona Padão do Sistema: " + ZoneId.systemDefault());
	System.out.println("Pegando a Zona de Tokyo: " + tokyoZona);
	
	System.out.println(" ---- <<<< Local Date Time >>>> ----");
	LocalDateTime now = LocalDateTime.now();
	System.out.println("DataLocal: " + now);

	System.out.println("---- <<<< Zone Date Time >>>> ----");
	ZonedDateTime zoneNow = now.atZone(tokyoZona);
	System.out.println("Zona local alterada para zona de Tokyo: " + zoneNow);
	System.out.println("Hora Atual: [" + zoneNow.getHour() + ":" + zoneNow.getMinute() + "]");

	System.out.println("---- <<<< Classe Instant >>>> ----");
	Instant instantNow = Instant.now();
	System.out.println("Hora e Data Local Zona Zulu: " + instantNow);
	System.out.println("Hora e Datas Modificadas para Horario de tokyo: " + instantNow.atZone(tokyoZona));
	
	System.out.println("---- <<<< ZoneOFFSet >>>> ----");
	System.out.println(ZoneOffset.systemDefault());
	System.out.println("Valor Minimo de Zona: " + ZoneOffset.MIN);
	System.out.println("Valor Máximo de Zona: " + ZoneOffset.MAX);
	ZoneOffset zoneManaus = ZoneOffset.of("-04:00");
	System.out.println("Atribuindo horario a zona criada 1ª Maneira: " + now.atOffset(zoneManaus));
	System.out.println("Atribuindo horario a zona criada 2ª Maneira: " + OffsetDateTime.of(now, zoneManaus));
	System.out.println("Atribuindo horario a zona criada 3ª Maneira: " + instantNow.atOffset(zoneManaus));
	
	System.out.println("---- <<<< Calendarios >>>> ----");
	JapaneseDate japonesData = JapaneseDate.from(now);
	System.out.println("Calendário Japones: " + japonesData);
	LocalDate meijiEraLocalDate = LocalDate.of(1900, 4, 18);
	JapaneseDate JaponesEraMeiji = JapaneseDate.from(meijiEraLocalDate);
	System.out.println("Era meiji japones: " + JaponesEraMeiji);

    }

    public static void tituloGerador() {
	System.out.println("--------------------------------------------------");
	System.out.println("        trabalhando com Zonas para Datas          ");
	System.out.println("--------------------------------------------------");
    }

}
