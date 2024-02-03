package modificadorstatico.classes;

	/*
	 * TRABALHANDO COM BLOCOS DE INICIALIZAÇÃO
	 * COM OPERADORES ESTATICOS 
	 * OBS: BLOCOS DE INICIALIZAÇÃO ESTATICOS SÃO EXECUTADOS
	 * ANTES DE BLOCOS NÃO ESTATICOS 
	 */


public class Cliente {
	
	private static String nome = "RICARDO";
	private static int[] parcelas;
	
	//BLOCOS DE INICIALIZAÇÃO EXECUTADOS NA ORDEM DE CIMA PARA BAIXO
	static{
		parcelas = new int[100];
		System.out.println("Dentro do bloco de inicialização");
		System.out.println("O nome do Cliente é: " + Cliente.nome);
		for(int i = 1; i < 100; i++) {
			parcelas[i - 1] = i;
		}
	}
	
	public Cliente() {
		
	}
	
	//METODOS GETTERS E SETTERS
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public static int[] getParcelas() {
		return parcelas;
	}
	
	
	
	

}
