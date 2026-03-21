package com.company;

import com.company.professions.Vet;
import com.company.animals.*;

public class Main {
    public static void main (String[] args){
        Vet pavlik = new Vet();
        Animal[] animals = new Animal[3];

        animals[0]= new Cat("Рыба", "Москва", "Голубой");
        animals[1]= new Dog("Кость", "Томск", "Двортерьер");
        animals[2] = new Horse("Морковь", "Ижевск", 10);

        for (Animal animal : animals){
            pavlik.treatAnimal(animal);
        }

    }
}