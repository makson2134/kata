package com.company.animals;

public class Dog extends Animal {
    private String breed;

    public Dog(String food, String location, String breed){
        super(food, location);
        this.breed = breed;
    }

    @Override
    public void makeNoise(){
        System.out.println("Гав!");
    }

    @Override
    public void eat(){
        System.out.printf("Ест %s как собака\n", getFood());
    }

    @Override
    public String info(){
        return super.info() + String.format("Порода: %s", breed);
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }
}
