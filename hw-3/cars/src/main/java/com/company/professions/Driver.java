package com.company.professions;

public class Driver extends Person {
    private int driverExperience;

    public Driver(String fullName, int driverExperience) {
        super(fullName);
        this.driverExperience = driverExperience;
    }

    public int getDriverExperience() {
        return driverExperience;
    }

    public void setDriverExperience(int driverExperience) {
        this.driverExperience = driverExperience;
    }
}
