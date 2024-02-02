package blocodeinicializacao.classes;

	/*
	 * TRABALHANDO COM BLOCOS DE INICIALIZAÇÃO
	 * PROPRIEDADES DO BLOCO DE INICIALIZAÇÃO:
	 * 1 - PARA CRIAR UM BLOCO ABRE E FECHA CHAVES
	 * 2 - DEVE SE CRIAR UM BLOCO DE INICIALIZAÇÃO ANTES DO CONSTRUTOR 
	 * PROCEDIMENTOS DO BLOCO DE INICIALIZAÇÃO:
	 * 1 - É ALOCADO ESPACO NA MÉMORIA PARA O OBJETO QUE SERA CRIADO.
	 * 2 - CADA ATRIBUTO É CRIADO E INICIALIZADO COM SEUS VALORES DEFAULT OU VALORES EXPLICITOS
	 * 3 - BLOCO DE INICIALIZAÇÃO É EXECULTADO
	 * 4 - O CONSTRUTOR É EXECUTADO 
	 */


public class Cliente {
	
	private String nome;
	private int[] parcelas;
	
	{
		parcelas = new int[100];
		System.out.println("Dentro do bloco de inicialização");
		for(int i = 1; i < 100; i++) {
			parcelas[i - 1] = i;
			System.out.println("Parcelas: " + i);
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
	public int[] getParcelas() {
		return parcelas;
	}
	public void setParcelas(int[] parcelas) {
		this.parcelas = parcelas;
	}
	
	
	

}
