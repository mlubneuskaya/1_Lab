package com.breakfast.food;

import com.breakfast.calories.CaloriesCalculator;

@SuppressWarnings("unused")
public class Cheese extends Food {

    public Cheese(CaloriesCalculator caloriesCalculator) {
        super("cheese", caloriesCalculator);
    }

    public boolean equals(Object object) {
        if (super.equals(object)) {
            return this.getName().equals(((Food) object).getName());
        }
        return false;
    }

    @Override
    public int calculateCalories() {
        return caloriesCalculator.calculateItemCalories(this);
    }
}
