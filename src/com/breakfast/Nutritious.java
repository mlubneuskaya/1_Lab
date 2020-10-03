package com.breakfast;

import java.util.HashMap;

public interface Nutritious {
    public int calculateCalories(HashMap<FoodType, HashMap<String, Integer>> caloriesTable);
}
