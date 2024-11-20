package org.example;
import java.util.*;

public class MacronutrientFactory {
    private List<String> carbsList = new ArrayList<>(Arrays.asList("cheese", "bread", "lentils", "pistachio"));
    private List<String> proteinsList = new ArrayList<>(Arrays.asList("fish", "chicken", "beef", "tofu"));
    private List<String> fatsList = new ArrayList<>(Arrays.asList("avocado", "sour cream", "tuna", "peanuts"));
    private static MacronutrientFactory instance;
    private CarbsFactory carbsFactory = CarbsFactory.getInstance();
    private ProteinFactory proteinFactory = ProteinFactory.getInstance();
    private FatsFactory fatsFactory = FatsFactory.getInstance();

    private MacronutrientFactory() {}

    public static MacronutrientFactory getInstance() {
        if (instance == null) {
            instance = new MacronutrientFactory();
        }
        return instance;
    }

    public Meal createMeal(Customer customer){
        Random random = new Random();
        String dietPlan = customer.getDietPlan();
        List<String> filteredCarbs = new ArrayList<>(carbsList);
        List<String> filteredProteins = new ArrayList<>(proteinsList);
        List<String> filteredFats = new ArrayList<>(fatsList);

        switch (dietPlan) {
            case "Paleo":
                filteredCarbs.removeIf(carb -> !carb.equals("pistachio"));
                filteredProteins.removeIf(protein -> protein.equals("tofu"));
                filteredFats.removeIf(fat -> fat.equals("cheese") || fat.equals("sour cream"));
                break;

            case "Vegan":
                filteredCarbs.removeIf(carb -> carb.equals("cheese"));
                filteredProteins.removeIf(protein -> protein.equals("fish") || protein.equals("chicken") || protein.equals("beef"));
                filteredFats.removeIf(fat -> fat.equals("tuna") || fat.equals("sour cream"));
                break;

            case "Nut Allergy":
                filteredCarbs.removeIf(carb -> carb.equals("pistachio"));
                filteredFats.removeIf(fat -> fat.equals("peanuts"));
                break;

            case "No Restriction":
            default:
                break;
        }

        String carb = filteredCarbs.get(random.nextInt(filteredCarbs.size()));
        String protein = filteredProteins.get(random.nextInt(filteredProteins.size()));
        String fats = filteredFats.get(random.nextInt(filteredFats.size()));

        return new Meal(customer, carbsFactory.createFood(carb), proteinFactory.createFood(protein), fatsFactory.createFood(fats));
    }
}
