package classes;

public class Funcionario {
	private String nome;
	private int idade;
	private double[] salario;
	private double media;

	public void imprime() {
		System.out.println("Nome: [" + this.nome + "]");
		System.out.println("Idade: [" + this.idade + " Anos]");
		if (salario == null) {
			System.out.println("Salario Inexistente");
			return;
		} else {
			for (int aux = 0; aux < salario.length; aux++) {
				System.out.println((aux+1) + "º Salario" + " - Valor: [" + salario[aux] + " R$]");
			}
		}
		mediaSalario();
	}

	public void mediaSalario() {
		if (this.salario == null) {
			System.out.println("Salario Inexistente!");
			return;
		}
		for (double aux : this.salario) {
			this.media += aux;
		}
		this.media /= this.salario.length;
		System.out.println("A media salario é: [" + this.media + " R$]");
	}

	public String getNome() {
		return nome;
	}

	public int getIdade() {
		return idade;
	}

	public double[] getSalario() {
		return salario;
	}

	public double getMedia() {
		return media;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public void setSalario(double[] salario) {
		this.salario = salario;
	}

	
	
	

}
