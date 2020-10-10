package com.breakfast;

import com.breakfast.calories.CaloriesCalculator;
import com.breakfast.food.Food;

import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Parser parser = new Parser();
        List<Food> breakfast = parser.parseCommandLineArguments(args);
        for (String arg : args) {
            if (arg.equals("-calories")) {
                String jsonPath = "resources/FoodProperties.json";
                CaloriesCalculator.setCaloriesTable(jsonPath);
                CaloriesCalculator caloriesCalculator = new CaloriesCalculator();
                System.out.println("number of calories in breakfast: " +
                        caloriesCalculator.calculateBreakfastCalories(breakfast));
            }
            else if (arg.equals("-sort")) {
                breakfast.sort(new Comparator<>() {
                    @Override
                    public int compare(Food food1, Food food2) {
                        return ((food1.getName().length()
                                - food2.getName().length()));
                    }
                });
                for (Food food : breakfast) {
                    System.out.println(food);
                }
            }
        }
    }
}