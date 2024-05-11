package colecoes.teste;

import java.util.ArrayList;
import java.util.List;

public class ListTest {

	public static void main(String[] args) {
		System.out.println("<<<< Trabalhando com Coleções >>>>");
		System.out.println("          Coleção List - 01 ");
		System.out.println("----------------------------------");
		List <String> nomes = new ArrayList<>();
		nomes.add("Ricardo");
		nomes.add("Priscila");
		nomes.add("Katerine");
		for(String nome: nomes) {
			System.out.println("Nomes: " + nome);
		}
		
		
		System.out.println("----------------------------------");
		System.out.println("Adicionando itens dinamicamente no Array");
		int size = nomes.size();
		for(int i = 0; i < size; i++) {
			System.out.println("Nome: " + nomes.get(i));
			nomes.add("Flavia");
		}
		//System.out.println("Nome adicionado: " + nomes.get(3));
		
		System.out.println("----------------------------------");
		System.out.println("           Coleção List - 02 ");
		List <Integer> numeros = new ArrayList<>();
		numeros.add(10);
		numeros.add(101);
		numeros.add(200);
		for(Integer num: numeros) {
			System.out.println("numero: " + num);
		}
		
		System.out.println("----------------------------------");
		System.out.println("Adicionando itens de uma lista em outra");
		List <String> nomes1 = new ArrayList<>();
		nomes1.add("Marcela");
		nomes1.add("Patricia");
		nomes.clear();
		nomes.addAll(nomes1);
		System.out.println("lista Atualizada");
		for(String n: nomes)
			System.out.println("Nomes: " + n);
		
		System.out.println("----------------------------------");
		System.out.println("Métodos ArrayList");
		System.out.print("Size: ");
		System.out.println("Tamanho do Array → " + nomes.size());
		System.out.print("Size: ");
		System.out.println("Tamanho do Array numeros → " + numeros.size());
		
		
		
	
		
	
		
		
		
	
		
		

	}

}
