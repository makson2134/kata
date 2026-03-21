package com.company.vehicles;

import com.company.details.Engine;
import com.company.professions.Driver;

public class Car {
    private Brand producer;
    private Type type;
    private Driver driver;
    private Engine engine;

    public Car(Brand producer, Type type, Driver driver, Engine engine) {
        this.producer = producer;
        this.type = type;
        this.driver = driver;
        this.engine = engine;
    }

    public void start(){
        System.out.println("Поехали");
    }

    public void stop(){
        System.out.println("Останавливаемся");
    }

    public void turnRight(){
        System.out.println("Поворот направо");
    }

    public void turnLeft(){
        System.out.println("Поворот налево");
    }

    @Override
    public String toString(){
        return String.format("""
                        Марка: %s, тип: %s
                        Водитель: %s, стаж водителя: %s
                        Проивзодитель двигателя: %s, мощность двигателя: %s
                        """,
                this.producer, this.type, this.driver.getFullName(), this.driver.getDriverExperience(), this.engine.getProducer(), this.engine.getPower());
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public Brand getProducer() {
        return producer;
    }

    public void setProducer(Brand producer) {
        this.producer = producer;
    }
}
