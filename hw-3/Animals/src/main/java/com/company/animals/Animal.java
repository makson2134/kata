package com.company.animals;

public class Animal {
    private String food;
    private String location;

    public Animal(String food, String location) {
        this.food = food;
        this.location = location;
    }

    public void makeNoise(){
        System.out.println("*издаёт некий звук*");
    }

    public void eat(){
        System.out.println("*ест*");
    }

    public void sleep(){
        System.out.println("*спит*");
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String info(){
        return String.format("Животное, проживающее по адресу: %s, ест %s\n", location, food);
    }
}
