package runtimeexceptions.teste;

public class RunTimeExceptionTest02 {
    public static void main(String[] args) {
	tituloGerador();
	divisao(10, 0);

    }

    public static int divisao(int a, int b) {
	if(b != 0) {
	    int resultado;
	    resultado = a / b;
	    System.out.println("Resultado da operação: " + resultado);
	    return resultado;
	}else {
	    throw new ArithmeticException("Divisão por Zero não Permitida!");
	}
    }

    public static void tituloGerador() {
	System.out.println("------------------------------------------");
	System.out.println("          Exceptions Unchecked            ");
	System.out.println("------------------------------------------");
    }

}
