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
        caloriesTable.put("Apple", jsonFileReader.getTable("Apple", new String[]{"size", "calories"}));
        caloriesTable.put("Sandwich", jsonFileReader.getTable("Sandwich", new String[]{"filling", "calories"}));
        caloriesTable.put("Cheese", jsonFileReader.getTable("Cheese", new String[]{"name", "calories"}));
        return caloriesTable;
    }
}
