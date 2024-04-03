package ioentradasaidadados.teste;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/*
 * COMENTARIOS SOBRE CLASSES FILEWRITER / FILEREADER:
 * 
 * FILEWRITE:
 * AO CRIAR UM NOVO OBJETO USANDO O CONSTRUTOR NEW O FILE WRITER PODE RECEBER 
 * UMA STRING COMO NOME OU UM ARQUIVO.
 * 
 * OBS1: AO TRABALHAR COM IO É POSSIVEL ENCANDEAR DIVERSAR CLASSE COMO POR 
 * EXEMPLO: 50 CLASSES , 10 INTERFACES E 15 EXCEPTION NOS PACOTES DE IO
 * ISSO PORQUE CADA CLASSE TEM ALTO NIVEL DE COESÃO COM UM OBJETIVO BEM ESPECIFICO.
 * 
 * FUNÇÕES:
 * FLUSH() → JOGA TODOS OS BITES A SEREM ESCRITOS NO ARQUIVO.
 * CLOSE() → FECHA O ARQUIVO APOS SER REALIZADO ALTERAÇÕES OU MODIFICAÇÕES.
 * 
 * FILEREADER:
 * CLASSE ESPECIALIZADA EM LEITURA DE ARQUIVOS.
 * 
 * 
 * 
 * EMBORA TENHA AULGUMAS APLICAÇÕES PARA POSSIVEIS MELHORIAS EM APLICAÇÕES NO 
 * DIA A DIA NÃO SÃO MUITO PRATICAS POIS PARA AMBAS FOI CRIADA DUAS CLASSES 
 * OTIMIZADAS PARA CADA UMA BUFFERWRITER / BUFFERREADER .
 */

public class FileWriteReaderTest {

	public static void main(String[] args) {
		File arquivo = new File("Arquivo.txt");
		System.out.println("<<<< Trabalhando com FileWriter / FileReader >>>>");
		System.out.println("Exemplo 01");
		try(FileWriter fw = new FileWriter(arquivo);
			FileReader fr = new FileReader(arquivo)){
			fw.write("Escrevendo no arquivo como exemplo\nE pulando uma linha 2\n");
			fw.flush();
			char[] in = new char[50];
			int size = fr.read(in);
			System.out.println("Tamanho: " + size);
			for(char c: in) {
				System.out.print(c);
			}
			System.out.println(" ");
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("---------------------------------------------------");
		System.out.println("<<<< Trabalhando com FileWriter / FileReader >>>>");
		System.out.println("exemplo 02");
		try {
			FileWriter fw = new FileWriter(arquivo);
			arquivo.createNewFile();
			fw.write("Escrevendo no arquivo como exemplo\nE pulando uma linha 2\n");
			fw.flush();
			fw.close();
			FileReader fr = new FileReader(arquivo);
			char[] in = new char[50];
			int size = fr.read(in);
			System.out.println("Tamanho: " + size);
			for(char c: in) {
				System.out.print(c);
			}
			fr.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
