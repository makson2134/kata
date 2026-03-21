package com.company.vehicles;

public enum Type {
    Car("Car"),
    Lorry("Lorry"),
    SportCar("Sport car");

    private final String title;

    Type(String title){
        this.title = title;
    }

    public String getTitle(){
        return title;
    }

}
