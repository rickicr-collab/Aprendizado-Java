package classes;

/*
 * INTRODUÇÃO DO USO DE MÉTODOS DENTRO DAS CLASSES
 * 
 */
public class Calculadora {
	/*
	 * CRIANDO UM METODO COM VARIAVEIS LOCAIS 
	 * QUE SERÃO EXECUTADS SOMENTE QUANDO O 
	 * METODO FOR CHAMADO
	 */
	
	//MÉTODO SOMADOR
	public void Somador() {
		System.out.println("A soma é: " + (5+5));
		
	}
	
	//MÉTODO SUBTRAIR
	public void Subtrair() {
		System.out.println("A subtração é: " + (5-5));
	}
	
	//METODO MULTIPLICA COM PARÃMENTROS
	public void Multiplica(int num1, int num2) {
		int resultado = num1 * num2;
		System.out.println("A multiplicação será: " + resultado);
		
	}
	
	//METODO DIVIDIR COM PARAMENTROS E RETORNO
	public double Dividir(double num1, double num2) {
		double resultado =  num1 / num2;
		// CRIANDO UMA CONDIÇÃO ONDE NUM2 É DIFERENTE DE 0
		if(num2 != 0) {
			return resultado;
		}
		return 0;
	}
	
	//MÉTODO PARA RETORNAR A OPERAÇÃO NORMAL 
	//MÉTODO PARA RETORNAR CASO A OPERADOR POSSUA 0 NO NUM2
	public void ImprimiDoisNumerosDivididos(double num1, double num2) {
		if(num2 != 0) {
			System.out.println(num1 / num2);
			return;
		}
		System.out.println("Não é possivel dividir por Zero!");
	}
	
	//MÉTODO CRIADO PARA ALTERAR VALORES 
	public void AlterandoDoisNumeros(int a, int b) {
		a = 30;
		b = 50;
		System.out.println("Dentro do método altera dos numeros!");
		System.out.println("O Numero 1 : " + a);
		System.out.println("O Numero 2 : " + b);
	}
	
	//MÉTODO DE SOMA DE ELEMENTOS DE ARRAY
	public void somaArray(int[] numeros) {
		int soma = 0;
		for(int num: numeros) {
			soma += num;
		}
		System.out.println("A soma do Array é: " + soma);
	}
	
	/*
	 * MÉTODO DE SOMA DE ELEMENTOS COM VARIAVEIS ARGUMENTOS
	 * REGRAS VARARGS:
	 * 1.SO É POSSIVEL UM METODO VARARGS POR ASSINATURA.
	 * 2.NÃO É SOSSIVEL COLOCAR OUTRAS CLASSES PRIMITIVAS NO MESMO VARARGS SEGUIDOS.
	 * 3.SE VOCE COLOCAR MAIS PARAMENTROS O VARARGS SEMPRE TEM QUE SER O ULTIMO PARAMENTRO.(MESMO TIPOS DIFERENTES)
	 * 
	 */
	public void somaVarArgs(int... numeros) {
		int soma = 0;
		for(int num: numeros) {
			soma += num;
		}
		System.out.println("A soma do Array é: " + soma);
	}
}
