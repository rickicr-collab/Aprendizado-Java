package nioentradaesaida.teste;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributeView;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileTime;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/*
 * COMENTARIOS SOBRE ATRIBUTOS BÁSICOS BASICFILEATRIBUTTE / BASICFILEATRIBUTTEVIEW:
 * 
 * AGORA É POSSIVEL TRABALHAR COM INTERFACES QUE ESTÃO SEPARADAS DA SEGUINTE FORMA PARA VISUALIZAR DOS ATRIBUTOS BASICOS:
 * 
 *  → BASICFILESATTRIBUTES
 *  → POSIXFILESATTRIBUTES
 *  → DOSFILEATTRIBUTES
 * 
 * PARA MODIFICCAÇÃO DOS ATRIBUTOS BASICOS  POSSUIMOS AS INTERFACES:
 *  → BASICFILESATTRIBUTEVIEW
 *  → POSIXBASICATTRIBUTEVIEW
 *  → DOSFILEATTRIBUTEVIEW
 *  → FILEOWNERATTRIBUTEVIEW: USADO PARA REALIZAR A FUNÇÃO SET DO DONO OU DIRETORIO PRINCIPAL DO ARQUIVO.
 *  → ACLFILEATTIRIBUTEVIEW: USADO POR POSSUIR ALGUMAS PERMISSOES A MAIS PARA TRBALHAR COM DIRETORIOS OU ARQUIVOS.
 *  
 * 
 * 
 * 
 */

public class AtributosBasicosTest {

	public static void main(String[] args) throws IOException {
		System.out.println("<<<<< Trabalhando com FileAtributtes >>>>>>");
		System.out.println(" Verificando ultima modificação usando file");
		Date primeiroDeDezembro = new GregorianCalendar(2024, Calendar.DECEMBER, 1).getTime();
		File arquivo = new File("C:\\Users\\Ricardo\\eclipse-workspace\\JavaAula29 - NIOEntradaESaida\\pasta\\arquivo.txt");
		arquivo.createNewFile();
		arquivo.setLastModified(primeiroDeDezembro.getTime());
		System.out.println("Resultado: " + arquivo.lastModified());
		if(arquivo.exists()) {
			System.out.println("arquivo criado");
		}
		arquivo.delete();
		System.out.println("------------------------------------------");
		System.out.println("Verificando ultima modificação usando Path");
		Path arquivo1 = Paths.get("C:\\Users\\Ricardo\\eclipse-workspace\\JavaAula29 - NIOEntradaESaida\\pasta\\arquivo_path.txt");
		Files.createFile(arquivo1);
		FileTime tempArquivo = FileTime.fromMillis(primeiroDeDezembro.getTime());
		Files.setLastModifiedTime(arquivo1, tempArquivo);
		System.out.println("Arquivo criado");
		System.out.println("Resultado: " + Files.getLastModifiedTime(arquivo1));
		Files.deleteIfExists(arquivo1);
		System.out.println("Arquivo deletado!!!");
		
		System.out.println("-----------------------------------------------");
		System.out.println("Atributos Basicoas");
		arquivo1 = Paths.get("C:\\Users\\Ricardo\\git\\Aprendizado-Java\\JavaAula06 - Classes\\src\\classes\\Carro.java");
		System.out.println("Resultado usando função isReadable: " + Files.isReadable(arquivo1));
		System.out.println("Resultado usando função isWritable: " + Files.isWritable(arquivo1));
		System.out.println("Resultado usando função isExecutable: " + Files.isExecutable(arquivo1));
		
		System.out.println("-------------------------------------------------");
		System.out.println("Trabalhando com interfaces visualizando atributos basicos usando BasicFilesAttributes");
		System.out.println("Exemplo 01");
		BasicFileAttributes atributosBasicos = Files.readAttributes(arquivo1, BasicFileAttributes.class);
		System.out.println("resultado usando creatonTime: " + atributosBasicos.creationTime());
		System.out.println("resultado usando lastaccestime: " + atributosBasicos.lastAccessTime());
		System.out.println("resultado usando lastmodifiedtime: " + atributosBasicos.lastModifiedTime());
		System.out.println("resultado usando isDirectory: " + atributosBasicos.isDirectory());
		System.out.println("resultado usando isSymbolicLink: " + atributosBasicos.isSymbolicLink());
		System.out.println("resultado usando isRegularFile: " + atributosBasicos.isRegularFile());
		
		System.out.println("---------------------------------------------------");
		System.out.println("Interfaces para alterar os atributos básicos usando BasicFilesAttributesView");
		System.out.println("Exemplo 02");
		FileTime lastModifield = atributosBasicos.lastModifiedTime();
		FileTime created = atributosBasicos.creationTime();
		FileTime lastAccess = FileTime.fromMillis(System.currentTimeMillis());
		
		BasicFileAttributeView basicView = Files.getFileAttributeView(arquivo1, BasicFileAttributeView.class);
		basicView.setTimes(lastModifield, created, lastAccess);
		atributosBasicos = Files.readAttributes(arquivo1, BasicFileAttributes.class);
		System.out.println("resultado usando creatonTime: " + atributosBasicos.creationTime());
		System.out.println("resultado usando lastaccestime: " + atributosBasicos.lastAccessTime());
		System.out.println("resultado usando lastmodifiedtime: " + atributosBasicos.lastModifiedTime());
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
