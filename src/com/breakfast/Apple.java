package com.breakfast;

public class Apple extends Food {
    private final String size;

    public Apple(FoodType type, String size) {
        super(type);
        this.size = size;
    }
    public String toString(){
        return super.toString() + " size: " + size;
    }
}
