package ioentradasaidadados.teste;

import java.io.Console;

/*
 * COMENTÁRIOS SOBRE A PACOTE DA CLASSE IO CONSOLE:
 * 
 * NÃO É POSSIVEL UTILIZAR A FUNÇÃO CONSOLE() DENTRO DO ECLIPSE POIS A IDE NÃO DA 
 * ACESSO A FUNÇÃO AO MESMO QUE SEJA PELO PROPRIO TERMINAL.
 * 
 * MÉTODO READPASSWORD: ALEM DO RETORNO QUE É CHAR DENTRO DE ARRAY
 * METODO READLINE: RETORNA O VALOR COMO UMA STRING
 * 
 * A DIFERENÇA ENTRE OS DOIS É : COM O READPASSWORD RETORNA UM ARRAY DE STRING É POSSIVEL TER ACESSO AO POOL
 * DE STRING DA MEMÓRIA COMO ATAQUE CIBERNETICO DE UM HACKER. O METODO É CONSIDERADO UM PROBLEMA DEVIDO A ESSA CARACTERISTICA.
 * 
 * 
 * 
 *  É NECESSARIO CRIAR UM ARQUIVO DE TEXTO COM O CODIGO PARA UTILIZAR NO TERMINAL 
 *  PARA ACESSAR O TERMINAL NA AREA DE TRABALHO CLICA NA TECLA <SHIFT> + BOTAÃO DIREITO DO MOUSE DEPOIS ACESSAR O TERMINAL.
 *  
 *  OBS: O CARACTERE '%S' SUBSTITUI O QUE VOCÊ DIGITA APOS A VIRGULA QUE REPRESENTA UM OBJETO.
 *  
 */

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
			texto = c.readLine("%s","Digite: " );
			c.format("Esse texto %S foi digitado", retorno(texto));
		}
	}
	
	public static String retorno(String arg1) {
		return arg1;
	}

}
