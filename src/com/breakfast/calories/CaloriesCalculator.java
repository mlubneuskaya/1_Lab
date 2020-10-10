package com.breakfast.calories;

import com.breakfast.food.Food;

import java.util.List;
import java.util.Map;

public class CaloriesCalculator {
    private final Map<String, Map<String, Integer>> caloriesTable;

    public CaloriesCalculator(String jsonFilePath) {
        CaloriesTableGetter caloriesTableGetter = new CaloriesTableGetter(jsonFilePath);
        caloriesTable = caloriesTableGetter.getCaloriesTable();
    }

    public int calculateBreakfastCalories(List<Food> breakfast) {
        int calories = 0;
        for (Food food : breakfast) {
            calories += food.calculateCalories();
        }
        return calories;
    }

    public int calculateItemCalories(Food food) {
        Map<String, Integer> foodCaloriesTable = caloriesTable.get(food.getName());
        if (foodCaloriesTable.containsKey(food.getType())) {
            return foodCaloriesTable.get(food.getType());
        } else {
            System.out.println("Cannot calculate calories of " + food);
            return 0;
        }
    }
}
