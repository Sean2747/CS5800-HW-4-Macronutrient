package org.example;

public class CarbsFactory extends AbstractFoodFactory{
    private CarbsFactory() {}
    private static CarbsFactory instance;

    public static CarbsFactory getInstance() {
        if (instance == null) {
            instance = new CarbsFactory();
        }
        return instance;
    }
    public Food createFood(String name){
        return new Carbs(name);
    }
}
