package com.breakfast.food;

import com.breakfast.calories.CaloriesCalculator;

import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Filling filling = (Filling) o;
        return Objects.equals(type, filling.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), type);
    }
}
