package test;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.lab.Car;
import org.lab.CarFilter;

import java.util.ArrayList;
import java.util.List;

public class CarFilterTest {
    private List<Car> cars;

    private Car car1;
    private Car car2;
    private Car car3;
    private Car car4;
    private Car car5;
    private Car car6;
    private Car car7;

    @BeforeEach
    void initialize(){
        car1 = new Car(1, "Renault", 2012, 10000, "Yellow", 124252);
        car2 = new Car(2, "Mazda", 2020, 30000, "Green", 126638);
        car3 = new Car(3, "Zhigul", 1979, 500, "Black", 5473);
        car4 = new Car(4, "Volvo", 2009, 11000, "White", 15752);
        car5 = new Car(5, "Skoda", 2006, 5500, "Blue", 124000);
        car6 = new Car(6, "Skoda", 2015, 16800, "Red", 174012);
        car7 = new Car(7, "Skoda", 2009, 7300, "White", 6740700);

        cars = new ArrayList<>();
        cars.add(car1);
        cars.add(car2);
        cars.add(car3);
        cars.add(car4);
        cars.add(car5);
        cars.add(car6);
        cars.add(car7);
    }

    @Test
    void filterByBrandTest(){
        System.out.println("----Filter By Brand Test----\n");

        System.out.println("Step 1\n");
        CarFilter.filterByBrand(cars, "Skoda")
                .forEach(System.out::println);

        car1.setBrand("Skoda");

        System.out.println("\nStep 2\n");
        CarFilter.filterByBrand(cars, "Skoda")
                .forEach(System.out::println);

        car5.setBrand("Mazda");
        car7.setBrand("Honda");
        car1.setBrand("Lexus");

        System.out.println("\nStep 3 \n");
        CarFilter.filterByBrand(cars, "Skoda")
                .forEach(System.out::println);
    }

    @Test
    void filterByBrandAndExploitationDurationTest(){
        System.out.println("----Filter By Brand And Exploitation Duration Test ----\n");

        System.out.println("Step 1\n");
        CarFilter.filterByBrandAndExploitationDuration(cars, "Skoda", 10)
                .forEach(System.out::println);

        car7.setProductionYear(2012);

        System.out.println("\nStep 2\n");
        CarFilter.filterByBrandAndExploitationDuration(cars, "Skoda", 10)
                .forEach(System.out::println);

        car1.setBrand("Skoda");
        car1.setProductionYear(2006);

        System.out.println("\nStep 3\n");
        CarFilter.filterByBrandAndExploitationDuration(cars, "Skoda", 10)
                .forEach(System.out::println);

    }

    @Test
    void filterByProductionYearAndPriceTest(){
        System.out.println("----Filter By By Production Year And Price Test ----\n");

        System.out.println("Step 1\n");
        CarFilter.filterByProductionYearAndPrice(cars,  2009, 7200)
                .forEach(System.out::println);

        System.out.println("\nStep 2\n");
        CarFilter.filterByProductionYearAndPrice(cars,  2009, 7400) //changed price
                .forEach(System.out::println);

        car7.setPrice(7401);
        car2.setProductionYear(2009);

        System.out.println("\nStep 3\n");
        CarFilter.filterByProductionYearAndPrice(cars,  2009, 7400)
                .forEach(System.out::println);
    }
}
