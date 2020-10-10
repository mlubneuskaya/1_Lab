package com.breakfast.food;


import com.breakfast.calories.CaloriesCalculator;

import java.util.Objects;

@SuppressWarnings("unused")
public class Apple extends Food {
    private String type;

    public Apple(String size, CaloriesCalculator caloriesCalculator) {
        super("apple", caloriesCalculator);
        this.type = size;
    }

    public String toString() {
        return type + " " + super.toString();
    }



    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
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
        Apple apple = (Apple) o;
        return Objects.equals(type, apple.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), type);
    }
}
