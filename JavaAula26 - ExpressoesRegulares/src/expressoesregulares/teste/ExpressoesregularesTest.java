package expressoesregulares.teste;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* COMENTARIOS SOBRE EXPRESSOES REGULARES
 * PARTE 01
 * EXPRESSÕES REGULARES :
 * 
 * SÃO BASICAMENTE UMA LINGUAGEM DE PROGRAMAÇÃO DENTRO IMBUIDA DENTRO DE OUTRA LINGUAGEM 
 * DE PROGRAMAÇÃO
 * 
 * ALGUMAS LINGUAGUESM QUE OFERECEM SUPORTE A EXPRESSÕES REGULARES SÃO:
 * JAVA ,C ,C++ ,PYTHON ,PHP ,JAVASCRYPT ENTRE OUTRAS.
 * 
 * MUITO USADA QUANDO SE QUER OBTER PADROES PRA BUSCAR DETERMINADAS INFORMAÇÕES 
 * DENTRO DE GRANDES ARQUIVOS DE TEXTO.
 * 
 * AS DUAS CLASSES NO JAVA USADAS PARA SE TRBALHAR COM EXPRESSOES REGULARES SÃO:
 * PATTERN → CRIA O PADRÃO DENTRO DAS EXPRESSÕES REGULARES 
 * MATCHER → BUSCA O PADÃO A PARTIR DAS BASES DO PATTERN
 * 
 * OBS1: NO GERAL AS EXPRESSÕES REGULARES SEMPRE IRÃO COMECAR DA ESQUERDA PARA DIREITA 
 * E UMA VEZ QUE AQUELA POSIÇÃO JA FOI UTILIZADA POR JA ENCONTRA A EXPRESSÃO A SER BUSCADA
 * ELA NÃO SERÁ MAIS CONSIDERADA DISPONIVIL PARA BUSCA E IRÁ PULAR PARA A PROXIMA POSIÇÃO
 * GERALMENTE AS EXPRESSÕES REGULARES NÃO UTILIZA UM CARACTERE QUE JA FOI UTILIZADO.
 * 
 * PARTE 02
 * METAS CARACTERES:
 * SÃO CARACTERES QUE AJUDAM A FACILITAR A EXPRESSÃO REGULAR.
 * 
 * OS MAIS UTILIZADOS META CARACTERES:
 * OBS: PARA UTILIZAR META CARACTERES COMO ELES POSSUEM CONTRA BARRA É NECESSARIO
 * UM CARACTERER DE ESCAPE QUE SERIA OUTRA CONTRA-BARRA.
 * \\d → FAZ A BUSCA NUMA FRASE OU TEXTO DE TODOS OS DIGITOS EXISTENTES.
 * \\D → FAZ A BUSCA E ENCONTRA TUDO QUE NÃO FOR DIGITO.
 * \\s OPCIONAL(\t, \n, \f, \r) → FAZ A BUSCA POR ESPACOS EM BRANCO.
 * \\S → FAZ A BUSCA E MOSTRA O QUE NÃO É ESPAÇO EM BRANCO.
 * \\w → FAZ A POR CARACTERES DE PALAVRAS E DIGITOS QUE ESTÃO INCLUIDOS a-z(MINUSCULO),A-Z(MAIUSCULO)
 * E O CARACTEREE UNDERLINE('_').
 * \\W → BUSCA TUDO AQUILO QUE NÃO FOR UMA PALAVRA.
 * 
 * PARTE03
 * COMO BUSCAR UM RANGE DE METACARACTERES:
 * 
 * OBS1: PARA REALIZAR BUSCAS MAIS ESPECIFICAS EM CARACTERES DENTRO DE UM TEXTO 
 * PODE SE REALIZAR COLOCANDO OS CARACTERES DENTRO DE UM COLCHETE E ESPECIFICAR 
 * SE DESEJA MAIUSCULO OU MINUSCULO.
 * EXEMPLO: [abcABC] → SERÁ REALIZADO A BUSCA POR CARACTERES ABC TANTO MINUSCULO COMO MAIUSCULO
 * DENTRO DO TEXO.
 * EXEMPLO2: [a-zA-Z] → SERÁ REALIZADA A BUSCA DE CARACTERES DA LETRA A ATE Z TANTO MINUSCULO QUANTO 
 * MAISUCULO SE DESEJAR APENAS MINUSCULO OU MAISUCULO PODE BUSCAR APENAS O TIPO DESEJADO.
 * EXEMPLO3: [0-9] → SERA REALIZADA A BUSCA DE DIGITOS DE UM INTERVALO DE 0 A 9.
 * EXEMPLO4: [A-Za-z.] → UTILIZAÇÃO COMO CARACTER CORINGA PARA O FILTRO QUE PODE SER SUBSTITUIDO 
 * POR QUALQUER COISA.
 * - 1.3 = 123, 133, 1A3, 1#3, 1 3
 * EXEMPLO5: [a-zA-Z\\.] → UTILIZAÇÃO DO PONTO COMO CARACTERER TEXTO.
 * 
 * OBS2: NO JAVA PARA IMPRIMIR UM NUMERO HEXADECIMAL É REALIZADO: 
 *  - NUMERO: 0
 *  - CARACTERE:  x / X
 *  - VALOR: QUE É LETRA QUE VAI DE A ATÉ F
 * 
 * PARTE 04
 * 
 * OBS: APESAR DE FILTRAR A  BUSCAS POR CARACTERES COM DIFERENCIAÇÃP DE LETRAS MAIUSCULAS E MINUSCULAS
 * É POSSIVEL TAMBEM UTILIZAR CARACTERES CORINGA COMO O PONTO (.) MAIS PARA UTILIZAR DEVEMOS 
 * COLOCAR ANTECIPADO AO PONTO DUAS CONTRA BARRAS (\\) DESSA FORMA ISSO SINALIZA QUE ESTÁ UTILIZANDO 
 * O PONTO COMO TEXTO E NÃO COMO CARACTER CORRINGA 
 * 
 * OBS2: PARA VALIDAR UM TEXTO USANDO EXPRESSÕES REGULARES DEPOIS DE BUSCAR SEUS PADROES É
 * NECESSARIO UTILIZAR UM MÉTODO QUE EXISTE TANTO DENTRO DA CLASSE STRING COMO NA CLASSE 
 * PATTERN QUE É CHAMADO (MATCHES) A VANTAGEM É QUE PODE UTILIZAR O MÉTODO DIRETAMENTE 
 * A PARTIR DA STRING.
 * 
 * TRABALHANDO COM DATAS:
 * 
 * AS DATAS PRECISAM TRABALHAR COM OS FORMATOS DE DATA PADRÃO RECONHECIDOS NO JAVA COMO POR EXEMPLO DD/MM/YYYY
 * PARA VERIFICARMOS A VALIDAÇÃO OU TRATAMENTO DE DATAS PODEMOS UTILIZAR DUAS OPÇÕES : 
 * [0-9] / CARACTERER ESPECIAL: \\d
 * OUTROS MÉTODOS:
 * PARA BUSCAR DOIS DIGITOS : \\d{2} → UTILIZAR COLCHETES AO INVES DE CHAVES
 * PARA BUSCAR DOIS DIGITOS OU MAIS : \\d{2, 4}
 * 
 * PARTE 05
 * 
 * TRABALHANDO COM CARACTERES DE NEGAÇÃO:
 * 
 * O CARACTERER DE NEGAÇÃO DAS EXPRESSÕES REGULARES É: (^).
 * EXEMPLO1: [^abc] → VOCÊ ESTÁ BUSCANDO QUALQUER CARACTERER QUE NÃO SEJA ABC.
 * EXEMPLO2: proj([^,])+ → BUSCA TODOS OS VALORES NOMEADOS PROJ PARA TUDO 
 * QUE NÃO TENHA UMA VIRGULA APOR ISSO E REPITA ISSO VARIA VEZES.
 * 
 * 
 * 
 * 
 */

