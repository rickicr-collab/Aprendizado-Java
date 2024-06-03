package classesmetodos;

public class EstudanteNovo {
	public String nome;
	public int idade;
	public String sexo;
	
	
	public void imprime() {
		System.out.println("<<<<< Dados Impressos em Tela >>>>>");
		System.out.println("Nome: " + this.nome);
		System.out.println("Idade: " + this.idade);
		System.out.println("Sexo: " + this.sexo);
	}

}
