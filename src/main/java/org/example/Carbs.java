package org.example;

public class Carbs implements Food{
    private String carbs;
    public Carbs(String carbs) {
        this.carbs = carbs;
    }
    @Override
    public String getName() {
        return carbs;
    }
}
