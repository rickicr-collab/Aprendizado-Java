package string.teste;


/*
 * PROPRIEDADES STRINGBUILDER:
 * 
 * A STRING BUILDER NÃO CRIA UM NOVA STRING E COLOCA NO POOL DE STRINGS 
 * PORQUE ASTRING BUILDER NÃO É NECESSARIAMENTE UMA STRING.
 * 
 * OBS: O PARAMENTRO INT NO CONSTRUTOR DE UM OBJETO DA CLASSE STRINGBUILDER
 * É REFERENTE A CAPACITADE DE CARACTERES EM STRING A SER CRIADO PELO OBJETO
 * PARA EVITAR A POS CRIAÇÃO POR FALTA DE ESPAÇO NECESSARIO.
 * 
 * VOCE PODE UTILIZAR O STRINGBUILDER EMBORA NÃO SEJA STRING UTILIZANDO O 
 * MÉTODO TOsTRING() CONVERTI O VALOR EM STRING E PODE SER EXIBIDO EM TELA.
 * 
 * MÉTODOS USADOS COM STRINGBUILDER
 * 
 * TOREVERSE() → ELE REVERTE A ORDEM DE LEITURA E ESCRITA DOS CARACTERES DO STRING.
 * DELETE() → FUNÇÃO ONDE É POSSIVEL DELETAR UMA LINHA DE CARACTERES DE STRING 
 * INFORMANDO O INDICE DE INICIO AO INDICE DE FIM PARA EXCLUSÃO.
 * INSERT() → A FUNÇÃO INSERT INSERE CARACTERES STRING NA POSIÇÃO INDICE INFORMADA
 * COMO PARAMENTRO: EXEMPLO INSERT(2, "##"); NA POSIÇÃO DE INDICE 2 ISERÁ INSERIDO 
 * DOIS CARACTERES ##.
 * REPEAT() → ESSA FUNÇÃO CRIA UMA DUPLICATA DOS CARACTERES INSERIDOS NO PARAMETRO
 * VERIFICANDO A QUANTIDADE A SER REPETIDA PELO SEGUNDO ARGUMENTO A SER INSERIO 
 * EXEMPLO: REPEAT("OK", 2) → OK OK A QUANTIDADE DA REPETIÇÃO É DETERMINADA PELO 
 * SEGUNDO ARGUEMENTO EM INTEIRO.
 */

public class StringBuilderTest {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder(16);
		sb.append("012345789 ").toString();
		System.out.println("<<< Métodos usados no StringBuilder >>>");
		System.out.println("Imprimindo o valor: " + sb);
		System.out.println("Usando a função Reverse: " + sb.reverse());
		System.out.println("Usando a função Insert: " + sb.insert(2, "222"));
		System.out.println("Usando a Função delete: " + sb.delete(0, 5));
		System.out.println("Usando o Método Repeat: " + sb.repeat(" OK ", 1));
		System.out.println("usando o segundo metodo repeat: " + sb.repeat(2, 2));
		System.out.println("----------------------------");
		StringBuilder sb2 = new StringBuilder(16);
		sb2.append("def").insert(3, "ghi").reverse().delete(2, 4);
		System.out.println(sb2);
		System.out.println("----------------------------------------");
		System.out.println("Utilizando StringBuffer");
		StringBuffer sf = new StringBuffer();
		sf.append("444555666777");
		System.out.println(sf);
		
		

	}

}
