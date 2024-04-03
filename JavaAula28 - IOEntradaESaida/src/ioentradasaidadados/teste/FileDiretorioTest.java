package ioentradasaidadados.teste;

import java.io.File;
import java.io.IOException;

/*
 * COMENTÁRIOS SOBRE FILE DIRECTORY:
 * 
 * PARA A CRIAÇÃO DE DIRETÓRIOS É POSSIVEL UTILIZAR OS COMANDO DO SISTEMA OPERACIONAL
 * LINUX POR EXEMPLO MKDIR() QUE RETORNA UM BOOLEANO AO CRIAR UM DIRETORIO NO SISTEMA.
 * 
 * OBS: CASO O DIRETORIO JA EXISTA ELE FARÁ APENAS REFERENCIA A O DIRETORIO JÁ CRIADO.
 * 
 * FORMAS DE CRIAR UM ARQUIVO DENTRO DO DIRETORIO CRIADO:
 * 1ª FORMA → É PASSANDO O CAMINHO ABSOLUTO NO PARAMETRO NO CONSTRUTOR FILE COM 
 * ISSO SERÁ CRIADO UM ARQUIVO DENTRO DO DIRETORIO CRIADO.
 * 2ª FORMA → É PASSNADO A VARIAVEL DE REFENRENCIA COMO PARAMETRO DENTRO DO CONSTRUTOR
 * FILE COM ISSO TAMBEM SERÁ CRIADO UM ARQUIVO DENTRO DO DIRETÓRIO.
 * 
 * 
 */

public class FileDiretorioTest {

	public static void main(String[] args) throws IOException{
		System.out.println("<<<< trabalhando com File Directory >>>> ");
		File diretorio = new File("Folder");
		boolean mkdir = diretorio.mkdir();
		System.out.println("Diretorio criado? : " + mkdir);
		
		System.out.println(">>>> testando renomear um diretório<<<<");
		File novoDiretorio = new File("new_folder");
		boolean renamed2 = diretorio.renameTo(novoDiretorio);
		System.out.println("Novo diretorio renomeado? : " + renamed2);
		
		File arquivo = new File(novoDiretorio , "arquivoteste.txt");
		System.out.println("Arquivo criado?" + arquivo.createNewFile());

		System.out.println(">>>>testando renomear o arquivo<<<<");
		File arquivoNovoNome = new File(diretorio, "arquivo_renomeado.txt");
		boolean renamed = arquivo.renameTo(arquivoNovoNome);
		System.out.println("Arquivo foi renomeado : " + renamed);
		
		System.out.println(">>>> Realizando uma busca no diretorio <<<<");
		buscarArquivos();
		
	}
	
	public static void buscarArquivos() {
		File file = new File("new_folder");
		String[] list = file.list();
		int tamanho = list.length;
		System.out.println("Quantidade de Arquivos: " + tamanho);
		for(String i: list) {
			System.out.println("Arquivos: " + i);
		}
		
	}

}
