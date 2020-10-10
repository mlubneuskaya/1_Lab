package com.breakfast.calories;

import com.breakfast.json.JSONFileReader;

import java.util.HashMap;
import java.util.Map;


public class CaloriesTableGetter {
    JSONFileReader jsonFileReader;

    public CaloriesTableGetter(String path) {
        jsonFileReader = new JSONFileReader(path);
    }

    public Map<String, Map<String, Integer>> getCaloriesTable() {
        Map<String, Map<String, Integer>> caloriesTable = new HashMap<>();
        caloriesTable.put("apple", jsonFileReader
                .readTableFromFile("apple"));
        caloriesTable.put("filling", jsonFileReader
                .readTableFromFile("filling"));
        caloriesTable.put("cheese", jsonFileReader
                .readTableFromFile("cheese"));
        return caloriesTable;
    }
}
