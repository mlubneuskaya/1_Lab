package com.breakfast;

import com.breakfast.FoodProperties.CaloriesTableGetter;

import java.util.HashMap;
import java.util.List;

public class CaloriesCalculator {
    public int calculateCalories (String jsonFilePath, List<Food> breakfast){
        CaloriesTableGetter caloriesTableGetter = new CaloriesTableGetter(jsonFilePath);
        HashMap<FoodType, HashMap<String, Integer>> caloriesTable = caloriesTableGetter.getCaloriesTable();
        int calories = 0;
        for(Food food: breakfast){
            calories += food.calculateCalories(caloriesTable);
        }
        return calories;
    }
}
