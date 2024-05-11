package colecoes.teste;

import java.util.PriorityQueue;
import java.util.Queue;

import colecoes.classe.Consumidor;

public class QueueTest {
	public static void main(String[] args) {
		tituloGerador();
		System.out.println("Exemplo 01");
		Queue<String> queue = new PriorityQueue<String>();
		queue.add("Ricardo");
		queue.add("Fabiana");
		queue.add("Katerina");
		queue.add("Emilly");
		System.out.println("Lista de Nomes: " + queue);
		
		System.out.println("Métodos uteis (offer): " + queue.offer("Ricardo"));
		System.out.println("Métodos uteis (peek): " + queue.peek());
		System.out.println("Métodos uteis (offer): " + queue.offer("Bianca"));
		System.out.println("Queue Atualizado: " + queue);
		
		
		System.out.println("------------------------------------------------------");
		System.out.println("Exemplo 02");
		Queue<Consumidor> queue2 = new PriorityQueue<Consumidor>();
		Consumidor consumidor1 = new Consumidor("Ricardo Rosendo", "05113");
		Consumidor consumidor2 = new Consumidor("DevDojo", "321");
		queue2.add(consumidor1);
		queue2.add(consumidor2);
		System.out.println(queue2);
	}

	
	private static void tituloGerador() {
		System.out.println("------------------------------------------------------------------");
		System.out.println("     Trabalhando com Coleções Métodos Queue / PriorityQueue");
		System.out.println("------------------------------------------------------------------");
	}

}
