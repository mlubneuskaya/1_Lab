package com.breakfast.food;

import com.breakfast.calories.CaloriesCalculator;

public class Filling extends Food {
    private final String type;

    public Filling(String type) {
        super("filling");
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
        CaloriesCalculator calculator = new CaloriesCalculator();
        return calculator.calculateItemCalories(this);
    }
}
