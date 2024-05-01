package nioentradaesaida.teste;

import java.nio.file.Path;
import java.nio.file.Paths;

/*
 * COMENTÁRIOS SOBRE RELATIVIZAÇÃO DE PATHS:
 * 
 * UTILIZANDO A FUNÇÃO PADRÃO DA CLASSE PATH CHAMADA RELATIVIZE()
 * É POSSIVEL RELATIVIZAR O CAMINHO DO DESTINO DENTRO DE UM PATH 
 * PEGANDO O QUE TEM EM COMUNO ENTRE OS DOIS ENTRE CAMINHO DE ORIGEM E 
 * DESTINO E ELIMINA.
 * 
 * AO CONTRARIO DA FUNÇÃO RESOLVE() QUE JUNTA OS CAMINHOS DE ORIGEM E 
 * DESTINO.
 * 
 * NO EXEMPLO 5 O JAVA IRÁ GERAR UM ERRO EM TEMPO DE EXECUÇÃO PORQUE 
 * O MESMO NÃO CONSEGUE ENCONTRAR O LOCAL EXATO DA PASTA TEMP MESMO QUE 
 * RETORNE A ORIGEM NO RELATIVO1.
 * 
 * 
 */

public class Relativizartest {

	public static void main(String[] args) {
		tituloRelativized();
		System.out.println("Exemplo 01");
		Path dir = Paths.get("/home/Ricardo");
		Path classe = Paths.get("/home/Ricardo/java/arquivo.txt");
		Path pathToClasse = dir.relativize(classe);
		System.out.println("Exemplo de Função Relativize: " + pathToClasse);
		
		System.out.println("------------------------------------------");
		tituloRelativized();
		System.out.println("Exemplo 02");
		
		Path absoluto1 = Paths.get("/home/Ricardo");
		Path absoluto2 = Paths.get("/user/local");
		Path absoluto3 = Paths.get("/home/Ricardo/java/arquivo.txt");
		Path relativo1 = Paths.get("temp");
		Path relativo2 = Paths.get("temp/Funcionario.java");
		System.out.println("Primeiro 1º: " + absoluto1.relativize(absoluto3));
		System.out.println("Segundo  2º: " + absoluto3.relativize(absoluto1));
		System.out.println("Terceiro 3º: " + absoluto1.relativize(absoluto2));
		System.out.println("Quarto   4º: " + relativo1.relativize(relativo2));
		System.out.println("Quinto   5º: " + absoluto1.relativize(relativo1));
		
		
		
		
		
		
	}
	
	public static void tituloRelativized() {
		System.out.println("<<<<< Trabalhando com Relativização >>>>> ");
		
		
	}
	
	
	

}
