package nioentradaesaida.teste;

import java.nio.file.Path;
import java.nio.file.Paths;

/*
 * COMENTÁRIOS SOBRE RESOLUÇÃO DE PATHS:
 * 
 * OBS: O DIRETÓRIO OU O ARQUIVO NÃO PRECISA EXISTIR PARA REALIZAR A NORMALIZAÇÃO DE PATHS.
 *  
 *  
 *  
 */

public class ResolvendoPathsteste {
	public static void main(String[] args) {
		System.out.println("<<<<< Trabalhando com a função Resolve() - Paths >>>>> ");
		System.out.println("-------- Exemplo 01 ---------");
		Path dir = Paths.get("home\\Ricardo");
		Path arquivo = Paths.get("dev\\arquivo.txt");
		Path result = dir.resolve(arquivo);
		System.out.println(result);
		
		System.out.println("-------- Exemplo 02 ---------");
		Path absoluto = Paths.get("/home/Ricardo");
		Path relativo = Paths.get("dev");
		Path file = Paths.get("file.txt");
		
		System.out.println("1: " + absoluto.resolve(relativo));
		System.out.println("2: " + absoluto.resolve(file));
		System.out.println("3: " + relativo.resolve(file));
		System.out.println("4: " + relativo.resolve(absoluto));
		System.out.println("5: " + file.resolve(relativo));
		System.out.println("6: " + file.resolve(absoluto));
		
		
		
		
	}

}
