package com.company.animals;

public class Cat extends Animal{
    private String color;

    public Cat(String food, String location, String color){
        super(food, location);
        this.color = color;
    }

    @Override
    public void makeNoise(){
        System.out.println("Мяу!");
    }

    @Override
    public void eat(){
        System.out.printf("Ест %s как кошка\n", getFood());
    }

    @Override
    public String info(){
        return super.info() + String.format("Окрас: %s", color);
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
