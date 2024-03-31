package expressoesregulares.teste;

import java.util.Scanner;

/*
 * COMENTARIOS SOBRE MÉTODO SCANNER:
 * 
 * CLASSE SCANNER:
 * 
 * PARA UTILIZAR A CLASSE SCANNER É NECESSÁRIO CRIAR UM NOVO OBJETO USANDO O CONSTRUTOR
 * NEW.
 * 
 * O CONSTRUTOR DO MÉTODO SCANNER POSSUI OPÇÕES CARREGADAS COMO POR EXEMPLO UM ARQUIVO
 * STRING E ETC.
 * COM A CLASSE SCANNER VOCÊ PODE USAR O TOKEN E FAZER A CONVERSÃO AUTOMATICAMENTE SE
 * NECESSÁRIO.
 * 
 * O MÉTODO MAIS EFIZAR UTILIZANDO A CLASSE SCANNER É TRANSFORMAR TUDO PARA STRING
 * UTILIZANDO O MÉTODO WHILE COMO CONDIÇÃO A VARIAVEL UTILIZANDO A FUNÇÃO:
 * HASNEXT() → ELE VERIFICAR SE HA UM PROXIMA POSIÇÃO NO INDICE SEM ALTERA-LO.
 * NEXT() → ESSA FUNÇÃO VEIRICA O INDICE E ALTERA PARA O PROXIMO.
 * 
 * OBS1: CASO VOCE QUEIRA TROCAR O DELIMITADOR USANDO A FUNÇÃO SCANNER VOCE CHAMA A 
 * VARIAVEL E USA A FUNÇÃO USERDELIMITER() PARA TROCAR ENTRE OS TOKENS DEFINIDOS.
 * 
 * 
 */

public class ScannerTest {

	public static void main(String[] args) {
		System.out.println("<<<<< trabalhando com Método Scanner >>>>>");
		System.out.println("Exemplo 01 - Scanner com paramentros String");
		Scanner tec = new Scanner("1 true 100 oi");
		while(tec.hasNext()) {
			System.out.println("Delimitador: " + tec.next());
		}
		System.out.println("---------------------------------------------");
		System.out.println("Exemplo 02 - Scanner com tipos primitivos");
		Scanner tec2 = new Scanner("1 true 100 oi");
		while(tec2.hasNext()) {
			if(tec2.hasNextInt()) {
				int num = tec2.nextInt();
				System.out.println("Valor Inteiro: " + num);
			}else if(tec2.hasNextBoolean()) {
				boolean b = tec2.nextBoolean();
				System.out.println("Valor Booleano: " + b);
			}else {
				System.out.println("Valor String: " + tec2.next());
			}
		}
		
		
		
		

	}

}
