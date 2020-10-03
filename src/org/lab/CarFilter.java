package org.lab;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CarFilter {
    /*public static List<Car> filterByBrand(List<Car> cars, String brand){
        List<Car> result = new ArrayList<>();
        for(Car vehicle: cars){
            if(vehicle.getBrand().equalsIgnoreCase(brand))
                result.add(vehicle);
        }
        return result;
    }*/

    public static List<Car> filterByBrand(List<Car> cars, String brand){
        return cars.stream() //list.stream()
                .filter(car -> (car.getBrand().equalsIgnoreCase(brand))) //filter(Predicate predicate)
                .collect(Collectors.toList()); //collect(Collector collector)
    }

    /*public static List<Car> filterByBrandAndExploitationDuration(List<Car> cars, String brand, int year){
        List<Car> result = new ArrayList<>();
        for(Car vehicle: cars){
            if((2020 - vehicle.getProductionYear() > year) && vehicle.getBrand().equalsIgnoreCase(brand))
                result.add(vehicle);
        }
        return result;
    }*/

    public static List<Car> filterByBrandAndExploitationDuration(List<Car> cars, String brand, int year){
        return cars.stream() //list.stream()
                .filter(car -> (car.getProductionYear() > year) && car.getBrand().equalsIgnoreCase(brand)) //filter(Predicate predicate)
                .collect(Collectors.toList()); //collect(Collector collector)
    }

    public static List<Car> filterByProductionYearAndPrice(List<Car> cars, int year, double price){
        return cars.stream()
                .filter(car -> (car.getPrice() > price && car.getProductionYear() == year))
                .collect(Collectors.toList());
    }
}
