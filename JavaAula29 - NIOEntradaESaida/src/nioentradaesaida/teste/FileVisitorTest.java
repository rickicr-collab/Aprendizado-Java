package nioentradaesaida.teste;

import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;



/*
 * COMENTÁRIOS SOBRE FILEVISITOR:
 * 
 * É POSSIVEL UTILIZAR A CLASSE SIMPLEFILEVISITOR PARA FILTRAR UMA BUSCA POR TODOS OS ARQUIVOS 
 * DO TIPO BKP DENTRO DE UM DIRETORIO.
 * 
 * REALIZANDO OVERRIDE NO MÉTODO FILEVISITRESULT VISITFILE() É POSSIVEL REALIZAR ESSA BUSCA.
 * 
 * USANDO UM MÉTODO DA CLASSE FILEVISITOR É POSSIVEL REALIZAR A BUSCA 
 * 
 * OBS: É POSSIVEL TER QUANTAS CLASSES QUISER NO ENTANTO É POSSIVEL APENAS UM UNICA CLASSE PUBLICA 
 * CONTENTO O NOME DO ARQUIVO DA CLASSE.
 * 
 * 
 * PARA ROMPER A BUSCA DENTRO DO DIRETORIO USA-SE O RETORNO TERMINATE;
 * PARA IGNORAR UMA PASTA DE ALGUMA BUSCA USA-SE O RETORNO SKIP_SUBTREE;
 * ELE IGNORA QUALQUER PASTA DENTRO DO MESMO NIVEL NO DIRETORIO RETORNO SKIP_SUBLINGS;
 * 
 * 
 * 
 */

class AcharTodosBkp extends SimpleFileVisitor<Path>{
	

	@Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) {
		if(file.getFileName().toString().endsWith(".bkp")) {
			System.out.println("Nome do arquivo: " + file.getFileName());
		}
		return FileVisitResult.CONTINUE;
		
	}
}

public class FileVisitorTest {

	public static void main(String[] args) throws IOException {	
		System.out.println("<<<<< Metodo classe AcharTodosBkp >>>>>");
		Files.walkFileTree(Paths.get("pasta"), new AcharTodosBkp());
		System.out.println("----------------------------------------");
		System.out.println("<<<<< Metodo Classe Printdire >>>>>>");
		Files.walkFileTree(Paths.get("pasta"), new PrintDire());
	
	}

}


class PrintDire extends SimpleFileVisitor<Path>{
	
	public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs) {
		System.out.println("Método Pré-visita");
		System.out.println("Pre: " + dir);
		if(dir.getFileName().toString().equals("sobrepasta")) {
			return FileVisitResult.TERMINATE;
		}
		return FileVisitResult.CONTINUE;
	}
	
	
	@Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) {
		System.out.println("Método Visita");
		System.out.println("Nome do arquivo: " + file.getFileName());
		return FileVisitResult.CONTINUE;
		
	}
	@Override
	public FileVisitResult visitFileFailed(Path file, IOException exc) {
		System.out.println("Método Visita Falha");
		return FileVisitResult.CONTINUE;
	}
	
	@Override
    public FileVisitResult postVisitDirectory(Path dir, IOException exc) {
		System.out.println("Método Post Visita");
		System.out.println("post: " + dir);
		return FileVisitResult.CONTINUE;
		
	}
	
	
	
	
}
