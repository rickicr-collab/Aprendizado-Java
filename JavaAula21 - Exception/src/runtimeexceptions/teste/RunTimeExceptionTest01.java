package runtimeexceptions.teste;

public class RunTimeExceptionTest01 {
    public static void main(String[] args) {
	tituloGerador();
	Object objeto = null;
	System.out.println(objeto.toString());
	System.out.println("----------------------------");
	int[] nums = { 1, 2 };
	System.out.println(nums[2]);
    }
    
    public static void tituloGerador() {
	System.out.println("-------------------------------------");
	System.out.println("       Exceptions RunTime            ");
	System.out.println("-------------------------------------");
    }

}
