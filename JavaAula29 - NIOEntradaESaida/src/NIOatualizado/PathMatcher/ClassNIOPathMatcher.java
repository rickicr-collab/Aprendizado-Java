package NIOatualizado.PathMatcher;

import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.nio.file.PathMatcher;
import java.nio.file.Paths;

public class ClassNIOPathMatcher {
	public static void main(String[] args) {
		titulo();
		Path path1 = Paths.get("pasta/subpasta/file.bkp");
		Path path2 = Paths.get("pasta/subpasta/file.txt");
		Path path3 = Paths.get("pasta/subpasta/file.java");
		matches(path1, "glob:*.bkp");
		matches(path1, "glob:**.bkp");
		matches(path1, "glob:**/*.bkp");
		matches(path1, "glob:**/*.{bkp,txt,java}"); // não deve haver espaços entre as virgulas - caso contrario retorna false
		matches(path2, "glob:**/*.{bkp, txt, java}"); // exemplo ao utilizar espaco entre as chaves - retornando false
		matches(path3, "glob:**/*.{bkp,txt,java}");
		matches(path1, "glob:**/*.???"); // exemplo quando se quer verificar uma extensão que possue treis letras.
		matches(path2, "glob:**/*.???");
		matches(path3, "glob:**/*.???"); // retorna falso porque a extensaão possue quatro letras.
		matches(path1, "glob:**/file.???"); // caso quando se procura um nome especifico com extensão contendo 3 letras - retorna true.
		matches(path3, "glob:**/file.???"); // caso quando se procura um nome especifico com extensão contendo 3 letras - retorna false.

	}

	public static void titulo() {
		System.out.println("----------------------------------------------");
		System.out.println("        Class Utilities NIO PathMatcher       ");
		System.out.println("----------------------------------------------");
		
		System.out.println("Trabalhando com glob:");
	}

	private static void matches(Path path, String glob) {
		PathMatcher matcher = FileSystems.getDefault().getPathMatcher(glob);
		System.out.println("Path: " + path + " - " + glob + ": [" + matcher.matches(path) + "]");
	}

}
