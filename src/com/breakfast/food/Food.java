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
        return this.name;
    }

    public String toString() {
        return this.name;
    }
}
