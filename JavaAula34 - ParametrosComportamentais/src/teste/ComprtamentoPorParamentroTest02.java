package teste;

import java.util.ArrayList;
import java.util.List;

import domain.Car;
import interfaces.CarPredicate;

public class ComprtamentoPorParamentroTest02 {
	
	public static void main(String[] args) {
		titulo();
		
		List<Car> listaCarros = List.of(
				new Car("Green", 2012), new Car("Black", 2026), new Car("Red", 2015),
				new Car("Yellow", 2017), new Car("Blue", 2000), new Car("White", 2005)
				);
		
		filter(listaCarros, new CarPredicate() {
			@Override
			public boolean test(Car car) {
				return car.getColor().equals("Black");
			}
		});
		
		filter(listaCarros, new CarPredicate() {
			@Override
			public boolean test(Car car) {
				return car.getYear() < 2015;
			}
			
		});
		
	}
	
	public static List<Car> filter(List<Car> cars, CarPredicate carPredicate){
		List<Car> filterCars = new ArrayList<>();
		for (Car car : cars) {
			if(carPredicate.test(car)) {
				filterCars.add(car);
			}
		}
		System.out.println("Lista: " + filterCars);
		return filterCars;
	}
	
	public static void titulo() {
		System.out.println("-----------------------------------------");
		System.out.println("  <<< Paramentros Comportamentais >>>    ");
		System.out.println("-----------------------------------------");
	}

}
