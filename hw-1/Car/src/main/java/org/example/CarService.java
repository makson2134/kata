package org.example;

public class CarService {
    void repairEngine(Car car){
        car.engine.durability = 100;
    }

    Engine findWorst(Car[] cars){
        Car worst = new Car("dead engine");
        for (Car c : cars){
            if (c.engine.durability < worst.engine.durability) {
                worst = c;
            }
        }
        return worst.engine;
    }
}
