package org.example;

public class Airplane {
    String producer;
    int year;
    int length; // meters
    int weight; // tons
    int fuel = 100; // liters

    Airplane(String producer, int year, int length, int weight){
        this.producer = producer;
        this.year = year;
        this.length = length;
        this.weight = weight;
    }

    void info(){
        System.out.printf("Изготовитеель: %s, год выпуска: %d, длина: %d," +
                " вес: %d, количество топлива в баке: %d\n", producer, year, length, weight, fuel);
    }


}
