package time.teste;

import java.time.Instant;
import java.time.LocalDateTime;

public class InstantTest01 {
    public static void main(String[] args) {
	tituloGerador();
	Instant now = Instant.now();
	System.out.println("LocalDateTime: " + LocalDateTime.now());
	System.out.println("Instant Tempo agora: " + now);
	System.out.println("Gerando nanos segundos: " + now.getNano() + " nanossegundos");
	System.out.println("Nanosegundo complementar: " + now.getEpochSecond() + " nanossegundos");
	System.out.println("Gerando nanossegundos especificos de 1970: " + Instant.ofEpochSecond(3));
	System.out.println("Gerando nanossegundos especificos de 1970 com acrescimom: " + Instant.ofEpochSecond(3, 1_000_000_000));
	System.out.println("Gerando nanossegundos especificos de 1970 com acrescimo negativo: " + Instant.ofEpochSecond(3, -5));
	
	
	
    }

    public static void tituloGerador() {
	System.out.println("--------------------------------------------");
	System.out.println("      Trabalhando com Classe Instant        ");
	System.out.println("--------------------------------------------");
    }

}
