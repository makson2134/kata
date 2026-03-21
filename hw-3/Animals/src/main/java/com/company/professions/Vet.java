package com.company.professions;

import com.company.animals.Animal;

public class Vet {
    public void treatAnimal(Animal animal){
        animal.eat();
        animal.makeNoise();
        animal.sleep();
        System.out.println("=======================================================================");
        System.out.printf("Заключение врача о животном: \n%s\n", animal.info());
        System.out.println("=======================================================================");
    }
}