public class ExpressoesregularesTest {

	public static void main(String[] args) {
		
		String regex = "0[xX][0-9a-fA-F]";
	    String texto = "12 0x 0x 0xFFAB 0x10G 0x1";
		String regex1 = "([\\w\\._-])+@([a-zA-Z])+(\\.([a-zA-Z])+)+";
		String texto1 = "fulano@hotmail.com, 102Abc@gmail.com, #@!abrao@mail.br, teste@gmail.br, teste@mail.com.br";
		String regex2 = "\\d{2}/\\d{2}/\\d{2,4}";
		String texto2 = "05/10/2010 05/05/2015 1/1/01 01/05/95";
		String regex3 = "proj([^,])+";
		String texto3 = "proj1.pkp, proj1.java, proj1.class, proj1final.java, proj2.pkp, proj3.java, diagrama, texto, foto";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(texto);
		Pattern pattern1 = Pattern.compile(regex1);
		Matcher matcher1 = pattern1.matcher(texto1);
		Pattern pattern2 = Pattern.compile(regex2);
		Matcher matcher2 = pattern2.matcher(texto2);
		Pattern pattern3 = Pattern.compile(regex3);
		Matcher matcher3 = pattern3.matcher(texto3);
		
		
		System.out.println("-----------------------------------------------");
		System.out.println("<<<<< Exemplo 01 - TEXTO STRING >>>>>");
		System.out.println("texto:  " + texto);
		System.out.println("texto - tamanho: " + texto.length());
		System.out.println("Expressão - Buscada: " + matcher.pattern());
		System.out.println("Posições encontradas: ");
		while(matcher.find()) {
			System.out.println("Posição: " + matcher.start() + " " + "Valor Encontrado: " + matcher.group());
		}
		System.out.println("-----------------------------------------------");
		System.out.println("<<<<< Exemplo 02 - EXPRESSÕES EMAIL >>>>> ");
		System.out.println("texto:  " + texto1);
		System.out.println("texto - tamanho: " + texto1.length());
		System.out.println("Expressão - Buscada: " + matcher1.pattern());
		System.out.println("Posições encontradas: ");
		
		while(matcher1.find()) {
			System.out.println("Posição: " + matcher1.start() + " " + "Valor encontrado: " + matcher1.group());
		}
		System.out.println("<<<< Utilizando o método matchs >>>>");
		System.out.println("Email Válido: " + "#@!abrao@mail.br".matches(regex1));
		
		System.out.println("------------------------------------------------");
		System.out.println("<<<< exemplo 03 - DATA >>>> ");
		System.out.println("texto:  " + texto2);
		System.out.println("texto - tamanho: " + texto2.length());
		System.out.println("Expressão - Buscada: " + matcher2.pattern());
		System.out.println("Posições encontradas: ");
		while(matcher2.find()) {
			System.out.println("Posição: " + matcher2.start() + " " + "Valor encontrado: " + matcher2.group());
		}
		
		System.out.println("------------------------------------------------");
		System.out.println("<<<<< Trabalhando com a negação de Expressões Regulares >>>>> ");
		System.out.println("texto:  " + texto3);
		System.out.println("texto - tamanho: " + texto3.length());
		System.out.println("Expressão - Buscada: " + matcher3.pattern());
		System.out.println("Posições encontradas: ");
		while(matcher3.find()) {
			System.out.println("Posição: " + matcher3.start() + " " + "Valor encontrado: " + matcher3.group());
		}
		
		
		
	}

}
