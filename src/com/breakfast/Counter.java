package com.breakfast;

import com.breakfast.food.Food;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Counter {
    public Map<Food, Integer> countFood (List<Food> breakfast){
        Map<Food, Integer> listOfFood = new HashMap<>();
        for(Food piece: breakfast){
            if(!listOfFood.containsKey(piece)){
                listOfFood.put(piece, 1);
            }else{
                listOfFood.replace(piece, listOfFood.get(piece)+1);
            }
        }
        return listOfFood;
    }
}
