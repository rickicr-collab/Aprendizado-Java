package teste;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import domain.Car;

public class ComportamentoPorParametroTest03 {
	
	private static List<Car> cars = List.of(
			new Car("Green", 2012), new Car("Black", 2026), new Car("Red", 2015),
			new Car("Yellow", 2017), new Car("Blue", 2000), new Car("White", 2005)
			);
	
	
	public static void main(String[] args) {
		titulo();
		
		filter(cars, car -> car.getColor().equals("Green"));
		filter(cars, car -> car.getYear() < 2010);
		
		
	}
	
	
	public static <T> List<T> filter(List<T> list, Predicate<T> predicate){
		List<T> listFilter = new ArrayList<>(); 
		for (T  e: list) {
			if(predicate.test(e)) {
				listFilter.add(e);
			}
		}
		System.out.println("Lista Filtrada: " + listFilter);
		return listFilter;
	}
	
	public static void titulo() {
		System.out.println("-----------------------------------------");
		System.out.println("  <<< Paramentros Comportamentais >>>    ");
		System.out.println("-----------------------------------------");
	}

}
