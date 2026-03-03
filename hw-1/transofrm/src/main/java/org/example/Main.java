package org.example;

public class Main {
    public static void main(String[] args){
        Dog dog = new Dog(5, "George");
        System.out.printf("The dog is %d years old and its name is %s\n", dog.age, dog.name);
        Transformator transformator = new Transformator();
        Cat cat = transformator.transform(dog);
        System.out.printf("The cat is %d years old and its name is %s\n", cat.age, cat.name);
        System.out.println("=============================================");
    }
}
