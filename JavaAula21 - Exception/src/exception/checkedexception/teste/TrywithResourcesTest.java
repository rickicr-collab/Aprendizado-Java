package exception.checkedexception.teste;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

import checkedexception.classes.Leitor1;
import checkedexception.classes.Leitor2;

/*
 *  TRABALHANDO EXECEÇÕES NO JAVA ATE VERSÃO 6:
 *  COMO EXEMPLO USANDO A FUNÇÃO READER PARA ABRIR ARQUIVOS NO JAVA 
 *  É POSSIVEL ABRIR ARQUIVOS TIPO TEXTO POR EXEMPLO O PROBLEMA É QUE 
 *  QUANDO TENTAMOS ABRIR ELA GEROU UM EXCEÇÃO DE ARQUIVO NAO ENCONTRADO
 *  A EXCEÇÃO DEVE SER TRATADA NORMALMENTE .
 *  A QUESTÃO É QUE TODO ARQUIVO QUE É ABERTO DEVER SER FECHADO POIS O MESMO CONSOME 
 *  ESPACOS EM MEMORIAR SE HOUVER O MESMO ARQUIVO ABERTO PARA MAIS USUARIOS
 *  AO FECHAR O ARQUIVO É GERADO UMA EXCEÇÃO IOEXCEPTION QUE TAMBEM DEVE SER TRATADA 
 *  POR EXEMPLO NUM BLOCO FINALLY.
 *  
 *  TRABAÇHANDO COM JAVA WITH RESOURCES:
 *  
 *  VOCE PASSA A RESPONSABILIDADE PARA O JAVA FECHAR CONEXÕES EXISTENTES.
 *  NA MESMA LINHA DO TRY VC DECLARA A VARIAVEL E INICIALIZA A MESMA COM A FUNÇÃO DE LEITURA
 *  SEM ESQUECER DE TRATAR A EXCEÇÃO QUE SERÁ GERADA COM ESSA AÇÃO .
 *  OBS: PARA UTILIZAR O MÉTODO TRY WITH RESOURCES É NECESSARIO UTILIZAR CLASSES QUE 
 *  HERDEIRAS DA CLASSE CLOSEABLE.
 *  OBS2: A UTILIZAR ESSE RECURSO TRY WITH RESOURCE NÃO HÁ NECESSIDADE DE UTILIZAR UM CATCH
 *  NO ENTANTO VC PRECISA DECLARAR A EXCEÇÃO EXPECIFICA NO MÉTODO E DENTRO DO MÉTODO MAIN .
 *  OBS3: SE VOCE IMPLEMENTA EM CLASSES E REFERENCIA MAIS DE UM OBJETO DENTRO DO TRY DEPOIS 
 *  DE REAIZAR OS TRATAMENTOS DE EXCEÇÕES NECESSARIOS ELE EXECUTA OS MÉTODOS DE BAIXO PARA CIMA.
 *  
 */

public class TrywithResourcesTest {

	public static void main(String[] args) {
		lerArquivoOld();
		lerArquivoNew();
		leitorTeste();

	}
	
	
	public static void leitorTeste() {
		System.out.println("-------------------------------");
		System.out.println("Metodo Leitor teste");
		try(Leitor2 leitor2 = new Leitor2();
			Leitor1 leitor1 = new Leitor1();){
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public static void lerArquivoOld() {
		System.out.println("---------------------------------------------");
		Reader reader = null;
		try {
			System.out.println("Dentro do Try - Metodo LerarquivoOld");
			reader = new BufferedReader(new FileReader("test.txt"));
		} catch (FileNotFoundException e) {
			System.out.println("dentro do catch - Arquivo não encontrado");
			e.printStackTrace();
		}finally {
			try {
				if(reader != null) {
					reader.close();
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("<<<Fim do Programa>>>");
	}
	
	public static void lerArquivoNew()  {
		System.out.println("-------------------------------------");
		System.out.println("Antes do try - LerArquivoNew");
		try(Reader reader = new BufferedReader(new FileReader("test.txt"))){
			System.out.println("Dentro do Try - Metodo LerarquivoNew");
		}catch(IOException e) {
			e.printStackTrace();
		}
		System.out.println("<<<Fim do Programa>>>");
	}

}
