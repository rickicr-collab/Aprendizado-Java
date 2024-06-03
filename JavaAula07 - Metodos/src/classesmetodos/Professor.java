package classesmetodos;

public class Professor {
	/*
	 * CLASSE PROFESSOR COM SEGUINTES ATRIBUTOS:
	 * NOME
	 * MATRICULAaux
	 * RG 
	 * CPF
	 */
	
	public String nome;
	public String matricula;
	public String rg;
	public String cpf;
	public String disciplina;
	
	
	/*
	 * MÉTODO PARA IMPRIMIR OS VALORES DOS ATRIBUTOS 
	 * OBS: PALABRA RESERVADA THIS → VOCE CONSEGUE 
	 * PEGAR DIRETAMENTE OS ATRIBUTOS DA CLASSE QUE FORAM
	 * INICIALIZADOS NA CLASSE PRINCIPAL MAIN
	 */
	public void Imprimir() {
		System.out.println("------------------------");
		System.out.println("Professor: ");
		System.out.println("Nome: " + this.nome);
		System.out.println("CPF: " + this.cpf);
		System.out.println("RG: " + this.rg);
		System.out.println("Matricula: " + this.matricula);
	}
	

}
