package org.example;

public class FatsFactory extends AbstractFoodFactory{
    private static FatsFactory instance;
    private FatsFactory() {}

    public static FatsFactory getInstance() {
        if (instance == null) {
            instance = new FatsFactory();
        }
        return instance;
    }
    public Food createFood(String name){
        return new Fats(name);
    }
}
