package com.breakfast.food;


import java.util.Map;

public interface Nutritious {
    int calculateCalories(Map<String, Map<String, Integer>> caloriesTable);
}
