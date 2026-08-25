package innerclassupdated.teste;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import innerclassupdated.classes.Barco;



public class AnonymousClassTest02 {
	public static void main(String[] args) {
		titulo();
		List<Barco> listaBarcos = new ArrayList(List.of(new Barco("Canoa"), new Barco("Navio"), new Barco("Lancha")));
		listaBarcos.sort(new Comparator<Barco>(){
			@Override
			public int compare(Barco o1, Barco o2) {
				return o1.getName().compareTo(o2.getName());
			}
		});
		for (Barco barco : listaBarcos) {
			System.out.println(barco);
		}
	}
	
	public static void titulo() {
		System.out.println("-----------------------------------------");
		System.out.println("        <<< Anonymous Class >>>");
		System.out.println("-----------------------------------------");
	}

}
