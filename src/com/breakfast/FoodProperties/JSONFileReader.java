package com.breakfast.FoodProperties;

import com.breakfast.FoodType;
import org.json.JSONArray;
import org.json.JSONObject;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Scanner;

public class JSONFileReader {
    private final String JSON;
    JSONFileReader(String path){
        File file = new File(path);
        Scanner scanner = null;
        try {
            scanner = new Scanner(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        StringBuilder builder = new StringBuilder();
        while(true){
            assert scanner != null;
            if (!scanner.hasNext()) break;
            builder.append(scanner.nextLine());
        }
        JSON = builder.toString();
    }
    public HashMap<String, Integer> getTable(FoodType foodType, String[] parameters){
        HashMap<String, Integer> caloriesTable = new HashMap<>();
        JSONObject jsonObject = new JSONObject(JSON);
        JSONArray properties = jsonObject.getJSONArray(foodType.toString());
        for(int i = 0; i < properties.length(); i++){
            caloriesTable.put(properties.getJSONObject(i).getString(parameters[0]),
                    properties.getJSONObject(i).getInt(parameters[1]));
        }
        return caloriesTable;
    }
}
