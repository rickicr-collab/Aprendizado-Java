package exceptions.error;

public class StackOverFlowTeste {
    public static void main(String[] args) {
	recursividade();
    }
    
    public static void recursividade() {
	recursividade();
    }

}
