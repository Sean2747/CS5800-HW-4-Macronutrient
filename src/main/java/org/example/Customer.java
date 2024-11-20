package org.example;

public class Customer {
    private String name;
    private String dietPlan;

    Customer(String name, String dietPlan) {
        this.name = name;
        this.dietPlan = dietPlan;
    }

    public String getName() {
        return name;
    }

    public String getDietPlan() {
        return dietPlan;
    }

}
