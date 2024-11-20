package org.example;

public class ProteinFactory extends AbstractFoodFactory{
    private static ProteinFactory instance;
    private ProteinFactory() {}

    public static ProteinFactory getInstance() {
        if (instance == null) {
            instance = new ProteinFactory();
        }
        return instance;
    }
    public Food createFood(String name){
        return new Protein(name);
    }
}
