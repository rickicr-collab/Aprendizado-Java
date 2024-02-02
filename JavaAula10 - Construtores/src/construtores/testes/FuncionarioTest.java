package construtores.testes;

import construtores.classes.Funcionario;
	/*
	 * OBS1:VOCE PODE INICIALIZAR O CONSTRUTOR DECLARANDO QUE ELE DEVE CRIAR
	 * POR EXEMPLO O PARAMENTRO NOME COMO ARGUMENTO INICIAL
	 * ISSO IMPEDI A CRIAÇÃO DESNECESSARIA DE VALORES PARA UM ATRIBUTO 
	 * SEM A DEVIDA AUTORIZAÇÃO 
	 * 
	 * OBS2: QUANTOS MAIS PARAMENTROS VOCE PASSAR PARA O CONSTRUTOR 
	 * VOCE SERÁ SEMPRE OBRIGADO A DECLARAR ESSES ARGUMENTOS NA CRIAÇÃO
	 * DO OBJETO
	 */
public class FuncionarioTest {

	public static void main(String[] args) {
		Funcionario a = new Funcionario("Ricardo", "051132.574-60", 4500, "9632876");
		Funcionario b = new Funcionario();
		
		//EXECUTANDO O METODO INIT PELA SOBRECARGA 
		System.out.println("Impimindo dados em Tela: ");
		a.imprimir();
		b.imprimir();
		
		
	

	}

}
