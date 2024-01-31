package classes;

public class Estudante {
	//ATRIBUIDO OS ATRIBUTOS 
	public String nome;
	public int idade;
	public double[] notas;
	
	//CRIANDO OS METODOS 
	public void imprimiDados() {
		System.out.println("----- Dados do Estudante -----");
		System.out.println("Nome do Aluno: " + this.nome);
		System.out.println("Idade do Aluno: " + this.idade + " Anos de idade.");
		if(notas != null) {
			for(double nota: notas) {
				System.out.println("Notas: " + nota);
			}
		}
	}
	
	public void mediaAluno() {
		if(notas == null) {
			System.out.println("O aluno não possue notas!!");
			return;
		}
		double media = 0;
		for(double nota: notas) {
			media += nota;
		}
		media = media / notas.length;
		System.out.println("A média do aluno é: " + media);
		if (media > 6) {
			System.out.println("Aluno Aprovado!!");
		}else if (media <= 6) {
			System.out.println("Reprovado!!");
		}
	}
		
}
