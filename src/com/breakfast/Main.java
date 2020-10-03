package com.breakfast;

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
        }
    }
}
