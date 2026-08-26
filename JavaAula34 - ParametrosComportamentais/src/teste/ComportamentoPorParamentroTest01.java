package teste;

import java.util.ArrayList;
import java.util.List;

import domain.Car;

public class ComportamentoPorParamentroTest01 {

	public static void main(String[] args) {
		titulo();

		List<Car> listaCarros = List.of(new Car("Green", 2012), new Car("Black", 2026), new Car("Red", 2015));
		filterGreeenCars(listaCarros);
		filterRedCars(listaCarros);
		filterCarsByColor(listaCarros, "Black");
		filterCarsByYear(listaCarros, 2016);
	}

	public static List<Car> filterGreeenCars(List<Car> cars) {
		List<Car> greenList = new ArrayList<>();
		for (Car carros : cars) {
			if (carros.getColor().equals("Green")) {
				greenList.add(carros);
			}
		}
		System.out.println("Lista: " + greenList);
		return greenList;
	}
	
	public static List<Car> filterRedCars(List<Car> cars){
		List<Car> greenList = new ArrayList<>();
		for (Car carros : cars) {
			if (carros.getColor().equals("Red")){
				greenList.add(carros);
			}
		}
		System.out.println("Lista: " + greenList);
		return greenList;
	}
	
	public static List<Car> filterCarsByColor(List<Car> cars, String color){
		List<Car> filterCars = new ArrayList<>();
		for (Car car : cars) {
			if(car.getColor().equals(color)) {
				filterCars.add(car);
			}
		}
		System.out.println("Lista: " + filterCars);
		return filterCars;
	}
	
	public static List<Car> filterCarsByYear(List<Car> cars, int year){
		List<Car> filterCars = new ArrayList<>();
		for (Car car : cars) {
			if(car.getYear() < year) {
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
