package com.company.vehicles;

public enum Brand {
    BMW ("BMW"),
    Mercedes ("Mercedes-Benz"),
    Renault("Renault");

    private final String title;

    Brand(String title){
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
}
