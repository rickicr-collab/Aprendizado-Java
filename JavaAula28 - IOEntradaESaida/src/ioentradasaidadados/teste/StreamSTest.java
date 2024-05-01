package ioentradasaidadados.teste;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * COMENTARIOS SOBRE  CLASSE STREAM :
 * 
 * STREAMS NADA MAIS SÃO QUE FLUXO DE DADOS EM TRABALHO CONSTANTE.
 * 
 * POSSUI DUAS CLASSES IMPUTSTREAM E OUTPUTSTREAM.
 * AMBAS POSSUI MUITAS SUBCLASSES PARA TRATAMENTOS DE VARIAS INFORMAÇOES E
 * DADOS 
 * 
 * 
 * 
 */

public class StreamSTest {

	public static void main(String[] args) {
		gravador();
		leitor();
		gravadorTunado();
		leitorTunado();

	}
	
	private static void gravador() {
		System.out.println("-----------------------------------------------------");
		System.out.println("<<<<< Trabalhando com a classe FileoutputStream >>>>>");
		System.out.println("criando arquivo e gravando dados!");
		byte[] dados = {65, 66, 67, 68, 69, 70};
	try(FileOutputStream gravador = new FileOutputStream("Folder/stream.txt")){
		gravador.write(dados);
		gravador.flush();
		System.out.println("Dados gravados com sucesso!");
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	private static void gravadorTunado() {
		System.out.println("-----------------------------------------------------");
		System.out.println("<<<<< Trabalhando com a classe BufferedOutputStream >>>>>");
		System.out.println("criando arquivo e gravando dados de forma mais eficiente!");
		byte[] dados = {71, 72, 73, 74, 75, 76};
	try(BufferedOutputStream gravadorBuffer = new BufferedOutputStream(new FileOutputStream("Folder/stream2.txt"), 4098)){
		gravadorBuffer.write(dados);
		gravadorBuffer.flush();
		System.out.println("Dados gravados com sucesso!");
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	
	
	private static void leitor() {
		System.out.println("----------------------------------------------------");
		System.out.println("<<<<< Trabalhando com a classe FileInputStream >>>>>");
		System.out.println("lendo dados dentro do arquivo criado!");
		try(FileInputStream leitor = new FileInputStream("Folder/stream.txt")){
			int leitura;
			while((leitura = leitor.read()) != -1) {
				byte b = (byte) leitura;
				System.out.println("Dados: " + b);
			}
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	private static void leitorTunado() {
		System.out.println("----------------------------------------------------");
		System.out.println("<<<<< Trabalhando com a classe BufferedInputStream >>>>>");
		System.out.println("lendo dados dentro do arquivo criado de forma mais eficiente!");
		try(BufferedInputStream leitorBuffer = new BufferedInputStream(new FileInputStream("Folder/stream2.txt"), 4098)){
			int leitura;
			while((leitura = leitorBuffer.read()) != -1) {
				byte b = (byte) leitura;
				System.out.println("Dados: " + b);
			}
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	

}
