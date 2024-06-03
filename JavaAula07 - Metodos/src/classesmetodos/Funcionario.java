package classesmetodos;

public class Funcionario {
	public String nome;
	public int idade;
	public double[] salario;

	public void imprime() {
		System.out.println("Nome do Funcionário: " + this.nome);
		System.out.println("Idade do Funcionário: " + this.idade);
		if (salario == null) {
			System.out.println("Salario não Informado!");
			return;
		}
		for(int aux = 0; aux < salario.length; aux++) {
			System.out.println("Salario " + (aux + 1) + " Valor : [" + salario[aux] + " R$]");
		}
		mediaSalario();

	}

	public void mediaSalario() {
		if (salario == null) {
			System.out.println("Não existe salario do Funcionário!");
			return;
		}
		double media = 0;
		for (double aux : salario) {
			media += aux;
		}
		media /= salario.length;
		System.out.println("A média do sálario é: [" + media + " RS]");
	}

}
