package com.breakfast;

import java.util.HashMap;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Waiter waiter = new Waiter();
        List<Food> breakfast = waiter.getBreakfast(args);
        Counter counter = new Counter();
        HashMap<Food, Integer> listOfFood = counter.countFood(breakfast);
        for (Food piece: listOfFood.keySet()){
            System.out.println("Food type - " + piece + "; quantity: " + listOfFood.get(piece));
        }
    }
}
