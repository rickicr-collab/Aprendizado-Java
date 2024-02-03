package modificadorstatico.classes;

/*
 * TRABALHANDO COM MODIFICADOR ESTATICO 
 * OBS1: OPERADOR STATIC SERÁ ALGO DA CLASSE E NÃO ESPECIFICO PARA
 * O ATRIBUTO QUE ELE É ASSOCIADO.
 * OBS2: DEVE SE TER CUIDADO AO ATERAR OS VALORES DE ATRIBUTOS
 * COM OPERADORES STATICOS JÁ QUE VOCE ESTÁ ALTERANDO VALORES 
 * QUE PERTENCEM A TODA CLASSE JÁ  QUE O OPERADOR STATICA 
 * ABORDA TODA A CLASSI.
 * OBS3: O ATRIBUTO ESTATICO É UM ATRIBUTO QUE COMPARTILHA SEUS 
 * VALORES COM TODA A CLASSE INCLUSIVE COM OBJETOS CRIADOS.
 * OBS3: NÃO É POSSIVEL ACESSAR ATRIBUTOS NÃO ESTATICOS COM MÉTODOS ESTATICOS
 * DEVIDO AOS ATRIBUTOS NÃO ESTATICOS ESTÁ RELACIONADO A OBJETOS , SE NÃO
 * HOUVER OBJETOS CRIADOS ESSES ATRIBUTOS SÃO INEXISTENTE DEVIDO A ISSO
 * SERÁ DADO UM ERRO DE COMPILACÃO.
 * OBS4: SE VOCE NÃO ESTA ACESSANDO ATRIBUTOS NA CLASSE E EXISTE APENAS MÉTODOS
 * QUE POSSUEM PARAMENTROS DENTRO VOCE PODE ATRIBUIR O OPERADOR STATIC A CADA MÉTODO
 * E CHAMALOS UTILIZANDO A CLASSE SEM NECESSIDADE DE CRIAÇÃO DE OBJETOS.
 * OBS5: BLOCOS ESTATICOS SÃO EXECUTANDO ANTES DE BLOCOS NÃO ESTATICOS 
 * DEVIDO A SUA HIERARQUIA 
 * OBS6: O BLOCO DE INICIALIZAÇÃO É EXECUTADO QUANDO A JVM CARREGA A CLASSE 
 * E É EXECUTADO APENAS UMA VEZ.
 * 
 */

public class Carro {
	//VELOCIDADE LIMITE PARA CARRO VERMELHO 240 KMH
	private String nome;
	private double velocidadeMaxima;
	private static double velocidadeLimite = 240; //ATRIBUIDO O OPERADOR STATIC A ATRIBUTO VELOCIDADELIMITE
	
	
	
	//CRIANDO CONSTRUTOR
	public Carro(String nome, double velocidadeMaxima) {
		this.nome = nome;
		this.velocidadeMaxima = velocidadeMaxima;
		
	}
	
	public Carro() {
		
	}
	
	//METODO IMPRIMI
	public void imprimir() {
		System.out.println(" ----------------------- ");
		System.out.println("O nome: " + this.nome);
		System.out.println("Velocidade Máxima: " + this.velocidadeMaxima);
		System.out.println("Velocidade Limite: " + velocidadeLimite);
	}

	
	//METODOS GETTERS AND SETTERS
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getVelocidadeMaxima() {
		return velocidadeMaxima;
	}
	public void setVelocidadeMaxima(double velocidadeMaxima) {
		this.velocidadeMaxima = velocidadeMaxima;
	}
	
	public static void setVelocidadeLimite(double velocidadeLimite) {
		//UTILIZANDO A CLASSE CARRO PARA ATRIBUIR UM VALOR REDEBIDO DE UM PARAMETRO DO MÉTODO
		Carro.velocidadeLimite = velocidadeLimite;
	}
	
	public static double getVelocidadeLimite() {
		return velocidadeLimite;
	}
	
	
}
