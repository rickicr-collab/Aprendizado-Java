import java.io.Console;

public class ConsoleTest {

	public static void main(String[] args) {
		Console c = System.console();
		char[] pw = c.readPassword("%s", "pw: ");
		for(char p: pw) {
			c.format("%c",p);
		}
		c.format("\n");
		
		String texto;
		while(true) {
			texto = c.readLine("%s","\nDigite: " );
			c.format("Esse texto %S foi digitado", retorno(texto));
		}

	}
	
	public static String retorno(String arg1) {
		return arg1;
	}

}
