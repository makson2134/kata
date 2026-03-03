package org.example;

public class Transformator {
    public Cat transform(Dog dog){
        Cat cat = new Cat();
        cat.age = dog.age;
        cat.name = dog.name;
        return cat;
    }
}



