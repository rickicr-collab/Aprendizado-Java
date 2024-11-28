package nioentradaesaida.teste;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.PosixFileAttributes;
import java.nio.file.attribute.PosixFilePermission;
import java.nio.file.attribute.PosixFilePermissions;
import java.util.Set;

/*
 * COMENTARIOS SOBRE A INTERFACE POSIXFILESATTRIBUTES:
 * 
 * TEM SUA UTILIZAÇÃO EM SISTEMAS COM PADRÕES UNIX COMO LINUX , LIXUX UBUNTU
 * ENTRE OUTROS.
 * DEVIDO A ISSO É NECESSÁRIO UTILIZAR COMO OPÇÕES O SISTEMA LINUX OU UMA MAQUINA VIRTUAL.
 * 
 * OBS: A FUNÇÃO PERMISSION() RETORNA UM SET QUE SERIA → UM ARRAY DE ELEMENTOS UNICOS
 * QUE NÃO PODEM SER DUPLICADOS DENTRO DO ARRAY.
 * 
 * AO EXECUTAR A CLASSE EM UM SISTEMA OPERAIONAL DIFERENTE DOS SISTEMAS COM KERNEL DIFERENTES
 * SOS SITEMAS UNIX É GERADO UM ERRO EM TEMPO DE EXECUÇÃO CHAMADO UNSUPPORTEDOPERATIONEXCEPTION.
 * 
 * 
 */

public class PosixFileAttributesTest {

	public static void main(String[] args) throws IOException {
		System.out.println("<<<<< Trabalhando com interface PosixFileAttribute >>>>>>");
		Path path = Paths.get("C:\\Users\\Ricardo\\eclipse-workspace\\JavaAula29 - NIOEntradaESaida\\arquivo\\file.txt");
		PosixFileAttributes posix = Files.readAttributes(path, PosixFileAttributes.class);
		System.out.println("Permissões do arquivo: " + posix.permissions());
		System.out.println("Alterando as permissões");
		Set<PosixFilePermission> permissions = PosixFilePermissions.fromString("rw-rw-rw-");
		Files.setPosixFilePermissions(path, permissions);
		posix = Files.readAttributes(path, PosixFileAttributes.class);
		
	}

}
