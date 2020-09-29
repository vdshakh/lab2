package org.lab;

import java.util.ArrayList;
import java.util.List;

public class FiltersOfCar {
    public static List<Car> filterByBrand(List<Car> cars, String brand){
        List<Car> filter = new ArrayList<>();
        for(Car vehicle: cars){
            if(vehicle.getBrand().equalsIgnoreCase(brand)) filter.add(vehicle);
        }
        return filter;
    }

    public static List<Car> filterByBrandAndYear(List<Car> cars, String brand, int year){
        List<Car> filter = new ArrayList<>();
        for(Car vehicle: cars){
            if((2020 - vehicle.getProductionYear() > year) && vehicle.getBrand().equalsIgnoreCase(brand)) filter.add(vehicle);
        }
        return filter;
    }
}
