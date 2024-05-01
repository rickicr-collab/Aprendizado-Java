package nioentradaesaida.teste;

import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.PathMatcher;
import java.nio.file.Paths;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;


/*
 * COMENTÁRIOS SOBRE A CLASSE PATH MATCHER:
 * 
 * FOI FEITO PARA QUE POSSA MELHORAR A BUSCA DE ARQUIVOS DENTRO DOS DIRETÓRIOS
 * USANDO O CLASSE FILEVISITOR. FOI UMA CLASSE CRIADA PENSANDO EM MELHORAR OS MÉTODOS DE BUSCA
 * PARA QUE ELES NÃO POSSA SER MUITO EXTENSOS E TRABALHSOSO.
 * 
 * AO UTILIZAR A FUNÇÃO GETPATCHMATCHER() UTILIZA-SE UM PARAMETRO STRING PATTERN CHAMADO " GLOB:".
 * 
 * MÉTODO USADO PARA QUE OS CARACTERES CONTRABARRA ("\") NOS SISTEMAS OPERACIONAIS LINUX SEJA ACEITOS 
 * E NÃO GEREM ERROS EM EXECUÇÃO DOS PROGRAMAS NOS SISTEMAS OPERACIONAIS LINUX JÁ QUE NOS MESMO HA 
 * REGRAS QUE NÃO ACEITAM CONTRA-BARRA COMO SEPARADOR DE CAMINHOS NOS DIRETÓRIOS.
 * 
 * CARACTERES DE FILTROS : **.BKP ( QUALQUER COISAS QUE SEJA EXTENSÃO DE ARQUIVO BKP);
 * CARACTERER DE FILTRO : **("/") BKP(TAMBEM PODE FILTRAR QUALQUER 
 * COISA QUE VENHA ANTES QUE SEJA SEGUIDO DE ARQUIVO BKP);
 * 
 */



class FindAllTest extends SimpleFileVisitor<Path>{
	private PathMatcher matcher = FileSystems.getDefault().getPathMatcher("glob:**/*[Test*].java");

	@Override
	public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
		if(matcher.matches(file)) {
			System.out.println("Nome do Arquivo: " + file.getFileName());
		}
		return FileVisitResult.CONTINUE;
	}
	
	
}


public class PathMatcherTest {

	public static void main(String[] args) throws IOException {
		System.out.println("<<<< Busca dentro de diretórios >>>>>");
		Path path1 = Paths.get("pasta/sobrepasta/sobrepasta/file2.bkp");
		Path path2 = Paths.get("file.bkp");
		Path path3 = Paths.get("home");
		Files.walkFileTree(path1, new AcharTodosBkp());
		PathMatcher matcher = FileSystems.getDefault().getPathMatcher("glob:*.bkp");
		System.out.println("Caminho de Diretório 01: " + matcher.matches(path1));
		System.out.println("Caminho de Diretório 02: " + matcher.matches(path2));
		System.out.println("-----------------------------------------------------------");
		System.out.println("<<<<< Usando método criado matches >>>>>");
		matches(path1, "glob: *.bkp");
		matches(path2, "glob: **.bkp");
		matches(path1, "glob: **/*.bkp");
		matches(path2,"glob:**");
		System.out.println("-----------------------------------------------------------");
		System.out.println("<<<<< verificando quantos caracterees possue a extensão >>>>>");
		matches(path3, "glob: {home*}");
		matches(path3, "glob: {home}*");
		matches(path3, "glob: {home}");
		System.out.println("--------------------------------------------------------------");
		System.out.println("Fazendo uma busca em arquivos tipo teste / Java ou Class");
		Files.walkFileTree(Paths.get("C:\\Users\\Ricardo\\eclipse-workspace\\JavaAula29 - NIOEntradaESaida\\src\\nioentradaesaida\\teste"), new FindAllTest());
		

	}
	
	private static void matches(Path path, String glob) {
		PathMatcher matcher = FileSystems.getDefault().getPathMatcher("glob:*.bkp");
		System.out.println(glob + ": " + matcher.matches(path));
	}

}
