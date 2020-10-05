package com.breakfast.food;


import java.util.HashMap;

public interface Nutritious {
    int calculateCalories(HashMap<FoodType, HashMap<String, Integer>> caloriesTable);
}
