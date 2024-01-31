package testes;

import classes.Estudante;
	/*
	 * TRABALHANDO COM MODIFICADORES DE ACESSO TIPO PRIVATO NO METODO MAIN
	 * OBS:
	 * É PRECISO INSTANCIAS OS VALORES DOS ATRIBUTOS ANTES DE CHAMAR OS MÉTODOS
	 * PRINCIPAIS POIS PARA O JAVA É COMO SE NÃO HOUVESSE VALORES DENTRO 
	 * DO OBJETO PARA SE TRABALHAR.
	 * 
	 * DESSE MODO PODEMOS ENCAPSULAR OS ATRIBUTOS E TER MAIS SEGURANÇA NO NOSSO CODIGO
	 * 
	 */

public class EstudanteTeste {

	public static void main(String[] args) {
		//PRIMEIRO ESTUDANTE
		//INSTANCIANDO VALORES DO OBJETO A USANDO METODOS SET
		Estudante a = new Estudante();
		a.setNome("Ricardo");
		a.setIdade(33);
		a.setNotas(new double[]{5, 5, 7.2});
		
		//SEGUNDO ESTUDANTE
		//INSTANCIANDO OS VALORE DO OBJETO B USANDO MÉTODOS SET
		Estudante b = new Estudante();
		b.setNome("Priscila");
		b.setIdade(28);
		b.setNotas(new double[] {8, 9, 7.2});
		
		//CHAMDNO OS MÉTODOS
		a.imprimiDados();
		a.mediaAluno();
		b.imprimiDados();
		b.mediaAluno();
		
		// CHAMANDO METODOS GET
		System.out.println("------ metodos get ------ ");
		System.out.println("O nome é: " + a.getNome());
		System.out.println("o nome é: " + b.getNome());
		System.out.println("A situacao é: " + a.isSituacao());
		System.out.println("A situação é: " + b.isSituacao());
		
		
	

	}

}
