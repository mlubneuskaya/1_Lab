package com.breakfast.food;

import com.breakfast.calories.CaloriesCalculator;

public class Filling extends Food {
    private final String type;

    public Filling(String type, CaloriesCalculator caloriesCalculator) {
        super("filling", caloriesCalculator);
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public String toString() {
        return type;
    }

    @Override
    public int calculateCalories() {
        return caloriesCalculator.calculateItemCalories(this);
    }
}
