package org.example;


public class Main {
    public static void main(String[] args) {
            Car bmw = new Car("m5");
            bmw.showEngine();

            bmw.move(2200);
            bmw.showEngine();

            CarService service = new CarService();
            service.repairEngine(bmw);
            bmw.showEngine();

            Car mercedes = new Car("amg 63");
            mercedes.move(1100);
            mercedes.showEngine();

            Car audi = new Car("A8");
            audi.move(3000);
            audi.showEngine();

            Car[] cars = new Car[3];
            cars[0] = bmw;
            cars[1] = audi;
            cars[2] = mercedes;
            System.out.printf("Cостояние худшего двигателя: %d\n", service.findWorst(cars).durability);
        }
    }
