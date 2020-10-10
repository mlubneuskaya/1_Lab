package com.breakfast.food;

public abstract class Food implements Nutritious {
    private final String name;

    public Food(String type) {
        name = type;
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
