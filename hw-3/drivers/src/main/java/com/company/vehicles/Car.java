package com.company.vehicles;

import com.company.details.Engine;
import com.company.professions.Driver;

public class Car {
    protected String brand;
    protected String type;
    protected int weight;

    protected com.company.professions.Driver driver;
    protected com.company.details.Engine engine;

    public Car(Engine engine, Driver driver, int weight, String type, String brand) {
        this.engine = engine;
        this.driver = driver;

        this.weight = weight;
        this.type = type;
        this.brand = brand;
    }


    public Engine getEngine() {
        return engine;
    }

    public Driver getDriver() {
        return driver;
    }

    public int getWeight() {
        return weight;
    }

    public String getType() {
        return type;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    /*
    Методы start(), stop(), turnRight(), turnLeft(), которые выводят на печать: "Поехали",
    "Останавливаемся", "Поворот направо" или "Поворот налево". А также метод toString(),
     который выводит полную информацию об автомобиле, ее водителе и моторе.
     */

    public void start(){
        System.out.println("Поехали");
    }

    public void stop(){
        System.out.println("Останавливаемся");
    }

    public void turnLeft(){
        System.out.println("Поворот направо");
    }
    public void turnRight(){
        System.out.println("Поворот налево");
    }

    public String toString(){
        StringBuilder builder = new StringBuilder();
        builder.
        return
    }
}
