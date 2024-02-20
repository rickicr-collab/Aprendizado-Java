package modificadorfinal.classes;

/*
 * MODIFICADOR FINAL :FUNÇÃO COM MUITAS UTILIDADES 
 * COMO EXEMPLO EM MÉTODOS , CLASSES E ATRIBUTOS DE CLASSE.
 * OBS: AO DECLARAR UMA VARIAVEL COM MODIFICADOR FINAL ELA SE 
 * TORNA UMA VARIAVEL CONSTANTE E PRECISA SER INICIALIZADA 
 * SE NÃO GERA UM ERRO DE COMPILAÇÃO NO INTERPRETADOR .
 * OBS1: DEVIDO A CONSTANTE PRECISAR SER DECLARADA VC PODE INICIALIZAR A CONSTANTE
 * DENTRO DO PROPRIO CONSTRUTOS OU UTILIZAR UM BLOC DE INICIALIZAÇÃO
 * STATICO DEVIDO AO ATRIBUTO SER STATICO NO ENTANTO É OPÇIONAL.
 * OBS2: NÃO SE PODE CHAMAR A VARIAVEL CONSTANTE NO MÉTODO MAIN PELO
 * OBJETO DEVE SER CHAMADO ATRAVES DA CLASSE PRINCIPAL , CASO CONTRARIO
 * É GERADO UM ERRO DE COMPILACAO.
 * 
 * AO DECLARA UMA VARIAVEL OU ATRIBUTO DE OUTRA CLASSE COM MODIFICADOR FINAL 
 * ALGUMAS COISAS DEVEM SER OBSERVADAS:
 * OBS1: COMO A VARIAVEL É REFERENCE A OUTRA CLASSE TIPOS REFERENCE
 * É NECESSARIO CRIAR UM NOVO OBJETO DO MESMO TIPO.
 * OBS2: NÃO É POSSIVEL INSTANCIAR UM NOVO OBJETO DE REFERENCIA 
 * PARA QUE ELE POSSA REFENCIAR O NOME OBEJTO DE UM VARIAVEL JÁ INSTANCIADA.
 * EXEMPLO → DO OBJETO COMPRADOR JÁ INSTANCIADO NA CLASSE CRIAR UM NOVO OBJETO
 * DENTRO DO MÉTODO MAINS E REFENCIAR ESSE MESMO NOVO OBJETO 
 * OBS3: É POSSIVEL ALTERAR OS ATRIBUTOS DESSE OBJETO PRÉ ATRIBUIDOS NA CLASSE.
 * 
 * MODIFICADOR FINAL TRABALHANDO COM CLASSES:
 * OBS: UMA CLASSE COM MODIFICADOR FINAL ATRIBUIDO NELA NÃO PODE SER EXTENDIDA 
 * EM OUTRAS PALAVRAS NÃO PODE SER ATRIBUIDA A SUA HERANÇA.
 * DEVIDO A CLASSE ESTÁ APARENTEMENTE COMPLETA E PERFEITA 
 * 
 * MODIFICADOR FINAL TRABALHANDO COM MÉTODOS:
 * OBS1: ASSIM COMO NO USO DA CLASSE NÃO É POSSIVEL SOBREESCREVER UM MÉTODO COM
 * MODIFICADOR FINAL POIS PARA O JAVA ELE ESTÁ PERFEITO.
 * O QUE É POSSIVEL SE FAZER É SOBRECARGA DE MÉTODOS.
 */

public class Carro {
	
	
	public static final double VELOCIDADE_FINAL = 250;
	public final Comprador COMPRADOR = new Comprador();
	private String nome;
	private String marca;
	
	

	//Método to String
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Carro [nome=");
		builder.append(nome);
		builder.append(", marca=");
		builder.append(marca);
		builder.append("]");
		return builder.toString();
	
	}
	
	//METODOS 
	public final void imprime() {
		System.out.println(" ------ Imprimindo um Carro ----- ");
		System.out.println("nome: " + this.nome);
		System.out.println("Marca: " + this.marca);
		System.out.println("Velocidade Final: " + this.VELOCIDADE_FINAL);
		
	}
	
	
	// Métodos Getters and Setters
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getMarca() {
		return marca;
	}
	
	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	public Comprador getComprador() {
		return COMPRADOR; 
	}
	
	

	
	
	
	

}
