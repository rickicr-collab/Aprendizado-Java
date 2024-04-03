package ioentradasaidadados.teste;

import java.io.File;
import java.io.IOException;
import java.util.Date;


/*
 * COMENTÁRIOS SOBRE A CLASSE FILE:
 * 
 * CLASSE MAIS BÁSICA PARA CRIAÇÃO DE ARQUIVOS
 * 
 * OBS1: PARA CRIAR UM ARQUIVO DENTRO DO DIRETORIO ATUAL DO PROJETO É NECESSÁRIO
 * APENAS COLOCAR O NOME DO ARQUIVO, CASO SEJA COLOCADO EM OUTRO LUGAR VOCÊPODE UTILIZAR
 * A FUNÇÃO COPY PATH PARA COPIAR O DIRETORIO FINAL PARA ONDE O ARQUIVO CRIADO ESTARÁ
 * (É NECESSARIO INFORMAR O CAMINHO COMO PARAMENTRO AO INSTANCIAR O NOVO OBJETO COM 
 * O CONSTRUTOR NEW()).
 * 
 * OBS2:  É POSSIVEL CRIAR UM ARQUIVO DENTRO DE UM SYSOUT PRINT  O ARQUIVO SERÁ CRIADO 
 * E O ESTADO SE FOR POSSIVEL CRIAR UM ARQUIVO COM TRUE / OU FALSE SE O ARQUIVO EXISTE 
 * E NÃO PODE SER CRIADO NOVAMENTE.
 * 
 * FUNÇÕES:
 * CREATENEWfILE() → CRIA UM NOVO ARQUIVO DA CLASSE FILE (É NECESSARIO TRATA EXCEÇÕES).
 * EXIST() → VERIFICA SE O ARQUIVO EXISTE.
 * DELETE() → DELETA O ARQUIVO EXISTENTE.
 * CANREADER() → VERIFICA SE O ARQUIVO TEM PERMISSÃO DE LEITURA.
 * GETPATH() → MOSTRA O LOCAL DE ORIGEM DO ARQUIVO EXISTENTE NO CONSTRUTO DDA CLASSE FILE.
 * GETABSOLUTEPATH() → MOSTRA O CAMINHO TOTAL DE ONDE O ARQUIVO SE ENCONTRA NO COMPUTADOR.
 * ISDIRECTORY() → MOSTRA SE O ARQUIVO É UM DIRETORIO.
 * ISHIDDEN() → MOSTRA SE É UM ARQUIVO OCULTO.
 * LASTMODIFIED() → MOSTRA A ULTIMA VEZ QUE O ARQUIVO FOI MODIFICADO
 * COMO É UM ARQUIVO DO TIPO LONG É NECESSARIO UTILIZAR A CLASSE DATE PARA
 * CONVERTER O VALOR EM MILISEGUNDOS EM FORMATO DE HORA.
 * 
 * 
 */

public class Fileteste {

	public static void main(String[] args){
		File arquivo = new File("Arquivo.txt");
		try {
			System.out.println("Arquivo criado: " + arquivo.createNewFile());
			System.out.println("Arquivo existe: " + arquivo.exists());
			System.out.println("Tem permissao de leitura: " + arquivo.canRead());
			System.out.println("Qual o caminho do arquivo?: " + arquivo.getPath());
			System.out.println("Caminho absoluto? : " + arquivo.getAbsolutePath());
			System.out.println("Isso é um diretorio?: " + arquivo.isDirectory());
			System.out.println("O arquivo é oculto?: " + arquivo.isHidden());
			System.out.println("Quando o arquivo foi modificado?: " + new Date(arquivo.lastModified()));
			if(arquivo.exists()) {
				System.out.println("Deletado? : " + arquivo.delete());
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
