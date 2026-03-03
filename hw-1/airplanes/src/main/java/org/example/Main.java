package org.example;


public class Main {
    public static void main(String[] args) {
        Airplane Tu228 = new Airplane("Туполев", 1980, 200, 100);
        Airplane F1337 = new Airplane("Lockheed Martin", 2015, 50, 47);
        Airplane A3333 = new Airplane("Airbus", 2002, 100, 96);

        Tu228.fuel = 50;
        F1337.fuel = 30;

        Tu228.info();
        F1337.info();
        A3333.info();

        Airport airport = new Airport(56);

        System.out.printf("Понадобилось %d рублей для заправки самолёта марки %s\n", airport.refuel(Tu228), Tu228.producer);
        System.out.printf("Понадобилось %d рублей для заправки самолёта марки by %s\n", airport.refuel(F1337), F1337.producer);
        System.out.printf("Понадобилось %d рублей для заправки самолёта марки %s\n", airport.refuel(A3333), A3333.producer);

        Tu228.info();
        F1337.info();
        A3333.info();

        System.out.printf("Проврка возраста самолёта марки %s: %s\n", Tu228.producer, airport.checkAge(Tu228, 2026));
        System.out.printf("Проврка возраста самолёта марки %s: %s\n", F1337.producer, airport.checkAge(F1337, 2026));
        System.out.printf("Проврка возраста самолёта марки %s: %s\n", A3333.producer, airport.checkAge(A3333, 2026));

        Airplane[] planes = new Airplane[3];
        planes[0] = Tu228;
        planes[1] = F1337;
        planes[2] = A3333;
        System.out.printf("Из представленных самолётов %d имеют массу свыше 50 тонн", airport.countHeavyPlanes(planes));
    }
}