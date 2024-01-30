package Controledefluxo;

public class Exercicio01 {

	public static void main(String[] args) {
		/*
		 * CRIE UMA VARIAVEL SALÁRIO E IMPRIMA SEU IMPOSTO
		 * IMPOSTO:
		 * SALARIO < 1000 : 5%
		 * SALÁRIO >= 1000 && SALARIO < 2000 : 10%
		 * SALARIO >= 2000 && SALARIO < 4000 : 15%
		 * SALARIO > 5000 20%
		 */
		
		System.out.println(" ----- Exercicio Proposto ----- ");
		int salario = 5000;
		int grau;
		String situacao = "";
		
		// CONDIÇÃO IF
		if(salario <= 1000) {
			grau = salario + (salario * 5/100);
			situacao = "O Salário do Usuário ficou : " + grau;
		// CONDIÇÃO ELSE IF
		}else if(salario >= 1000 && salario < 2000) {
			grau = salario + (salario * 10 / 100);
			situacao = "O Salário do Usuário ficou : " + grau;
		// SEGUNDA CONDIÇÃO ELSE IF
		}else if(salario >= 2000 && salario < 4000) {
			grau = salario + (salario * 15 / 100);
			situacao = "O salario do Usuário ficou : " + grau;
		// CONDIÇÃO ELSE
		}else {
			grau = salario + (salario * 20 /100);
			situacao = "O salário do Usuario ficou : " + grau;
		}
		
		System.out.println("Imprimindo dados em tela");
		System.out.println(situacao);
	

	}

}
