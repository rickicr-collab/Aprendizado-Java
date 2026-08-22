package colecoes.teste;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueUpdated01 {
	public static void main(String[] args) {
		titulo();
		Queue<String> fila = new PriorityQueue<>();
		fila.add("Ricardo");
		fila.add("Priscila");
		fila.add("Amanda");
		fila.add("Douglas");
		fila.add("Bruno");
		
		System.out.println("<<< imprimindo valores >>>");
		for (String nome : fila) {
			System.out.println("[" + nome + "]");	
		}
		
		System.out.println(" Metodos - collections Queue");
		System.out.println("Metodo peek: " + fila.peek());
		while(!fila.isEmpty()) {
			System.out.println("Metodo poll: " + fila.poll());
			
		}
		
	}
	
	public static void titulo() {
		System.out.println("----------------------------------------------------");
		System.out.println("       <<< Collections -  Queue/PriorityQueue >>>   ");
		System.out.println("----------------------------------------------------");
	}
}
