package com.breakfast.food;

import com.breakfast.calories.CaloriesCalculator;

public abstract class Food implements Nutritious {
    private final String name;
    protected CaloriesCalculator caloriesCalculator;

    public Food(String type, CaloriesCalculator caloriesCalculator) {
        name = type;
        this.caloriesCalculator = caloriesCalculator;
    }

    public boolean equals(Object object) {
        return object instanceof Food;
    }

    public int hashCode() {
        return this.toString().hashCode();
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return name;
    }

    public String toString() {
        return name;
    }
}
