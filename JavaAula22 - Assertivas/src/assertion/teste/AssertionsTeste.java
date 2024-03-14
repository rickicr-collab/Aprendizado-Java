package assertion.teste;

/*
 * TRABALHANDO COM A FUNÇÃO DA PALAVRA ASSERT:
 * 
 * FOI INTRODUZIDO A PARTIR DO JAVA VERSÃO 1.4 PARA FACILITAR O TRABALHO DO 
 * COMPILADOR DEVIDO A GRANDE QUANIDADES DE CONDIÇIONAIS IF E ELSE NOS MÉTODOS 
 * CRIADOS EM CLASSES.
 * 
 * SE VOCE UTILIZA A VERSÃO 1.3 DO JAVA A PALAVRA ASSERT NÃO É UMA PALAVRA CHAVE.
 * 
 * AO USAR A PALAVRA ASSERT DENTRO DO MÉTODO VOCE ESTÁ GARANTINDO QUE AQUELA FUNÇÃO SEMPRE
 * IRÁ EXECUTAR AQUELA CONDIÇÃO PARA QUE NÃO HAJA ERRO EM EXECUÇÃO DEVIDO A ISSO
 * NÃO HÁ NECESSIDDE DE ADICIONAR NO BLOCO DO MÉTODO IF / ELSES.
 * 
 * NÃO É UMA BOA PRATICA USAR A PALAVRA ASSERT EM MÉTODOS PUBLICOS DEVIDO SEU MÉTODO
 * FICAR EXPOSTO PARA QUE QUALQUER PESSOA POSSA ACESSAR E CHAMAR SEU MÉTODO DEVIDO 
 * A ISSO É UMA BOA PRATICA USAR MÉTODOS PRIVADOS USANDO A PALAVRA ASSERT.
 * 
 * SE VOCE DESEJA UTILIZAR UM MÉTODO PUBLICO ENTÃO VOCÊ PODE TRABALHAR COM EXCEÇÕES .
 * 
 * OBS1: VOCE PODE DEIXAR UMA MENSAGEM NA MESMA LINHA DA PALAVRA ASSERT PARA INFORMAR
 * ALGO PARA OUTROS USUARIOS SOBRE AQUELA ASSERTIVA.
 * 
 * OBS2: NÃO SE PODE USAR MÉTODOS QUE NÃO POSSUEM RETORNO DENTRO DO ASSERTS.
 * OBS3: DENTRO DOS PARAMENTROS DO ASSERT SEMPRE DEVEM SER VALORES BOOLEANOS.
 * 
 * POR PADRAO AS ARRERTS VEM DESABILIDADES PARA ATIVA-LAS VOCE DEVE IR NAS CONFIGURAÇOES 
 * DE EXECUÇÃO OU RUN CONFIGURES / ARGUMENTS / VM ARGUMENTS E DIGITAR : -ea.
 * 
 * PARA DESABILITAR AS ASSERT VOCE DEVE FAZER O MESMO CAMINHO E DIGITAR :-da OU APAGAR 
 * OS VALORES QUE JÁ HAVIAM SIDO INSERIDOS AO ATIVAR.
 * 
 * PODE HAVER UM CASO ONDE SE POSSA USAR A PALAVRA ASSERT EM MÉTODOS PUBLICOS
 * EXEMPLO MÉTODOS DIADASEMANA()
 */

public class AssertionsTeste {

	public static void main(String[] args) {
		calculaSalario(1000);
		diasDaSemana(8);
		
			

	}
	
	private static void calculaSalario(double salario) {
		assert(salario > 0): "O valor não pode ser menor do que zero →  O salario: " + salario;
		
	}
	
	public static void diasDaSemana(int dia) {
		switch (dia) {
		case 1:
			System.out.println("Domingo");
			break;
		case 2:
			System.out.println("Segunda - feira");
			break;
		case 3:
			System.out.println("Terca - Feira");
			break;
		case 4:
			System.out.println("Quarta - Feira");
			break;
		case 5:
			System.out.println("Quinta - Feira");
			break;
		case 6:
			System.out.println("Sexta - Feira");
			break;
		case 7:
			System.out.println("Sabado");
			break;
		default:
			assert false: "Argumento Invalido!";
					
		}
		System.out.println("<<< Fim do Programa >>>");
			
	}
}
