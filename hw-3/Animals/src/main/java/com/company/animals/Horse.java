package com.company.animals;

public class Horse extends Animal{
    private int age;

    public Horse(String food, String location, int age){
        super(food, location);
        this.age = age;
    }

    @Override
    public void makeNoise(){
        System.out.println("ФРРРРРРРРРР");
    }

    @Override
    public void eat(){
        System.out.printf("Ест %s как лошадь\n", getFood());
    }

    @Override
    public String info(){
        return super.info() + String.format("Возраст лошади: %s", age);
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
