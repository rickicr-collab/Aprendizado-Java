package NIOatualizado.relativize;

import java.nio.file.Path;
import java.nio.file.Paths;

public class ClassNIORelativize {

	public static void main(String[] args) {
		titulo();
		Path dir = Paths.get("/Home/ricardo");
		Path classe = Paths.get("/home/ricardo/devdojo/olaMundo.java");
		Path dirToClasse = dir.relativize(classe);
		System.out.println("Relativizando o Path: " + dirToClasse);
		System.out.println("### outros Exemplos ###");
		Path absolute1 = Paths.get("/home/ricardo");
		Path absolute2 = Paths.get("/user/local");
		Path absolute3 = Paths.get("/home/ricardo/devdojo/olaMundo.java");
		Path relative1 = Paths.get("temp");
		Path relative2 = Paths.get("temp/temp.151245454");
		
		System.out.println("Relativisando (caminho absoluto com absoluto) [caso 1: " + absolute1.relativize(absolute3) + "]");
		System.out.println("Relativisando (caminho absoluto com absoluto) [caso 2: " + absolute3.relativize(absolute1) + "]");
		System.out.println("Relativisando (caminho absoluto com absoluto) [caso 3: " + absolute1.relativize(absolute2) + "]");
		System.out.println("Relativisando (caminho relativo com relativo) [caso 4: " + relative1.relativize(relative2) + "]");
		System.out.println("Relativizando (caminho absoluto com relativo) [caso 5: " + absolute1.relativize(relative1) + "]");
		

	}

	public static void titulo() {
		System.out.println("------------------------------------------");
		System.out.println("     Class Utilities - NIO Relativize     ");
		System.out.println("------------------------------------------");
	}

}
