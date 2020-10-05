package com.breakfast.food;


import java.util.Map;

public interface Nutritious {
    int calculateCalories(Map<FoodType, Map<String, Integer>> caloriesTable);
}
