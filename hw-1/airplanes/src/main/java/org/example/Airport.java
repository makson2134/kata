package org.example;

public class Airport {
    int price;

    Airport(int price){
        this.price = price;
    }

    int refuel(Airplane airplane){
            int bill = (100 - airplane.fuel) * 100;
            airplane.fuel = 100;
            if (bill <= 0) { // airplane.fuel could be set more than 100 by accident
                return 0;
        }
            return bill;
    }

    String checkAge(Airplane airplane, int year){
        if (year - airplane.year >= 30){
            return("Самолёту пора в утиль");
        }
        return("Самолёт ещё полетает");
    }

    int countHeavyPlanes(Airplane[] airplanes){
        int count = 0;
        for (Airplane a : airplanes){
            if (a.weight > 50){
                count++;
            }
        }
        return count;
    }
}
