package expressoesregulares.teste;


/*
 * COMENTÁRIOS SOBRE TOKENS E DELIMITADORES:
 * 
 * TOKENS:
 *  
 * TOKENS SÃO MUITOS IMPORTANTES NA JORNADA DE UM DESENVOLVEDOR PARA DELIMITAR 
 * STRING USANDO CARACTER DELIMITADOR EM OCASIOES QUE SE JULGA NECESSÁRIAS ENTÃO É UM TEMA IMPORTANTE.
 * 
 * OBS1:EXISTE DUAS FORMAS DE TRABALHAR COM TOKENS 
 * USANDO A CLASSE STRING(MAIS FACIL) / USANDO A CLASSE SCANNER(MAIS ROBUSTA).
 * 
 * CLASSE STRING: VOCÊ TRABALHAS DIRETAMENTE NA PROPRIA STRING PODENDO CRIAR
 * UM ARRAY PARA ADICIONAR AS STRING E USNDO UM CARACTER DELIMITADOR FILTRAR
 * CASA STRING E DEPOIS REALIZAR A VISUALIZAÇÃO COM UM LAÇO FOR.
 * OBS1: É POSSIVEL UTILIZAR NUMEROS PARA FILTRAR E CLASSIFICAR OS TOKENS
 * UTILIZANDO CARACTERES ESPECIAIS DAS EXPRESSÕES REGULARES
 * COMO POR EXEMPLO PARA DIGITOS = \\d → É POSSIVEL FILTRAR OS NUMEROS.
 * 
 * OBS1: NA CLASSE STRING POR MAIS QUE SE UTILIZE DIGITOS DENTRO PARA SE FILTRAR
 * OU DELIMITAR OS VALORES USANDO A FUNÇÃO SPLIT TUDO SERÁ CONVERTIDO PARA 
 * STRING NO FIM.
 * 
 */

public class TokenTest {

	public static void main(String[] args) {
		System.out.println("<<<<< Trabalhando com o método String>>>>>");
		System.out.println("Exemplo 01 - usando Caracter delimitador");
		String str = "Willian9, Paulo, Joana2, Camila3, Anna4, John5, Matheus6";
		String[] tokens = str.split(",");
		for(String t: tokens) {
			System.out.println("Nome: " + t.trim());
		}
		System.out.println("---------------------------------------------");
		System.out.println("Exemplo 02 - Trabalhando com caracteres especiais(expressoes Regulares");
		String str1 = "Ricardo1 Rafael2 Radhan3 Ranni4 Priscila5 Marcela6";
		String[] tokens2 = str1.split("\\d");
		for(String t1: tokens2) {
			System.out.println("Nome: " + t1.trim());
		}
		
		
		
		
		
		
		
		

	}

}
