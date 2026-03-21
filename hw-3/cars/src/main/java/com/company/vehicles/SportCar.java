package com.company.vehicles;

import com.company.details.Engine;
import com.company.professions.Driver;

public class SportCar extends Car{
    private int maxSpeed;

    public SportCar(Brand producer, Driver driver, Engine engine, int maxSpeed){
        super(producer, Type.SportCar, driver, engine);
        this.maxSpeed = maxSpeed;
    }

    public String toString(){
        return super.toString() + String.format("Максимальная скорость (км/ч): %s\n", maxSpeed);
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }
}


