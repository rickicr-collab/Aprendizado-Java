package exception.checkedexception.teste;

import java.io.File;
import java.io.IOException;

/*
 * TRABALHANDO COM EXCEPTION TIPOS CHECKED
 * SÃO EXCEÇÕES QUE PRECISAM SER TRATADAS 
 * 
 * OPÇÃO1: VOCE PODE UTILIZAR O THROWS COM A EXCEÇÃO NA MESMA LINHA DO MÉTODO INDICANDO PRÉ TRATAMENTO 
 * DA EXCEÇÃO
 * OPÇÃO2: UTILIZANDO UM TRY / CATCH E REALIZANDO O TRATAMENTO DA EXCEÇÃO PARA O CRIADOR DO MÉTODO.
 * OPÇÃO3: É REALIZANDO A CHAMADO DO TRATAMENTO NO CATCH REITERANDO O OBJETO E COMO EXCEPTION
 * JÁ  TRATADO.
 * 
 * QUANDO SE UTILIZA A PALAVRA RESERVADA THROW QUANDO NÃO FOR UMA RUNTIMEEXCEPTION VOCE PRECISA 
 * DECLARA A ASSINATURA THOWS E A EXCEÇÃO QUE DESEJA DECLARAR PARA SER USADA NA OCASIÃO.
 * 
 * TRABALHANDO COM BLOCO FINALLY
 * 
 * É UM BLOCO DE CODIGO QUE SEMPRE SERÁ EXECUTANDO EDNTRO DE TRATAMENTO DE EXCEÇÕES.
 * MESMO SE EXISTIR UM RETORNO DENTRO DO MÉTODO ELE SEMPRE SERÁ EXECUTADO PRIMEIRO.
 * O BLOCO FINALLY PODE VIR DEPOIS DO TRY OU DEPOIS DO CATCH NO ENTANTO CASO VENHA DEPOIS 
 * DO BLOCO TRY O CATCH DEVE SER REMOVIDO.
 * 
 * OBS: NÃO SE PODE TRABALHAR COM O BLOCO TRY SOZINHO É NECESSARIO TER →  TRY / CATCH
 * OU TRY / FINALLY OU TRY / CATCH / FINALLY.
 */

public class CheckedExceptionTeste {

	public static void main(String[] args) {
		abrirArquivo();
		
		
		
		
		
	}
	
	public static void criarArquivo() throws IOException {
		File file = new File("ArquivoTeste.txt");
			System.out.println("Situação da Criação do Arquivo: " + file.createNewFile());
			System.out.println("Arquivo Criado!");
	}
	
	public static String abrirArquivo(){
		try {
			System.out.println("Abrindo um Arquivo....");
			System.out.println("Executando a Leitura do Arquivo");
			System.out.println("Escrevendo no Arquivo");
			//throw new Exception("Gerando uma exceção");
			return "Qualquer Valor";
		}catch(Exception e) {
			System.out.println("Dentro do catch");
			e.printStackTrace();
		}finally {
			System.out.println("Fechar o Arquivo.");
		}
		return null;
		
	}

}
