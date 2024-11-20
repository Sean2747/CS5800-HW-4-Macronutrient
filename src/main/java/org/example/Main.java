package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println();
        MacronutrientFactory mealFactory = MacronutrientFactory.getInstance();
        Customer customer1 = new Customer("Sean", "No Restriction");
        Customer customer2 = new Customer("Gio", "Nut Allergy");
        Customer customer3 = new Customer("Han", "Vegan");
        Customer customer4 = new Customer("Coco", "Paleo");
        Customer customer5 = new Customer("Daniel", "No Restriction");
        Customer customer6 = new Customer("Arriana", "Vegan");

        Meal meal1 = mealFactory.createMeal(customer1);
        Meal meal2 = mealFactory.createMeal(customer2);
        Meal meal3 = mealFactory.createMeal(customer3);
        Meal meal4 = mealFactory.createMeal(customer4);
        Meal meal5 = mealFactory.createMeal(customer5);
        Meal meal6 = mealFactory.createMeal(customer6);

        System.out.println(meal1.getFood());
        System.out.println(meal2.getFood());
        System.out.println(meal3.getFood());
        System.out.println(meal4.getFood());
        System.out.println(meal5.getFood());
        System.out.println(meal6.getFood());
    }
}