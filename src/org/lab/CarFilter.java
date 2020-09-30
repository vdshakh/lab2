package org.lab;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CarFilter {
    public static List<Car> filterByBrand(List<Car> cars, String brand){
        List<Car> result = new ArrayList<>();
        for(Car vehicle: cars){
            if(vehicle.getBrand().equalsIgnoreCase(brand))
                result.add(vehicle);
        }
        return result;
    }

    public static List<Car> filterByBrandAndYear(List<Car> cars, String brand, int year){
        List<Car> result = new ArrayList<>();
        for(Car vehicle: cars){
            if((2020 - vehicle.getProductionYear() > year) && vehicle.getBrand().equalsIgnoreCase(brand))
                result.add(vehicle);
        }
        return result;
    }

    public static List<Car> filterByYearAndPrice(List<Car> cars, int year, double price){
        return cars.stream()
                .filter(car -> (car.getPrice() > price && car.getProductionYear() == year))
                .collect(Collectors.toList());
    }
}
