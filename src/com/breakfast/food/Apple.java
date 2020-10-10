package com.breakfast.food;


import com.breakfast.calories.CaloriesCalculator;

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

    public boolean equals(Object object) {
        if (super.equals(object)) {
            return (this.getName().equals(((Food) object).getName()) &&
                    type.equals(((Apple) object).getType()));
        }
        return false;
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
}
