package stringatualizado.test;

public class StringPerfomanceTest01 {
    public static void main(String[] args) {
	tituloGerador();
	System.out.println(" <<<< Método String >>>>");
	long inicio = System.currentTimeMillis();
	concatString(100000);
	long fim = System.currentTimeMillis();
	System.out.println("Tempo pecorrido para  Método String : " + (fim - inicio) + " ms");
	System.out.println("------------------------------------");
	System.out.println(" <<<< Método String Builder >>>>");
	inicio = System.currentTimeMillis();
	concatStringBuilder(100000);
	fim = System.currentTimeMillis();
	System.out.println("Tempo Pecorrido para Método String Builder: " + (fim - inicio) + " ms");
	System.out.println("------------------------------------");
	System.out.println(" <<<< Método String Buffer >>>>");
	inicio = System.currentTimeMillis();
	concatStringBuffer(100000);
	fim = System.currentTimeMillis();
	System.out.println("Tempo gasto para Método String Buffer: " + (fim - inicio) + " ms");
	System.out.println("------------------------------------");

    }

    public static void tituloGerador() {
	System.out.println("-------------------------------------------------------");
	System.out.println("              Perfomaçe das String                     ");
	System.out.println("-------------------------------------------------------");
    }

    public static void concatString(int tam) {
	String texto = " ";
	for (int i = 0; i < tam; i++) {
	    texto += i;

	}
    }

    public static void concatStringBuilder(int tam) {
	StringBuilder sb = new StringBuilder(tam);
	for (int i = 0; i < tam; i++) {
	    sb.append(i);

	}
    }

    public static void concatStringBuffer(int tam) {
	StringBuffer sb = new StringBuffer(tam);
	for (int i = 0; i < tam; i++) {
	    sb.append(i);

	}
    }

}
