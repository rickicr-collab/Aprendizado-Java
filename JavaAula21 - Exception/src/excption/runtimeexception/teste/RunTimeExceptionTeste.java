package excption.runtimeexception.teste;


/*
 * TRABALHANDO COM RUNTIMEEXCEPTION
 * 
 * TIPOS DE RUNTIME EXCEPTION COMUNS
 * ARITMETHIC EXCEPTION: QUANDO É EXECUTADA ALGUMA OPERÇÃO ARITMETICA NÃO PERMITIDA
 * É GÉRADA ESSA EXCEÇÃO EM TEMPO DE EXECUÇÃO.
 * NULLPOINTEXCEPTION: QUANDO A VARIAVEL DE REFERENCIA DE UM A CLASSE ESTÁ INICIALIZADA 
 * COM VALOR NULO (NULL) É GERADO ESSA EXCEÇÃO EM TEMPO DE EXECUÇÃO.
 * ARRAYINDEXOUTOFBOUNDSEXCPETION: ELA É CHAMADA QUANDO EU SOLICITO NA EXECUÇÃO DO 
 * PROGRAMA UM VALOR QUE ESTÁ FORA DO TAMANHO ESPECIFIACDO DO ARRAY NA LISTA
 * 
 * AO REALIZAR O BLOCO TRY / CATCH
 * BLOCO TRY: SE O CODIGO RODAR DE FORMA NORMAL E CONCISA O UNICO CODIGO QUE SERÁ GERADO É O TRY.
 * BLOCO CATCH: CASO O CODIGO NÃO RODE NORMALMENTOE O CODIGO CATCH É ACIONADO DE ACORDO COM A 
 * EXCEPTION DECLARADA COMO PARAMENTRO TODAS AS FUNÇÕES I INFORMAÇÕES DO BLOCO CATCH SERÃO 
 * ACIONADAS A DIFERENÇA É QUE AO REALIZAR O TRATAMENTO DA EXCEÇÃO O SEU CODIGO 
 * CONTINUARÁ EM FUNCIONAMENTO.
 * 
 * TIPOS DE EXCECOES
 * ILLEGALARGUMENTEXCEPTION → EXCEÇÕES QUE ESTÁ RELACIONADA A
 * VALORES ERRADOS INSERIDOS.
 * 
 * 
 * FUNCÃO GETMESSAGE() USANDO PARA GERÁR MENSAGEMS PARA VISUALIZAÇÃO DE CLIENTES FINAIS.
 * FUNÇÃO PRINTSTACKTRACE() USADO PARA GERÁR UMA MENSAGEM DESTINADO A DESENVOLVEDORES ENTENDEREM SOBRE O
 * PROBLEMA NO PROJETO DO CODIGO.
 * 
 *  
 */

public class RunTimeExceptionTeste {

	public static void main(String[] args) {
		try {
			System.out.println("Realizando a Divisão");
			divisao(10,2);
		}catch(RuntimeException e){
			e.printStackTrace();
		}
		
	}
	
	private static void divisao(int num1, int num2){
		if(num2 == 0) {
			throw new IllegalArgumentException("Passe um valor diferente de 0 para num2");
		}
		double divisao =  num1 /  num2;
		System.out.println("Resultado: " + divisao);
		System.out.println("<<<<<Fim do Programa>>>>>");
	}

}
