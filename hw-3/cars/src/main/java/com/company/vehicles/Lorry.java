package com.company.vehicles;

import com.company.details.Engine;
import com.company.professions.Driver;

public class Lorry extends Car{
    private int carryingWeight;

    public Lorry(Brand producer, Driver driver, Engine engine, int carryingWeight){
        super(producer, Type.Lorry, driver, engine);
        this.carryingWeight = carryingWeight;
    }

    @Override
    public String toString(){
        return super.toString() + String.format("Грузоподъёмность: %s(кг)\n", carryingWeight);
    }

    public int getCarryingWeight() {
        return carryingWeight;
    }

    public void setCarryingWeight(int carryingWeight) {
        this.carryingWeight = carryingWeight;
    }
}
