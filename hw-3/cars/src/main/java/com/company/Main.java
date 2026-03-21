package com.company;

import com.company.details.Engine;
import com.company.professions.Driver;
import com.company.vehicles.*;

public class Main {
    static void main(){
        Driver mihalich = new Driver("Петров Иван Михайлович", 10);
        Driver petrovich = new Driver("Иванов Михаил Петрович", 5);

        Engine om457 = new Engine(700, "Mercedes");
        Engine s50 = new Engine(500, "Bmw");

        Car lorry = new Lorry(Brand.Mercedes, mihalich, om457, 100);
        SportCar sportCar = new SportCar(Brand.BMW, petrovich, s50, 300);

        System.out.println(lorry);
        System.out.println(sportCar);
    }
}
