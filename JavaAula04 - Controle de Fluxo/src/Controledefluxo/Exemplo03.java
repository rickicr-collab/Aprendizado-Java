package Controledefluxo;

public class Exemplo03 {
	// EXEMPLO DE TRABALHO COM ESTRUTURA SWITCH

	public static void main(String[] args) {
		
		// EXEMPLO USANDO VARIAVEL TO TIPO CHAR
		char sexo = 'F';
		String informacao = "";
		switch(sexo) {
		case 'F':
			informacao = "O sexo informado é : Feminino";
			break;
		// O ULTIMO CASE NÃO É OBRIGATÓRIO UTILIZAR A FUNÇÃO BREAK
		case 'M':
			informacao = "O sexo Informado é: Masculino";
			break;
		// QUANDO É INFORMADO NA VARIAVEL PARAMENTRO UM VALOR INCORRETO 
		default:
			informacao = "A opção é invalida!";
		}
		System.out.println(" ------ Imprimindo dados em tela ------ ");
		System.out.println(informacao);
		

	}

}
