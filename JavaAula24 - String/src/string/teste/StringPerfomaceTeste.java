package string.teste;

/*
 * PERFOMACES DE STRING:
 * 
 * QUANDO SE TRABALHA COM TEMPO NO JAVA EXISTE UM CLASSE CHAMADA SYSTEM 
 * QUE MOSTRA O TEMPO EM MILISEGUNDOS.
 * 
 * OBS: AO CRIAR O SISTEMA COM FOCO EM CRESCIMENTO ESCALAVEL VOCÊ O TORNA 
 * UM SISTEMA PREPARADO PARA TRABALHAR COM ELE OTIMIZANDO SUA ALTA PERFOMAÇE 
 * EM DEMANDA DE GRANDE QUANTIDADES DE DADOS EM PROCESSAMENTO SIMULTANEO E ISSO É
 * UMA BOA PRATICA PARA UTILIZAÇÃO.
 * 
 * 
 */

public class StringPerfomaceTeste {

	public static void main(String[] args) {
		Long timeInicio = System.currentTimeMillis();
		concatString(10);
		Long timeFinal = System.currentTimeMillis();
		System.out.println("O tempo pecorrido Foi: " + (timeFinal - timeInicio) + " ms");
		System.out.println("<<< Fim do Programa>>>");
		
		System.out.println("----------------------------");
		
		Long tIni = System.currentTimeMillis();
		concatStringBuilder(10);
		Long tFim = System.currentTimeMillis();
		System.out.println("O tempo pecorrido String: " + (tFim - tIni) + " ms");
		System.out.println("<<< Fim do Programa>>>");
		
		System.out.println("--------------------------------");
		
		Long temIni = System.currentTimeMillis();
		concatStringBuffer(10);
		Long temFim = System.currentTimeMillis();
		System.out.println("O tempo pecorrido String: " + (temFim- temIni) + " ms");
		System.out.println("<<< Fim do Programa>>>");

	}
	
	private static void concatString(int tam) {
		System.out.println("<<<Método para mostra Concatenação String>>>");
		String test = "";
		for(int i = 0; i < tam; i++) {
			test += i;
			//System.out.println("Resultado da concatenação: " + test);
		}
	}
	
	private static void concatStringBuilder(int tam) {
		System.out.println("<<<Método para mostra Concatenação String Builder>>>");
		StringBuilder sb = new StringBuilder(tam);
		for(int i = 0; i < tam; i++) {
			sb.append(i);
			//System.out.println("Resultado da concatenação: " + sb);
		}
	}
	
	private static void concatStringBuffer(int tam) {
		System.out.println("<<<Método para mostra Concatenação String Buffer>>>");
		StringBuffer bf = new StringBuffer(tam);
		for(int i = 0; i < tam; i++) {
			bf.append(i);
			//System.out.println("Resultado da concatenação: " + bf);
		}
	}
	
	
	
	

}
