package org.lab;

public class Car {
    private int id;
    private String brand;
    private int productionYear;
    private double price;
    private String color;
    private int registrationNumber;

    public Car() {
    }

    public Car(int id, String brand, int productionYear, double price, String color, int registrationNumber) {
        this.id = id;
        this.brand = brand;
        this.productionYear = productionYear;
        this.price = price;
        this.color = color;
        this.registrationNumber = registrationNumber;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getProductionYear() {
        return productionYear;
    }

    public void setProductionYear(int productionYear) {
        this.productionYear = productionYear;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(int registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", brand='" + brand + '\'' +
                ", production Year=" + productionYear +
                ", price=" + price +
                ", color='" + color + '\'' +
                ", registration Number=" + registrationNumber +
                '}';
    }
}
