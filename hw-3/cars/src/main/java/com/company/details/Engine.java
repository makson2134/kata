package com.company.details;

public class Engine {
    private int power;
    private String producer;

    public Engine(int power, String producer) {
        this.power = power;
        this.producer = producer;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }
}
