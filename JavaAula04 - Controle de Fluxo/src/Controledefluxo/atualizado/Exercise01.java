package Controledefluxo.atualizado;

public class Exercise01 {

	public static void main(String[] args) {
		tituloGerador();
		double salario = 70000;
		double resultado;
		if(salario <= 34712) {
			resultado = salario -(salario * 9.70 / 100);
			System.out.println("O salario ja reajustado com imposto de 9.70%: [" + resultado + "]");
		}else if(salario >= 34713 && salario <= 68507) {
			resultado = salario -  (salario * 37.35 / 100);
			System.out.println("O salario já aajustado com imposto de 37.35%: [" + resultado + "]");
		}else {
			resultado = salario - (salario * 49.50 / 100);
			System.out.println("O salario já ajustado com imposto de 49.50%: [" + resultado + "]");
		}
	}
	
	public static void tituloGerador() {
		System.out.println("--------------------------------------------------");
		System.out.println("  Exercicio Estruturas Condicionais - 01");
		System.out.println("--------------------------------------------------");
	}
	
	

}
