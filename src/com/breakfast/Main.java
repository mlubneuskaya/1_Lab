package com.breakfast;

import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Parser parser = new Parser();
        List<Food> breakfast = parser.parseCommandLineArguments(args);
        for(String arg: args){
            if(arg.equals("-calories")){
                String jsonPath =
                        "/home/maria/IdeaProjects/Breakfast/src/com/breakfast/FoodProperties/FoodProperties.json";
                CaloriesCalculator caloriesCalculator = new CaloriesCalculator();
                System.out.println("number calories in breakfast: " +
                        caloriesCalculator.calculateCalories(jsonPath, breakfast));
            }
            if(arg.equals("-sort")){
                breakfast.sort(new Comparator<>() {
                    @Override
                    public int compare(Food food1, Food food2) {
                        return ((food1.getClass().getDeclaredFields().length
                                - food2.getClass().getDeclaredFields().length));
                    }
                });
                for (Food food: breakfast){
                    System.out.println(food);
                }
            }
        }
    }
}
