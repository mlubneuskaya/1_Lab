package com.breakfast.food;


import com.breakfast.calories.CaloriesCalculator;

public class Apple extends Food {
    private String type;

    public Apple(String size) {
        super("apple");
        this.type = size;
    }

    public String toString() {
        return super.toString() + " size: " + type;
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
        CaloriesCalculator calculator = new CaloriesCalculator();
        return calculator.calculateItemCalories(this);
    }
}
