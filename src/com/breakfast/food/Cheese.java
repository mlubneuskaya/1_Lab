package com.breakfast.food;

import com.breakfast.calories.CaloriesCalculator;

@SuppressWarnings("unused")
public class Cheese extends Food {

    public Cheese(CaloriesCalculator caloriesCalculator) {
        super("cheese", caloriesCalculator);
    }

    @Override
    public int calculateCalories() {
        return caloriesCalculator.calculateItemCalories(this);
    }
}
