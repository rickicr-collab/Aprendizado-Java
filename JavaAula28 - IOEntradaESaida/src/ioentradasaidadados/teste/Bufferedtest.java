package ioentradasaidadados.teste;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/*
 * COMENTARIOS SOBRE AS CLASSES BUFFERED WRITER / BUFEFRED READER:
 * 
 * AMBAS AS CLASSES SERVERM PARA SE TRABALHAR COM ARQUIVOS EXTENSOS.
 * 
 * OBS1: A CLASSE BUFFERED WRITER POSSUI FUNCÕES COMO NEWLINE() QUE REALIZAM 
 * A QUEBRA DE LINHA ATRAVEZ DE CARACTER OCULTO SEM NECESSIDADE DE DIGITAR
 * CARACTER ESPECIAL \N PARA QUEBRA DE LINHA.
 * 
 * 
 * OBS2: NO BUFFEREDREADER É TRABALHADO DE FORMA DIFERENTE QUE NO FILEREADER PARA VISUALIZAÇÃO DE ARQUIVOS
 * USANDO O MÉTODO READLINE() ELE VISUALIZA UMA LINHA DENTRO DO ARQUIVO EM VEZ DE LER CARACTER POR CARACTER
 * E RETORNA UMA STRING NO ENTANTO , ENTRETANTO O MÉTODO READLINE() ASSIM QUE ELE TERMINA DE LER A ALINHA DO
 * ARQUIVO ELE TEM UM RETORNO NULO DEVIDO A ISSO É NECESSÁRIO CRIAR UM WHILE ONDE A STRING CRIADA RECEBE COMO 
 * VALOR O OBJETO DA CLASSE BUFFEREDREADER USANDO FUNÇÃO READLINE() ENQUANTO O VALOR FOR DIFERENTE DE NULO.
 * 
 * OBS3: COM O TRY WITCH RESOURCES VOCÊ PODE ECONOMIZAR ALGUMAS LINHAS DE CODIGO CONSEGUINDO O MÉSMO RESULTADO.
 * 
 * 
 * 
 */

public class Bufferedtest {

	public static void main(String[] args) {
		System.out.println("<<<<< Trabalhando com as classes Buffered Writer /  Buffered Reader >>>>> ");
		System.out.println("Exemplo 01 - Usando Buffered Writer / Buffered Reader");
		File arquivo = new File("Arquivo2.txt");
		try {
			FileWriter fw = new FileWriter(arquivo);
			BufferedWriter bw = new BufferedWriter(fw);
			arquivo.createNewFile();
			bw.write("Escrevendo no arquivo como exemplo");
			bw.newLine();
			bw.write("E pulando uma linha corretamente 2");
			bw.newLine();
			bw.flush();
			bw.close();
			FileReader fr = new FileReader(arquivo);
			BufferedReader br = new BufferedReader(fr);
			String s = null;
			while((s = br.readLine()) != null) {
				System.out.println(s);
			}
			br.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("----------------------------------------------");
		System.out.println("<<<< Trabalhando com Try witch Resoucers >>>> ");
		System.out.println("Exemplo 01 - com Try witch Resources para economizar codigo");
		try(BufferedWriter bw = new BufferedWriter(new FileWriter(arquivo));
			BufferedReader br = new BufferedReader(new FileReader(arquivo))){
			bw.write("Escrevendo no arquivo como exemplo");
			bw.newLine();
			bw.write("E pulando uma linha corretamente 2");
			bw.newLine();
			bw.flush();
			String s;
			while((s = br.readLine()) != null) {
				System.out.println(s);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
