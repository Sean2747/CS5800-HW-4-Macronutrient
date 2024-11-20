package org.example;

public class Meal {
    private Food food1;
    private Food food2;
    private Food food3;
    private String customerName;
    private String dietPlan;

    Meal(Customer customer, Food food1, Food food2, Food food3) {
        this.food1 = food1;
        this.food2 = food2;
        this.food3 = food3;
        this.customerName = customer.getName();
        this.dietPlan = customer.getDietPlan();
    }

    public String getFood(){
        return customerName + "'s " + dietPlan + " meal: " + food1.getName() + ", " + food2.getName() + ", " + food3.getName();
    }
}
