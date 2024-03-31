package resourcebundles.test;


import java.util.Locale;
import java.util.ResourceBundle;

/*
 * COMENTARIOS SOBRE RESOUCE BUNLDES:
 * 
 * É O TRATAMENTO DADO AS MENSAGENS DE SAIDAS DE PROGRAMAS E SISTEMAS QUE SE 
 * DEVE TER PARA DIVERSOS IDIOMAS E LINGUAGENS ALGO MUITO IMPORTANTE PARA A 
 * PROGRAMAÇÃO E PARA O DESENVOLVEDOR.
 * 
 * OBS1: O ARQUIVO TIPO FILE DEVE ESTÁ DENTRO DA PASTA SOURCE CASO CONTRARIO O
 * ARQUIVO NÃO SERÁ ENCONTRADO
 * 
 * OBS2: PARA OS ARQUIVOS FILE CRIADOS A UM REGRA A SER UTILIZADA NA NOMEAÇÃO DESSES ARQUIVOS
 *  - O NOME INICIAL DO ARQUIVO É OPÇIONAL NO ENTANTO OS MAIS UTILIZADOS SÃO (LABEL, MESSAGES)
 *  - DEVE SE SEPARAR PELO IDIOMA A SER TRABALHADO.
 *  - DEVE - SE INFORMAR O PAIS ALVO DO IDIOMA A SER TRATADO.
 *  
 *  
 * NO ARQUIVO MENSAGENS:
 * OBS1: EXISTEM CARACTERES PARA SE SEPARAR AS PALAVRAS KEYS DOS VALORES A QUE ELAS ESTÃO ASSOCIADAS
 *  - USANDO O CARACTERE IGUAL (=)
 *  - USANDO O CARACTERE DOSI PONTOS (:)
 *  - USANDO ESPAÇO EM BRANCO ( )
 *  
 * OBS2: PARA SE EDITAR UM NOVO ARQUIVO COM AS MESMA PALAVRAS PARA SER TRATADAS PARA UM NOVO IDIOMA
 * DEVE-SE REPETIR O MESMO TERMO CHAVE / OU PALAVRA KEY DO TESTO ORIGINAL.
 * 
 * OBS3: É POSSIVEL UTILIZAR UMA FORMA DE HERANÇA NO RESOURCEBUNDLE
 * 
 */

public class ResouceBundleTest {

	public static void main(String[] args) {
		System.out.println("<<<< Trabalhando com ResourceBundle >>>>");
		System.out.println("Exemplo 01 - English");
		ResourceBundle rb = ResourceBundle.getBundle("messages", Locale.of("en", "US"));
		System.out.println(rb.getString("hello"));
		System.out.println(rb.getString("good.morning"));
		System.out.println(rb.getString("show"));
		
		System.out.println("-------------------------------------");
		System.out.println("<<<< trabalhando com ResourceBundle >>>>");
		System.out.println("Exemplo 02 - Portugues");
		ResourceBundle rb1 = ResourceBundle.getBundle("messages", Locale.of("pt", "BR"));
		System.out.println(rb1.getString("hello"));
		System.out.println(rb1.getString("good.morning"));
		System.out.println(rb1.getString("show"));
		
		

	}

}
