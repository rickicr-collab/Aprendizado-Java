package string.teste;


/*
 * TRABALHANDO COM A CLASSE STRING:
 * 
 * OBS: STRING NO JAVA SÃO IMUTAVEIS NÃO MUDAM NUNCA.
 * OBS2: COMO STRING É UMA CLASSE TAMBEM SE PODE INTANCIAR EM UM NOVO OBJETO E CRIAR
 * STRING USANDO ESSE MÉTODO.
 * 
 * OBS3: É POSSIVEL REALIZAR VARIAS CONCATENAÇÕES CLARO SEGUINDO AS REGRAS ESTABELECIDAS
 * NO JAVA PRINCIPALMENTE USANDO O MÉTODO CONCAT().
 * 
 * O JAVA POSSUI UM ESPACO DEEMORIA ESPECIAL PARA STRING CHAMADO : STRING CONSTANT POOL( E SE HOUVER UMA VALOR DE STRING
 * IGUAL A UMA NOVA VARIAVEL CRIADA O MESMO VALOR SERÁ REFERENCIADO NESSA NOVA VARIAVEL PARA ECONOMIDA DE MEMORIA).
 * 
 * METODOS DA CLASSE STRING:
 * 
 * EQUALS() → MÉTODO USADO PARA VERIFICAR S E UMA STRING É IGUAL A OUTRA.
 * EQUALSIGNORECASE() → REALIZA O MÉSMO TESTE NO ENTANTO ELE IGNORA AS DIFERENCAS DE LETRA MAISUCULAS OU MINUSCULAS
 * REALIZANDO A CONVERSAO DE UMA OU OUTRA EM SEGREDO.
 * LENGTH() → MOSTRA O TAMANHO DA STRING EM QUANTIDADE DE CARACTERES CONTIDOS.
 * REPLACE() → MÉTODO QUE SUBSTITUI CARACTERES DE UMA STRING COLOCANDO NOS PARAMETROS
 * O ALVO A SER SUBSTITUIDO , E O SUBSTITUTO.
 * SUBSTRING() → PERMITE QUEBRAR A PALAVRA E RECUPERAR A PARTE QUEBRADA E IMPRIMIR SE DESEJAR,
 * TAMBEM É POSSIVEL COLOCAR O INICIO E O FIM DA PALAVRA A SER QUEBRADA COLOCANDO OS INDICES
 * NO PARAMENTRO DO MÉTODO.
 * TRIM() → USADO PARA REMOVER ESPACOS DESNECESSARIOS TANTO ANTES COMO DEPOIS DA STRING.
 * 
 * 
 * 
 */

public class StringTeste {

	public static void main(String[] args) {
		System.out.println("<<< Primeiros exemplos >>>");
		String nome = "Ricardo";
		nome += " Cunha"; 
		nome = nome.concat(" Rosendo");
		System.out.println(nome);
		System.out.println("--------------------------------");
		
		System.out.println("<<< Testando metodos da classe String>>>");
		
		String teste = "Goku";
		String teste2 = "goku";
		System.out.println("Valor no Indiçe: " + teste.charAt(1));
		System.out.println("Verificação se a String é igual a outra: " + teste.equals(teste2));
		System.out.println("Verificar se a String é igual a outra Ignorado Diferencas de Case: " + teste.equalsIgnoreCase(teste2));
		System.out.println("Verificando o tamanho da String: " + teste.length());
		System.out.println("Metodo para substituir caracteres: " + teste.replace("o", "a"));
		System.out.println("Passando a string para Maiusculo: " + teste.toUpperCase());
		System.out.println("Passando a string para minusculo: " + teste.toLowerCase());
		System.out.println("Quebra uma string e imprime a parte quebrada recuperada: " + teste.substring(1));
		System.out.println("Quebra a string determinando um ponto inicial e final: " + teste.substring(1, 4));
		System.out.println("Removendo os espacos desnecessarios: " + teste.trim());
		
	}

}
