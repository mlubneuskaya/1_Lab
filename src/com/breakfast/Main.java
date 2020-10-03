package com.breakfast;

import com.breakfast.FoodProperties.CaloriesTableGetter;

import java.util.HashMap;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String jsonPath = "/home/maria/IdeaProjects/Breakfast/src/com/breakfast/FoodProperties/FoodProperties.json";
        CaloriesTableGetter caloriesTableGetter = new CaloriesTableGetter(jsonPath);
        HashMap<FoodType, HashMap<String, Integer>> caloriesTable = caloriesTableGetter.getCaloriesTable();
        Parser parser = new Parser();
        List<Food> breakfast = parser.parseCommandLineArguments(args);
        Counter counter = new Counter();
        HashMap<Food, Integer> listOfFood = counter.countFood(breakfast);
        int breakfastCalories = 0;
        for (Food piece: listOfFood.keySet()){
            System.out.println("Food type - " + piece + "; quantity: " + listOfFood.get(piece));
            breakfastCalories += piece.calculateCalories(caloriesTable) * listOfFood.get(piece);
        }
        System.out.println(breakfastCalories);
    }
}
