package com.breakfast.food;

import com.breakfast.calories.CaloriesCalculator;

import java.util.Objects;

public abstract class Food implements Nutritious {
    private final String name;
    protected CaloriesCalculator caloriesCalculator;

    public Food(String type, CaloriesCalculator caloriesCalculator) {
        name = type;
        this.caloriesCalculator = caloriesCalculator;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Food food = (Food) o;
        return Objects.equals(name, food.name) &&
                Objects.equals(caloriesCalculator, food.caloriesCalculator);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
