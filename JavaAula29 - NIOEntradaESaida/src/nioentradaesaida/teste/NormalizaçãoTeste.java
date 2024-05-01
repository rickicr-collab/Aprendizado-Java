package nioentradaesaida.teste;

/*
 * COMENTÁRIOS SOBRE NORMALIZAÇÃO DE PATHS:
 * 
 * A FUNÇÃO NORMALIZE(): GERA O CAMINHO COMPLETO QUANDO SE QUER MOVER DE UM DIRETORIO
 * A OUTRO BUSCANDO UM ARQUIVO DECLARANDO EM DETERMINADO CAMINHO.
 * 
 * OBS: MESMO REALIZANDO A NORMALIZAÇÃO COMA FUNÇÃO NORMALIZE() NÃO GARANTE QUE O ARQUIVO
 * VAI EXISTIR DENTRO DO CAMINHO.
 * 
 */

import java.nio.file.Path;
import java.nio.file.Paths;

public class NormalizaçãoTeste {

	public static void main(String[] args) {
		System.out.println("<<<< Trabalhando com Normalização de Paths >>>> ");
		System.out.println("------- Exemplo 01 --------");
		String diretorioProjeto = "\\JavaAula29 - NIOEntradaESaida\\home\\Ricardo\\dev";
		String arquivotxt = "..\\..\\arquivo.txt";
		Path p1 = Paths.get(diretorioProjeto, arquivotxt);
		System.out.println("Sem função normalizar: " + p1);
		System.out.println("Com função normalizar: " + p1.normalize());
		System.out.println("------- Exemplo 02 --------");
		Path p2 = Paths.get("home/./Ricardo/./dev");
		System.out.println("Sem função normalize: " + p2);
		System.out.println("Com função normalize: " + p2.normalize());
		

	}

}
