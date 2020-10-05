package com.breakfast.calories;

import com.breakfast.food.Food;


import java.util.List;
import java.util.Map;

public class CaloriesCalculator {
    public int calculateCalories (String jsonFilePath, List<Food> breakfast){
        CaloriesTableGetter caloriesTableGetter = new CaloriesTableGetter(jsonFilePath);
        Map<String, Map<String, Integer>> caloriesTable = caloriesTableGetter.getCaloriesTable();
        int calories = 0;
        for(Food food: breakfast){
            calories += food.calculateCalories(caloriesTable);
        }
        return calories;
    }
}
